package cn.scc.entity;

import java.util.Date;

public class Nurrecord {
    private Long id;

    private Long customerId;

    private Long empId;

    private Long nursingNo;

    private Date nursingEnd;

    private String remark;

    private Long nursingNum;

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

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getNursingNo() {
        return nursingNo;
    }

    public void setNursingNo(Long nursingNo) {
        this.nursingNo = nursingNo;
    }

    public Date getNursingEnd() {
        return nursingEnd;
    }

    public void setNursingEnd(Date nursingEnd) {
        this.nursingEnd = nursingEnd;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getNursingNum() {
        return nursingNum;
    }

    public void setNursingNum(Long nursingNum) {
        this.nursingNum = nursingNum;
    }
}