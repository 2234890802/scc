package cn.scc.entity;

import java.util.Date;

public class Meals {
    private Long id;

    private Long cusId;

    private Long foodId;

    private Date foodDate;

    private String supplyDay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusId() {
        return cusId;
    }

    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Date getFoodDate() {
        return foodDate;
    }

    public void setFoodDate(Date foodDate) {
        this.foodDate = foodDate;
    }

    public String getSupplyDay() {
        return supplyDay;
    }

    public void setSupplyDay(String supplyDay) {
        this.supplyDay = supplyDay == null ? null : supplyDay.trim();
    }
}