package cn.scc.entity;

import java.util.Date;

public class Retreat {
    private Long id;

    private Long customerId;

    private String retreatType;

    private String reason;

    private Date retreatDate;

    private Date applyDate;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getRetreatType() {
        return retreatType;
    }

    public void setRetreatType(String retreatType) {
        this.retreatType = retreatType == null ? null : retreatType.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getRetreatDate() {
        return retreatDate;
    }

    public void setRetreatDate(Date retreatDate) {
        this.retreatDate = retreatDate;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}