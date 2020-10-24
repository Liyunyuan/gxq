package com.hengyunsoft.platform.supervise.entity.po;

import com.hengyunsoft.validator.ValidatorGroups.MustNoneNull;
import com.hengyunsoft.validator.annotation.FieldDesc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Data
@ApiModel(value = "DataStorageSupervise", description = "")
public class DataStorageSupervise extends com.hengyunsoft.base.entity.BaseEntity<Long> implements Serializable {
    @Range(min=Long.MIN_VALUE,max=Long.MAX_VALUE)
    @NotNull(groups=MustNoneNull.class)
    private Long id;

    /**
     * 应用ID
     *
     * @mbggenerated
     */
    @FieldDesc("应用ID")
    @ApiModelProperty(value = "应用ID")
    @Length(max=64)
    private String appId;

    /**
     * 应用/服务类型： 1 应用   2服务   3既是应用也是服务
     *
     * @mbggenerated
     */
    @FieldDesc("应用/服务类型： 1 应用   2服务   3既是应用也是服务")
    @ApiModelProperty(value = "应用/服务类型： 1 应用   2服务   3既是应用也是服务")
    @Range(min=Short.MIN_VALUE,max=Short.MAX_VALUE)
    private Short appType;

    /**
     * 数据库空间数量
     *
     * @mbggenerated
     */
    @FieldDesc("数据库空间数量")
    @ApiModelProperty(value = "数据库空间数量")
    @Range(min=Long.MIN_VALUE,max=Long.MAX_VALUE)
    private Double dbSpaceNum;

    /**
     * 日志空间数量
     *
     * @mbggenerated
     */
    @FieldDesc("日志空间数量")
    @ApiModelProperty(value = "日志空间数量")
    @Range(min=Long.MIN_VALUE,max=Long.MAX_VALUE)
    private Double logSpaceNum;

    /**
     * 文件空间数量
     *
     * @mbggenerated
     */
    @FieldDesc("文件空间数量")
    @ApiModelProperty(value = "文件空间数量")
    @Range(min=Long.MIN_VALUE,max=Long.MAX_VALUE)
    private Double fileSpaceNum;

    /**
     * 数据库空间阀值
     *
     * @mbggenerated
     */
    @FieldDesc("数据库空间阀值")
    @ApiModelProperty(value = "数据库空间阀值")
    @Range(min=Long.MIN_VALUE,max=Long.MAX_VALUE)
    private Double dbSpaceLimit;

    /**
     * 日志空间阀值
     *
     * @mbggenerated
     */
    @FieldDesc("日志空间阀值")
    @ApiModelProperty(value = "日志空间阀值")
    @Range(min=Long.MIN_VALUE,max=Long.MAX_VALUE)
    private Double logSpaceLimit;

    /**
     * 文件空间阀值
     *
     * @mbggenerated
     */
    @FieldDesc("文件空间阀值")
    @ApiModelProperty(value = "文件空间阀值")
    @Range(min=Long.MIN_VALUE,max=Long.MAX_VALUE)
    private Double fileSpaceLimit;

    /**
     * 文件空间地址
     *
     * @mbggenerated
     */
    @FieldDesc("文件空间地址")
    @ApiModelProperty(value = "文件空间地址")
    @Length(max=200)
    private String fileSpaceUrl;

    /**
     * 日志空间地址
     *
     * @mbggenerated
     */
    @FieldDesc("日志空间地址")
    @ApiModelProperty(value = "日志空间地址")
    @Length(max=200)
    private String logSpaceUrl;

    /**
     * 数据库空间地址
     *
     * @mbggenerated
     */
    @FieldDesc("数据库空间地址")
    @ApiModelProperty(value = "数据库空间地址")
    @Length(max=200)
    private String dbSpaceUrl;

    /**
     * 责任人:单个
     *
     * @mbggenerated
     */
    @FieldDesc("责任人:单个")
    @ApiModelProperty(value = "责任人:单个")
    @Length(max=32)
    private String dutyUser;

    /**
     * 确认人:多个,逗号隔开
     *
     * @mbggenerated
     */
    @FieldDesc("确认人:多个,逗号隔开")
    @ApiModelProperty(value = "确认人:多个,逗号隔开")
    @Length(max=2147483647)
    private String confirmUser;

    /**
     * 抄送人:多个,逗号隔开
     *
     * @mbggenerated
     */
    @FieldDesc("抄送人:多个,逗号隔开")
    @ApiModelProperty(value = "抄送人:多个,逗号隔开")
    @Length(max=2147483647)
    private String copyUser;

    /**
     * 执行定时时间
     *
     * @mbggenerated
     */
    @FieldDesc("执行定时时间")
    @ApiModelProperty(value = "执行定时时间")
    private Date scheduledTime;

    /**
     * 监管类型
     *
     * @mbggenerated
     */
    @FieldDesc("监管类型")
    @ApiModelProperty(value = "监管类型")
    @Range(min=Short.MIN_VALUE,max=Short.MAX_VALUE)
    private Short superviseType;

    /**
     * 提醒方式 消息:1,短信:2
     *
     * @mbggenerated
     */
    @FieldDesc("提醒方式 消息:1,短信:2")
    @ApiModelProperty(value = "提醒方式 消息:1,短信:2")
    @Range(min=Short.MIN_VALUE,max=Short.MAX_VALUE)
    private Short remindType;

    /**
     * 运行状态 启用:true 禁用:false
     *
     * @mbggenerated
     */
    @FieldDesc("运行状态 启用:true 禁用:false")
    @ApiModelProperty(value = "运行状态 启用:true 禁用:false")
    private Boolean runStatus;

    /**
     * 备注
     *
     * @mbggenerated
     */
    @FieldDesc("备注")
    @ApiModelProperty(value = "备注")
    @Length(max=500)
    private String desc;

    /**
     * 创建人
     *
     * @mbggenerated
     */
    @FieldDesc("创建人")
    @ApiModelProperty(value = "创建人")
    @Range(min=Long.MIN_VALUE,max=Long.MAX_VALUE)
    private Long createUser;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    @FieldDesc("创建时间")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新人
     *
     * @mbggenerated
     */
    @FieldDesc("更新人")
    @ApiModelProperty(value = "更新人")
    @Range(min=Long.MIN_VALUE,max=Long.MAX_VALUE)
    private Long updateUser;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    @FieldDesc("更新时间")
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 级别
     *
     * @mbggenerated
     */
    @FieldDesc("级别")
    @ApiModelProperty(value = "级别")
    @Range(min=Integer.MIN_VALUE,max=Integer.MAX_VALUE)
    private Integer level;

    //------------- 手动新增字段，请写在此后面 -------------
    private static final long serialVersionUID = 1L;
}