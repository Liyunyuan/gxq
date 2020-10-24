package com.hengyunsoft.platform.logs.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "LogStructTomcat", description = "结构化Tomcat")
public class LogStructTomcatDTO extends LogStructTomcatBaseDTO{
    @ApiModelProperty(value = "主键id")
    private Long id;
}
