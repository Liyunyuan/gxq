package com.hengyunsoft.platform.supervise.dto.center.storage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "DataStorageSupervisePageLike", description = "数据存储配置模糊查询入参实体")
public class DataStorageSupervisePageLikeDTO {
    /**
     * 应用ID
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "应用ID")
    private String appId;

    /**
     * 管理应用集合
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "管理应用集合")
    private List<String> appIds;

    /**
     * 监管类型
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "监管类型")
    private Short superviseType;

    /**
     * 运行状态 启用:true 禁用:false
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "运行状态 启用:true 禁用:false")
    private Boolean runStatus;
}
