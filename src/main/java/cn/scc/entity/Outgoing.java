package cn.scc.entity;

import java.util.Date;

public class Outgoing {
    private Long outgoingId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private Long customerId;

    private String outgoingReason;

    private Date outgoingTime;

    private Date expectedreturnTime;

    private Date actualreturnTime;

    private String escorted;

    private String relation;

    private String phone;

    private String auditStatus;

    private String auditPerson;

    private Date auditTime;

    public Long getOutgoingId() {
        return outgoingId;
    }

    public void setOutgoingId(Long outgoingId) {
        this.outgoingId = outgoingId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getOutgoingReason() {
        return outgoingReason;
    }

    public void setOutgoingReason(String outgoingReason) {
        this.outgoingReason = outgoingReason == null ? null : outgoingReason.trim();
    }

    public Date getOutgoingTime() {
        return outgoingTime;
    }

    public void setOutgoingTime(Date outgoingTime) {
        this.outgoingTime = outgoingTime;
    }

    public Date getExpectedreturnTime() {
        return expectedreturnTime;
    }

    public void setExpectedreturnTime(Date expectedreturnTime) {
        this.expectedreturnTime = expectedreturnTime;
    }

    public Date getActualreturnTime() {
        return actualreturnTime;
    }

    public void setActualreturnTime(Date actualreturnTime) {
        this.actualreturnTime = actualreturnTime;
    }

    public String getEscorted() {
        return escorted;
    }

    public void setEscorted(String escorted) {
        this.escorted = escorted == null ? null : escorted.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson == null ? null : auditPerson.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}