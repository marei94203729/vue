package com.cros.vue.entity;

import com.cros.vue.common.AmountSerializerUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SlpriceadjpdtItem implements Serializable {
    private Long id;

    private Long adClientId;
    @Getter
    @Setter
    private String mProductCode;
    @Getter
    @Setter
    private String year;
    @Getter
    @Setter
    private String season;
    private Long adOrgId;

    private Long bSlpriceadjId;

    private Long mProductId;

    private BigDecimal firsaledis;

    private BigDecimal saledis;

    private BigDecimal saleretdis;

    private Long ownerid;

    private Long modifierid;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    private Date creationdate;

    private Date modifieddate;

    private String isactive;

    private BigDecimal firprice;

    private BigDecimal sprice;

    private BigDecimal srprice;

    private BigDecimal pricelist;

    private BigDecimal nowprice;

    private String isfree;

    private String isagt;

    private String isdisagt;
    @JsonSerialize(using = AmountSerializerUtils.class)//自定义格式化输出金额
    private BigDecimal pricedis;

    public BigDecimal getModifypricedis() {
        return modifypricedis;
    }

    public void setModifypricedis(BigDecimal modifypricedis) {
        this.modifypricedis = modifypricedis;
    }

    private BigDecimal modifypricedis;
    @JsonSerialize(using = AmountSerializerUtils.class)//自定义格式化输出金额
    private BigDecimal priceactual;

    private Short status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdClientId() {
        return adClientId;
    }

    public void setAdClientId(Long adClientId) {
        this.adClientId = adClientId;
    }

    public Long getAdOrgId() {
        return adOrgId;
    }

    public void setAdOrgId(Long adOrgId) {
        this.adOrgId = adOrgId;
    }

    public Long getbSlpriceadjId() {
        return bSlpriceadjId;
    }

    public void setbSlpriceadjId(Long bSlpriceadjId) {
        this.bSlpriceadjId = bSlpriceadjId;
    }

    public Long getmProductId() {
        return mProductId;
    }

    public void setmProductId(Long mProductId) {
        this.mProductId = mProductId;
    }

    public BigDecimal getFirsaledis() {
        return firsaledis;
    }

    public void setFirsaledis(BigDecimal firsaledis) {
        this.firsaledis = firsaledis;
    }

    public BigDecimal getSaledis() {
        return saledis;
    }

    public void setSaledis(BigDecimal saledis) {
        this.saledis = saledis;
    }

    public BigDecimal getSaleretdis() {
        return saleretdis;
    }

    public void setSaleretdis(BigDecimal saleretdis) {
        this.saleretdis = saleretdis;
    }

    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    public Long getModifierid() {
        return modifierid;
    }

    public void setModifierid(Long modifierid) {
        this.modifierid = modifierid;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public BigDecimal getFirprice() {
        return firprice;
    }

    public void setFirprice(BigDecimal firprice) {
        this.firprice = firprice;
    }

    public BigDecimal getSprice() {
        return sprice;
    }

    public void setSprice(BigDecimal sprice) {
        this.sprice = sprice;
    }

    public BigDecimal getSrprice() {
        return srprice;
    }

    public void setSrprice(BigDecimal srprice) {
        this.srprice = srprice;
    }

    public BigDecimal getPricelist() {
        return pricelist;
    }

    public void setPricelist(BigDecimal pricelist) {
        this.pricelist = pricelist;
    }

    public BigDecimal getNowprice() {
        return nowprice;
    }

    public void setNowprice(BigDecimal nowprice) {
        this.nowprice = nowprice;
    }

    public String getIsfree() {
        return isfree;
    }

    public void setIsfree(String isfree) {
        this.isfree = isfree == null ? null : isfree.trim();
    }

    public String getIsagt() {
        return isagt;
    }

    public void setIsagt(String isagt) {
        this.isagt = isagt == null ? null : isagt.trim();
    }

    public String getIsdisagt() {
        return isdisagt;
    }

    public void setIsdisagt(String isdisagt) {
        this.isdisagt = isdisagt == null ? null : isdisagt.trim();
    }

    public BigDecimal getPricedis() {
        return pricedis;
    }

    public void setPricedis(BigDecimal pricedis) {
        this.pricedis = pricedis;
        this.modifypricedis=pricedis;
    }

    public BigDecimal getPriceactual() {
        return priceactual;
    }

    public void setPriceactual(BigDecimal priceactual) {
        this.priceactual = priceactual;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adClientId=").append(adClientId);
        sb.append(", adOrgId=").append(adOrgId);
        sb.append(", bSlpriceadjId=").append(bSlpriceadjId);
        sb.append(", mProductId=").append(mProductId);
        sb.append(", firsaledis=").append(firsaledis);
        sb.append(", saledis=").append(saledis);
        sb.append(", saleretdis=").append(saleretdis);
        sb.append(", ownerid=").append(ownerid);
        sb.append(", modifierid=").append(modifierid);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", isactive=").append(isactive);
        sb.append(", firprice=").append(firprice);
        sb.append(", sprice=").append(sprice);
        sb.append(", srprice=").append(srprice);
        sb.append(", pricelist=").append(pricelist);
        sb.append(", nowprice=").append(nowprice);
        sb.append(", isfree=").append(isfree);
        sb.append(", isagt=").append(isagt);
        sb.append(", isdisagt=").append(isdisagt);
        sb.append(", pricedis=").append(pricedis);
        sb.append(", priceactual=").append(priceactual);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}