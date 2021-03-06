package com.hengyunsoft.platform.admin.api.base.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author tianai
 * @createTime 2018-1-25
 */
@Data
@ApiModel(value = "DictionarySave", description = "数据字典")
public class DictionarySaveDTO extends BaseDictionaryDTO implements Serializable {
    /**
     * 字典编码
     *
     * @mbggenerated
     */@ApiModelProperty(value = "数据字典类型编码",required = true)
    private String code;
    /**
     * 数据字典类型id
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据字典类型id",required = true)
    private Long dictionaryTypeId;

    /**
     * 开发者ID，提供给各个应用的设别码
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据字典类型应用id",required = true)
    private String appId;

    /**
     * 类型编码
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据字典类型编码",required = true)
    private String dictionaryTypeCode;

    /**
     * 字典类型名称
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "数据字典类型名称",required = true)
    private String dictionaryTypeName;
}
