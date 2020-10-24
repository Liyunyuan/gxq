package com.hengyunsoft.platform.mt.entity.component.po;

import com.hengyunsoft.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class AppCallInterface extends BaseEntity<Long> implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 应用id
     *
     * @mbggenerated
     */
    private Long applicationId;

    /**
     * 组件id
     *
     * @mbggenerated
     */
    private Long componentId;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 创建人
     *
     * @mbggenerated
     */
    private Long createUser;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 更新人
     *
     * @mbggenerated
     */
    private Long updateUser;

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 应用id
     *
     * @mbggenerated
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * 应用id
     *
     * @mbggenerated
     */
    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * 组件id
     *
     * @mbggenerated
     */
    public Long getComponentId() {
        return componentId;
    }

    /**
     * 组件id
     *
     * @mbggenerated
     */
    public void setComponentId(Long componentId) {
        this.componentId = componentId;
    }

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人
     *
     * @mbggenerated
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     *
     * @mbggenerated
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人
     *
     * @mbggenerated
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * 更新人
     *
     * @mbggenerated
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }
}