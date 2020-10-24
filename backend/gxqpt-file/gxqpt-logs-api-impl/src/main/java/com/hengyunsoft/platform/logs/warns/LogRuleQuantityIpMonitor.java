package com.hengyunsoft.platform.logs.warns;

import com.hengyunsoft.platform.logs.dto.LogCommonDTO;
import com.hengyunsoft.platform.logs.dto.LogIdDTO;
import com.hengyunsoft.platform.logs.entity.logs.po.LogWarnRule;
import com.hengyunsoft.platform.logs.utils.RedisUtils;
import com.hengyunsoft.platform.logs.utils.SerializeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;

@Component
@Slf4j
public class LogRuleQuantityIpMonitor extends LogRuleBaseMonitor implements Serializable {
    private LogWarnRule rule;
    private List<LogIdDTO> list;
    private List<LogIdDTO> samelist;
    private Date maxLogTime;

    public LogWarnRule getRule(){
        return rule;
    }
    public void setRule(LogWarnRule rule){
        this.rule=rule;
    }

    public List<LogIdDTO> getList(){
        return list;
    }
    public void setList(List<LogIdDTO> list){
        this.list= list;
    }

    @Override
    public void put(LogCommonDTO logCommonDTO,RedisUtils redisUtil) {
        maxLogTime = logCommonDTO.getLogTime();
        //判断该条日志是不是符合这条规则
        if(!filter(logCommonDTO)){
            return;
        }
        //移除过时的数据
        checkInvalidate(logCommonDTO);
        //存入缓存
        if(list.size()>0){
            redisUtil.set(rule.getId()+"", SerializeUtil.serialize(list));
        }

        if(trigWarn(logCommonDTO)){//判断是不是满足设置告警规则
            sendWarnQuantity(logCommonDTO,rule,samelist);//触发告警
        }
    }

    @Override
    public boolean filter(LogCommonDTO logCommonDTO) {
        //如果ip为null直接返回
        if(null==logCommonDTO.getIp() || logCommonDTO.getIp().trim().equals("") || logCommonDTO.getIp().trim().toLowerCase().equals("null")){
            return false;
        }
        //appId不一致，直接返回
        if (!rule.getAppId().equals(logCommonDTO.getAppId())) {
            return false;
        }
        //应用系统日志，直接返回
        if ("APP".equals(logCommonDTO.getLogType())) {
            return false;
        }

        //日志级别不一致，直接返回
        if (!rule.getLogType().equals(logCommonDTO.getLogType())) {
            return false;
        }

        LogIdDTO logIdEntity = new LogIdDTO();
        logIdEntity.setId(logCommonDTO.getId());
        logIdEntity.setLogTime(logCommonDTO.getLogTime());
        logIdEntity.setIp(logCommonDTO.getIp());
        list.add(logIdEntity);
        return true;
    }

    @Override
    public boolean checkInvalidate(LogCommonDTO logCommonDTO) {
        if(list == null || list.size()==0 || list.size() == 1) {
            return true;
        }
        /**
         * 移除时间间隔外的数据
         */
        Calendar c = Calendar.getInstance();
        c.setTime(maxLogTime);//设置时间
        c.add(Calendar.MINUTE, (int) -rule.getQuantityTimeInterval());//这句就是所设置的时间减去一天,第二个参数为正是加,为负就是减
        Date yminDate = c.getTime();//此时间为日志保留最小时间，小于此时间的日志数据都应被清除
        for (int j = list.size() - 1; j > -1; j--) {
            if (yminDate.compareTo(list.get(j).getLogTime()) > 0) {//此条日志时间小于日志保留最小时间，需要清除
                list.remove(j);
            }
        }
        return true;
    }

    @Override
    public boolean trigWarn(LogCommonDTO logCommonDTO) {
        if(list == null || list.size() ==0) {
            return false;
        }
        if(null==logCommonDTO.getIp()){
            return false;
        }
        //判断某个ip在固定的时间断内出现次数大于规定次数
        int ipTotal = 0;
        samelist= new ArrayList<LogIdDTO>();
        for(int k=0;k<list.size();k++){
            if(logCommonDTO.getIp().equals(list.get(k).getIp())){
                samelist.add(list.get(k));
                ipTotal=ipTotal+1;
            }
        }
        if(ipTotal>=rule.getQuantityUpperLimit()){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "LogRuleQuantityMonitor{" +
                "rule='" + rule.toString() + '\'' +
                ", list='" + list.toString() + '\'' +
                '}';
    }
}
