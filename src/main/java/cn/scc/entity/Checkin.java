package cn.scc.entity;

import java.util.Date;

public class Checkin {
    private Long id;

    private Long customerId;

    private Long bedId;

    private Date bedStart;

    private Date bedEnd;

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

    public Long getBedId() {
        return bedId;
    }

    public void setBedId(Long bedId) {
        this.bedId = bedId;
    }

    public Date getBedStart() {
        return bedStart;
    }

    public void setBedStart(Date bedStart) {
        this.bedStart = bedStart;
    }

    public Date getBedEnd() {
        return bedEnd;
    }

    public void setBedEnd(Date bedEnd) {
        this.bedEnd = bedEnd;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}