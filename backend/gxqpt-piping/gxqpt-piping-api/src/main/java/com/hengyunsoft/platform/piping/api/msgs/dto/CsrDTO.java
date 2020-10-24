package com.hengyunsoft.platform.piping.api.msgs.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 接收人信息对象
 * @author zjr
 */
@Data
@ApiModel(value = "Csr", description = "接收人信息对象")
public class CsrDTO implements Serializable {
    /**
     * 用户id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 接收人姓名
     *
     * @mbggenerated
     */
    private String recName;

    private static final long serialVersionUID = 1L;

}
