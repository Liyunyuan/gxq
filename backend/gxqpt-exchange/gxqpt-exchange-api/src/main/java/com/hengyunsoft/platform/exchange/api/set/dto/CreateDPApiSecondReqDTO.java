package com.hengyunsoft.platform.exchange.api.set.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * com.hengyunsoft.platform.exchange.api.set.dto
 * 版权：中科恒运软件科技股份有限公司贵阳分公司
 * 描述： 创建api类型的数据集第二步提交
 * 修改人：gbl
 * 修改时间：2018/4/24
 * 修改内容：
 */
@Data
@ApiModel(value = "CreateDPApiScendReq", description = "创建api类型的数据集第二步提交")
public class CreateDPApiSecondReqDTO {
    @ApiModelProperty(value = "编辑类型,1新增，2编辑，3详情")
    private Integer editType;
    @ApiModelProperty(value = "数据集id")
    private Long id;
    @ApiModelProperty(value = "选择的字段列表")
    private List<String> fieldList;


}
