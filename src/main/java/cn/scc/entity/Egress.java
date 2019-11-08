package cn.scc.entity;

import java.util.Date;

public class Egress {
    private Long id;

    private Long cusID;

    private String type;

    private Date egrDate;

    private Date back;

    private String companion;

    private String relation;

    private String phone;

    private String remark;

    private Date realBack;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusID() {
        return cusID;
    }

    public void setCusID(Long cusID) {
        this.cusID = cusID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getEgrDate() {
        return egrDate;
    }

    public void setEgrDate(Date egrDate) {
        this.egrDate = egrDate;
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

    public Date getRealBack() {
        return realBack;
    }

    public void setRealBack(Date realBack) {
        this.realBack = realBack;
    }
}