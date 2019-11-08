package cn.scc.entity;

import java.math.BigDecimal;

public class Foods {
    private Long foodId;

    private String foodName;

    private String foodType;

    private String tag;

    private BigDecimal price;

    private String img;

    private String steamed;

    private String supplyDay;

    private String supplyType;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType == null ? null : foodType.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getSteamed() {
        return steamed;
    }

    public void setSteamed(String steamed) {
        this.steamed = steamed == null ? null : steamed.trim();
    }

    public String getSupplyDay() {
        return supplyDay;
    }

    public void setSupplyDay(String supplyDay) {
        this.supplyDay = supplyDay == null ? null : supplyDay.trim();
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType == null ? null : supplyType.trim();
    }
}