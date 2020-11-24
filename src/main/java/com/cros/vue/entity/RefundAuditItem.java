package com.cros.vue.entity;

import com.cros.vue.common.AmountSerializerUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefundAuditItem implements Serializable {
    private Long id;

    private Long adClientId;

    private Long adOrgId;

    private Long ownerid;

    private Long modifierid;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    private Date creationdate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    private Date modifieddate;

    private String isactive;

    private String showname;

    private Long mRetSaleId;

    private Long mProductId;
    @Getter
    @Setter
    private String mProductCode;
    private Long mProduct2Id;
    @Getter
    @Setter
    private String year;
    @Getter
    @Setter
    private String season;
    private Short mx1;

    private Short mx2;

    private Short mx3;

    private Short mx4;

    private Short mx5;

    private Short mx6;

    private Short mx7;

    private Short mx8;

    private Short mx9;

    private Short mx10;

    private Short mx11;

    private Short mx12;

    private Short mx13;

    private Short mx14;

    private Short mx15;

    private Short mx16;

    private Short mx17;

    private Short mx18;

    private Short mx19;

    private Short mx20;

    private Short mx21;

    private Short mx22;

    private Short mx23;

    private Short mx24;

    private Short totQty;

    private Short rn;
    //@JsonProperty("SCORE") //将属性重新命名输出
    @JsonSerialize(using = AmountSerializerUtils.class)//自定义格式化输出金额
    private BigDecimal amtActual;

    private String description;

    private String ismodify;

    private Short qty1;

    private Short qtycan;

    private Long mColorId;
    @JsonSerialize(using = AmountSerializerUtils.class)//自定义格式化输出金额
    private BigDecimal priceactual2;

    private Short retReason;
    @Getter
    @Setter
    private String retReasonName;
    @JsonSerialize(using = AmountSerializerUtils.class)//自定义格式化输出金额
    private BigDecimal priceactual;

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

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname == null ? null : showname.trim();
    }

    public Long getmRetSaleId() {
        return mRetSaleId;
    }

    public void setmRetSaleId(Long mRetSaleId) {
        this.mRetSaleId = mRetSaleId;
    }

    public Long getmProductId() {
        return mProductId;
    }

    public void setmProductId(Long mProductId) {
        this.mProductId = mProductId;
    }

    public Long getmProduct2Id() {
        return mProduct2Id;
    }

    public void setmProduct2Id(Long mProduct2Id) {
        this.mProduct2Id = mProduct2Id;
    }

    public Short getMx1() {
        return mx1;
    }

    public void setMx1(Short mx1) {
        this.mx1 = mx1;
    }

    public Short getMx2() {
        return mx2;
    }

    public void setMx2(Short mx2) {
        this.mx2 = mx2;
    }

    public Short getMx3() {
        return mx3;
    }

    public void setMx3(Short mx3) {
        this.mx3 = mx3;
    }

    public Short getMx4() {
        return mx4;
    }

    public void setMx4(Short mx4) {
        this.mx4 = mx4;
    }

    public Short getMx5() {
        return mx5;
    }

    public void setMx5(Short mx5) {
        this.mx5 = mx5;
    }

    public Short getMx6() {
        return mx6;
    }

    public void setMx6(Short mx6) {
        this.mx6 = mx6;
    }

    public Short getMx7() {
        return mx7;
    }

    public void setMx7(Short mx7) {
        this.mx7 = mx7;
    }

    public Short getMx8() {
        return mx8;
    }

    public void setMx8(Short mx8) {
        this.mx8 = mx8;
    }

    public Short getMx9() {
        return mx9;
    }

    public void setMx9(Short mx9) {
        this.mx9 = mx9;
    }

    public Short getMx10() {
        return mx10;
    }

    public void setMx10(Short mx10) {
        this.mx10 = mx10;
    }

    public Short getMx11() {
        return mx11;
    }

    public void setMx11(Short mx11) {
        this.mx11 = mx11;
    }

    public Short getMx12() {
        return mx12;
    }

    public void setMx12(Short mx12) {
        this.mx12 = mx12;
    }

    public Short getMx13() {
        return mx13;
    }

    public void setMx13(Short mx13) {
        this.mx13 = mx13;
    }

    public Short getMx14() {
        return mx14;
    }

    public void setMx14(Short mx14) {
        this.mx14 = mx14;
    }

    public Short getMx15() {
        return mx15;
    }

    public void setMx15(Short mx15) {
        this.mx15 = mx15;
    }

    public Short getMx16() {
        return mx16;
    }

    public void setMx16(Short mx16) {
        this.mx16 = mx16;
    }

    public Short getMx17() {
        return mx17;
    }

    public void setMx17(Short mx17) {
        this.mx17 = mx17;
    }

    public Short getMx18() {
        return mx18;
    }

    public void setMx18(Short mx18) {
        this.mx18 = mx18;
    }

    public Short getMx19() {
        return mx19;
    }

    public void setMx19(Short mx19) {
        this.mx19 = mx19;
    }

    public Short getMx20() {
        return mx20;
    }

    public void setMx20(Short mx20) {
        this.mx20 = mx20;
    }

    public Short getMx21() {
        return mx21;
    }

    public void setMx21(Short mx21) {
        this.mx21 = mx21;
    }

    public Short getMx22() {
        return mx22;
    }

    public void setMx22(Short mx22) {
        this.mx22 = mx22;
    }

    public Short getMx23() {
        return mx23;
    }

    public void setMx23(Short mx23) {
        this.mx23 = mx23;
    }

    public Short getMx24() {
        return mx24;
    }

    public void setMx24(Short mx24) {
        this.mx24 = mx24;
    }

    public Short getTotQty() {
        return totQty;
    }

    public void setTotQty(Short totQty) {
        this.totQty = totQty;
    }

    public Short getRn() {
        return rn;
    }

    public void setRn(Short rn) {
        this.rn = rn;
    }

    public BigDecimal getAmtActual() {
        return amtActual;
    }

    public void setAmtActual(BigDecimal amtActual) {
        this.amtActual = amtActual;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getIsmodify() {
        return ismodify;
    }

    public void setIsmodify(String ismodify) {
        this.ismodify = ismodify == null ? null : ismodify.trim();
    }

    public Short getQty1() {
        return qty1;
    }

    public void setQty1(Short qty1) {
        this.qty1 = qty1;
    }

    public Short getQtycan() {
        return qtycan;
    }

    public void setQtycan(Short qtycan) {
        this.qtycan = qtycan;
    }

    public Long getmColorId() {
        return mColorId;
    }

    public void setmColorId(Long mColorId) {
        this.mColorId = mColorId;
    }

    public BigDecimal getPriceactual2() {
        return priceactual2;
    }

    public void setPriceactual2(BigDecimal priceactual2) {
        this.priceactual2 = priceactual2;
    }

    public Short getRetReason() {
        return retReason;
    }

    public void setRetReason(Short retReason) {
        this.retReason = retReason;
    }

    public BigDecimal getPriceactual() {
        return priceactual;
    }

    public void setPriceactual(BigDecimal priceactual) {
        this.priceactual = priceactual;
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
        sb.append(", ownerid=").append(ownerid);
        sb.append(", modifierid=").append(modifierid);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", isactive=").append(isactive);
        sb.append(", showname=").append(showname);
        sb.append(", mRetSaleId=").append(mRetSaleId);
        sb.append(", mProductId=").append(mProductId);
        sb.append(", mProduct2Id=").append(mProduct2Id);
        sb.append(", mx1=").append(mx1);
        sb.append(", mx2=").append(mx2);
        sb.append(", mx3=").append(mx3);
        sb.append(", mx4=").append(mx4);
        sb.append(", mx5=").append(mx5);
        sb.append(", mx6=").append(mx6);
        sb.append(", mx7=").append(mx7);
        sb.append(", mx8=").append(mx8);
        sb.append(", mx9=").append(mx9);
        sb.append(", mx10=").append(mx10);
        sb.append(", mx11=").append(mx11);
        sb.append(", mx12=").append(mx12);
        sb.append(", mx13=").append(mx13);
        sb.append(", mx14=").append(mx14);
        sb.append(", mx15=").append(mx15);
        sb.append(", mx16=").append(mx16);
        sb.append(", mx17=").append(mx17);
        sb.append(", mx18=").append(mx18);
        sb.append(", mx19=").append(mx19);
        sb.append(", mx20=").append(mx20);
        sb.append(", mx21=").append(mx21);
        sb.append(", mx22=").append(mx22);
        sb.append(", mx23=").append(mx23);
        sb.append(", mx24=").append(mx24);
        sb.append(", totQty=").append(totQty);
        sb.append(", rn=").append(rn);
        sb.append(", amtActual=").append(amtActual);
        sb.append(", description=").append(description);
        sb.append(", ismodify=").append(ismodify);
        sb.append(", qty1=").append(qty1);
        sb.append(", qtycan=").append(qtycan);
        sb.append(", mColorId=").append(mColorId);
        sb.append(", priceactual2=").append(priceactual2);
        sb.append(", retReason=").append(retReason);
        sb.append(", priceactual=").append(priceactual);
        sb.append("]");
        return sb.toString();
    }
}