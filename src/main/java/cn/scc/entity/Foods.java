package cn.scc.entity;

import java.math.BigDecimal;

public class Foods {
    private Long foodid;

    private String foodname;

    private String type;

    private String label;

    private BigDecimal price;

    private String img;

    private String steamed;

    private String supplyday;

    private String supplytype;

    public Long getFoodid() {
        return foodid;
    }

    public void setFoodid(Long foodid) {
        this.foodid = foodid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public String getSupplyday() {
        return supplyday;
    }

    public void setSupplyday(String supplyday) {
        this.supplyday = supplyday == null ? null : supplyday.trim();
    }

    public String getSupplytype() {
        return supplytype;
    }

    public void setSupplytype(String supplytype) {
        this.supplytype = supplytype == null ? null : supplytype.trim();
    }
}