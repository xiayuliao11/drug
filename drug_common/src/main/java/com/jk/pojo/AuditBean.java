package com.jk.pojo;

import java.util.Date;

public class AuditBean {

    private Integer auditId;
    private String auditType;
    private Date auditTime;
    private String auditInfo;
    private Integer auditStatus;
    private Integer userId;
    private Integer administratorId;

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditInfo() {
        return auditInfo;
    }

    public void setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    @Override
    public String toString() {
        return "AuditBean{" +
                "auditId=" + auditId +
                ", auditType='" + auditType + '\'' +
                ", auditTime=" + auditTime +
                ", auditInfo='" + auditInfo + '\'' +
                ", auditStatus=" + auditStatus +
                ", userId=" + userId +
                ", administratorId=" + administratorId +
                '}';
    }
}
