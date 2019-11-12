package cn.scc.entity;

import java.util.Date;

public class NursingRecord {
    private Long nursingRecordId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private Long customerId;

    private Long nursingId;

    private Date nursingTime;

    private String nursingContent;

    private Long nursingCount;

    private Long staffId;

    public Long getNursingRecordId() {
        return nursingRecordId;
    }

    public void setNursingRecordId(Long nursingRecordId) {
        this.nursingRecordId = nursingRecordId;
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

    public Long getNursingId() {
        return nursingId;
    }

    public void setNursingId(Long nursingId) {
        this.nursingId = nursingId;
    }

    public Date getNursingTime() {
        return nursingTime;
    }

    public void setNursingTime(Date nursingTime) {
        this.nursingTime = nursingTime;
    }

    public String getNursingContent() {
        return nursingContent;
    }

    public void setNursingContent(String nursingContent) {
        this.nursingContent = nursingContent == null ? null : nursingContent.trim();
    }

    public Long getNursingCount() {
        return nursingCount;
    }

    public void setNursingCount(Long nursingCount) {
        this.nursingCount = nursingCount;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }
}