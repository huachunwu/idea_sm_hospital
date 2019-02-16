package com.imooc.sm.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SectionList {
    private Integer id;
    private String name;
    private Date createTime;
    private Date lastUpdateTime;
    private Integer scid;
    private SectionClassify sectionClassify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public SectionClassify getSectionClassify() {
        return sectionClassify;
    }

    public void setSectionClassify(SectionClassify sectionClassify) {
        this.sectionClassify = sectionClassify;
    }
}
