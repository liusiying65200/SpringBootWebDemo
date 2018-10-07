package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class QuartzExecute {
    private Integer id;

    private Integer quartzInfoId;

    private String objectList;

    private Integer successCount;

    private Integer failCount;

    private String description;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuartzInfoId() {
        return quartzInfoId;
    }

    public void setQuartzInfoId(Integer quartzInfoId) {
        this.quartzInfoId = quartzInfoId;
    }

    public String getObjectList() {
        return objectList;
    }

    public void setObjectList(String objectList) {
        this.objectList = objectList == null ? null : objectList.trim();
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}