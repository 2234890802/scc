package cn.scc.entity;

import java.util.Date;

public class Meals {
    private Long id;

    private Long cusid;

    private Long foodid;

    private Date fooddate;

    private String supplyday;

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

    public Long getFoodid() {
        return foodid;
    }

    public void setFoodid(Long foodid) {
        this.foodid = foodid;
    }

    public Date getFooddate() {
        return fooddate;
    }

    public void setFooddate(Date fooddate) {
        this.fooddate = fooddate;
    }

    public String getSupplyday() {
        return supplyday;
    }

    public void setSupplyday(String supplyday) {
        this.supplyday = supplyday == null ? null : supplyday.trim();
    }
}