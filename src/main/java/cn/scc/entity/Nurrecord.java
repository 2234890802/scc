package cn.scc.entity;

import java.util.Date;

public class Nurrecord {
    private Long id;

    private Long cusid;

    private Long nurno;

    private Date nurend;

    private String describe;

    private Long number;

    private Long empid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusid() {
        return cusid;
    }

    public void setCusid(Long cusid) {
        this.cusid = cusid;
    }

    public Long getNurno() {
        return nurno;
    }

    public void setNurno(Long nurno) {
        this.nurno = nurno;
    }

    public Date getNurend() {
        return nurend;
    }

    public void setNurend(Date nurend) {
        this.nurend = nurend;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }
}