package cn.scc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Foods {
    private Long foodId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private String foodName;

    private String foodType;

    private String foodTag;

    private BigDecimal foodPrice;

    private String foodPicture;

    private String momalFlag;

    private String supplyWeek;

    private String supplyType;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
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

    public String getFoodTag() {
        return foodTag;
    }

    public void setFoodTag(String foodTag) {
        this.foodTag = foodTag == null ? null : foodTag.trim();
    }

    public BigDecimal getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(BigDecimal foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodPicture() {
        return foodPicture;
    }

    public void setFoodPicture(String foodPicture) {
        this.foodPicture = foodPicture == null ? null : foodPicture.trim();
    }

    public String getMomalFlag() {
        return momalFlag;
    }

    public void setMomalFlag(String momalFlag) {
        this.momalFlag = momalFlag == null ? null : momalFlag.trim();
    }

    public String getSupplyWeek() {
        return supplyWeek;
    }

    public void setSupplyWeek(String supplyWeek) {
        this.supplyWeek = supplyWeek == null ? null : supplyWeek.trim();
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType == null ? null : supplyType.trim();
    }
}