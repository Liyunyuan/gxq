package com.hengyunsoft.platform.msgs.dto.bbs;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 查询未读消息请求
 */
@Data
@ApiModel(value = "BbsNotReadMsgReqDTO", description = "查询未读消息请求")
public class BbsNotReadMsgReqDTO implements Serializable {
	private static final long serialVersionUID = 1L;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "用户id")
    private Long userId;

    /**
     * 筛选条件  全部：all,待办：needHandle,消息：message
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "筛选条件  全部：all,待办：needHandle,消息：message")
    private String conditions;
}