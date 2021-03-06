package com.hengyunsoft.platform.admin.api.base.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhangbiao
 * @createTime 2018-04-10
 */
@Data
@ApiModel(value = "DictionaryMaintainUpdate", description = "应用类型维护更新")
public class DictionaryMaintainUpdateDTO {
    private Long id;
    /**
     * 字典条目名称
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "字典条目名称")
    private String name;

    /**
     * 字典编码
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "字典编码")
    private String code;

    /**
     * 描述
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "描述")
    private String description;
    
    /**
     * 描述
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "描述")
    private Integer orderNum;

}
