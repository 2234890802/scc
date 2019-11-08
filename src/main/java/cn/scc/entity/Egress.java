package cn.scc.entity;

import java.util.Date;

public class Egress {
    private Long id;

    private Long cusid;

    private String type;

    private Date egrdate;

    private Date back;

    private String companion;

    private String relation;

    private String phone;

    private String remark;

    private Date realreturn;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getEgrdate() {
        return egrdate;
    }

    public void setEgrdate(Date egrdate) {
        this.egrdate = egrdate;
    }

    public Date getBack() {
        return back;
    }

    public void setBack(Date back) {
        this.back = back;
    }

    public String getCompanion() {
        return companion;
    }

    public void setCompanion(String companion) {
        this.companion = companion == null ? null : companion.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getRealreturn() {
        return realreturn;
    }

    public void setRealreturn(Date realreturn) {
        this.realreturn = realreturn;
    }
}