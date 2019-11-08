package cn.scc.entity;

import java.math.BigDecimal;

public class Nursing {
    private Long nursingNo;

    private String nursingName;

    private BigDecimal price;

    private String remark;

    private String service;

    private String status;

    public Long getNursingNo() {
        return nursingNo;
    }

    public void setNursingNo(Long nursingNo) {
        this.nursingNo = nursingNo;
    }

    public String getNursingName() {
        return nursingName;
    }

    public void setNursingName(String nursingName) {
        this.nursingName = nursingName == null ? null : nursingName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}