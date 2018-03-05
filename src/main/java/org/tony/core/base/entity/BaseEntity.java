package org.tony.core.base.entity;

import java.util.Date;

/**
 * @Description 实体BaseEntity
 * @Version 1.0.0
 * @Author tony
 * @Date 2018/3/2
 * @ProjectName app-core
 * @PackageName org.tony.core.base.entity
 */
public class BaseEntity {

    private Long id;

    private Long createById;

    private Long updateById;

    private String createByName;

    private String upateByName;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateById() {
        return createById;
    }

    public void setCreateById(Long createById) {
        this.createById = createById;
    }

    public Long getUpdateById() {
        return updateById;
    }

    public void setUpdateById(Long updateById) {
        this.updateById = updateById;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    public String getUpateByName() {
        return upateByName;
    }

    public void setUpateByName(String upateByName) {
        this.upateByName = upateByName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
