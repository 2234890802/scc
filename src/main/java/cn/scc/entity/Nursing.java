package cn.scc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Nursing {
    private Long nursingId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private String nursingName;

    private BigDecimal nursingPrice;

    private String describe;

    private String incrementFlag;

    private String status;

    public Long getNursingId() {
        return nursingId;
    }

    public void setNursingId(Long nursingId) {
        this.nursingId = nursingId;
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

    public String getNursingName() {
        return nursingName;
    }

    public void setNursingName(String nursingName) {
        this.nursingName = nursingName == null ? null : nursingName.trim();
    }

    public BigDecimal getNursingPrice() {
        return nursingPrice;
    }

    public void setNursingPrice(BigDecimal nursingPrice) {
        this.nursingPrice = nursingPrice;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getIncrementFlag() {
        return incrementFlag;
    }

    public void setIncrementFlag(String incrementFlag) {
        this.incrementFlag = incrementFlag == null ? null : incrementFlag.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}