package cn.scc.entity;

import java.math.BigDecimal;

public class Foods {
    private Long foodId;

    private String foodName;

    private String Type;

    private String label;

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

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type == null ? null : Type.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
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