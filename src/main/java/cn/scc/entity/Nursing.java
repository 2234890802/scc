package cn.scc.entity;

import java.math.BigDecimal;

public class Nursing {
    private Long nurNo;

    private String nurName;

    private BigDecimal price;

    private String describe;

    private String service;

    private String status;

    public Long getNurNo() {
        return nurNo;
    }

    public void setNurNo(Long nurNo) {
        this.nurNo = nurNo;
    }

    public String getNurName() {
        return nurName;
    }

    public void setNurName(String nurName) {
        this.nurName = nurName == null ? null : nurName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
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