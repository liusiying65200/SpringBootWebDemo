package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class LbdjActivity {
    private Integer id;

    private String code;

    private Integer actObject;

    private Byte actType;

    private String actRule;

    private String actName;

    private String actIntro;

    private String actImg;

    private String actHref;

    private Integer actHrefType;

    private Boolean status;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private Date changeTime;

    private Integer changeUser;

    private Integer createUser;

    private Integer top;

    private String actDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getActObject() {
        return actObject;
    }

    public void setActObject(Integer actObject) {
        this.actObject = actObject;
    }

    public Byte getActType() {
        return actType;
    }

    public void setActType(Byte actType) {
        this.actType = actType;
    }

    public String getActRule() {
        return actRule;
    }

    public void setActRule(String actRule) {
        this.actRule = actRule == null ? null : actRule.trim();
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public String getActIntro() {
        return actIntro;
    }

    public void setActIntro(String actIntro) {
        this.actIntro = actIntro == null ? null : actIntro.trim();
    }

    public String getActImg() {
        return actImg;
    }

    public void setActImg(String actImg) {
        this.actImg = actImg == null ? null : actImg.trim();
    }

    public String getActHref() {
        return actHref;
    }

    public void setActHref(String actHref) {
        this.actHref = actHref == null ? null : actHref.trim();
    }

    public Integer getActHrefType() {
        return actHrefType;
    }

    public void setActHrefType(Integer actHrefType) {
        this.actHrefType = actHrefType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public Integer getChangeUser() {
        return changeUser;
    }

    public void setChangeUser(Integer changeUser) {
        this.changeUser = changeUser;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public String getActDetail() {
        return actDetail;
    }

    public void setActDetail(String actDetail) {
        this.actDetail = actDetail == null ? null : actDetail.trim();
    }
}