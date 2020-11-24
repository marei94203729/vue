package com.cros.vue.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer implements Serializable {
    private Long id;

    private Long adClientId;

    private Long adOrgId;

    private Long modifierid;

    private Date creationdate;

    private Date modifieddate;

    private Long ownerid;

    private String isactive;

    private String name;

    private String description;

    private Integer enterdate;

    private String isstop;

    private String contacter;

    private String phone;

    private String address;

    private String post;

    private String account;

    private String email;

    private String remark;

    private String taxno;

    private BigDecimal feeremain;

    private BigDecimal feesale;

    private BigDecimal saledis;

    private BigDecimal saleretdis;

    private Long cCusrankId;

    private Long cCustomerupId;

    private BigDecimal firsaledis;

    private BigDecimal feelsale;

    private BigDecimal feeltake;

    private String isperiod;

    private Long areamngId;

    private Long cCityId;

    private String isautoin;

    private BigDecimal orderrate;

    private BigDecimal retRate;

    private Long bigareamngId;

    private String isgroup;

    private String isaccount;

    private Long cDepartmentId;

    private Long cClasscodeId;

    private String code;

    private Long cAreaId;

    private Long priority;

    private Long mDimcus1Id;

    private Long mDimcus2Id;

    private Long mDimcus3Id;

    private Long mDimcus4Id;

    private Long mDimcus5Id;

    private Long mDimcus6Id;

    private Long mDimcus7Id;

    private Long mDimcus8Id;

    private Long mDimcus9Id;

    private Long mDimcus10Id;

    private BigDecimal butsaledis;

    private BigDecimal agtsaledis;

    private BigDecimal firsaleretdis;

    private BigDecimal agtsaleretdis;

    private BigDecimal trandis;

    private Long cCusattrib1Id;

    private Long cCusattrib2Id;

    private Long cCusattrib3Id;

    private Long cCusattrib4Id;

    private Long cCusattrib5Id;

    private Long cCusattrib6Id;

    private Long cCusattrib7Id;

    private Long cCusattrib8Id;

    private Long cCusattrib9Id;

    private Long cCusattrib10Id;

    private Long cCusattrib11Id;

    private Long cCusattrib12Id;

    private Long cCusattrib13Id;

    private Long cCusattrib14Id;

    private Long cCusattrib15Id;

    private Long cCusattrib16Id;

    private Long cCusattrib17Id;

    private Long cCusattrib18Id;

    private Long cCusattrib19Id;

    private Long cCusattrib20Id;

    private String canButsale;

    private String canNotbutsale;

    private String canAgtsale;

    private String iscrefund;

    private Long cCustypeId;

    private Long mDim1Id;

    private String mobile;

    private Long calculation;

    private String iskd;

    private Long legalId;

    private BigDecimal firretrate;

    private BigDecimal retrate;

    private BigDecimal agtretrate;

    private String glCompany;

    private String profitcenter;

    private String isthird;

    private String legal;

    private String isPck;

    private String isSalePck;

    private String isRetputPck;

    private String imgurl1;

    private String imgurl2;

    private String imgurl3;

    private String imgurl4;

    private String imgurl5;

    private Long bCuscodeFormatId;

    private String saleinvitem;

    private Long cFranchiseeId;

    private Long cCusgroupId;

    private String bank;

    private Long cCurrencyId;

    private String payway;

    private String tradeway;

    private Integer birthday;

    private String franchiseeRelaship;

    private String openstoreType;

    private Date stopdate;

    private Long cBranchId;

    private Long cSalerId;

    private Long salesrepId;

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

    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Integer enterdate) {
        this.enterdate = enterdate;
    }

    public String getIsstop() {
        return isstop;
    }

    public void setIsstop(String isstop) {
        this.isstop = isstop == null ? null : isstop.trim();
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter == null ? null : contacter.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTaxno() {
        return taxno;
    }

    public void setTaxno(String taxno) {
        this.taxno = taxno == null ? null : taxno.trim();
    }

    public BigDecimal getFeeremain() {
        return feeremain;
    }

    public void setFeeremain(BigDecimal feeremain) {
        this.feeremain = feeremain;
    }

    public BigDecimal getFeesale() {
        return feesale;
    }

    public void setFeesale(BigDecimal feesale) {
        this.feesale = feesale;
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

    public Long getcCusrankId() {
        return cCusrankId;
    }

    public void setcCusrankId(Long cCusrankId) {
        this.cCusrankId = cCusrankId;
    }

    public Long getcCustomerupId() {
        return cCustomerupId;
    }

    public void setcCustomerupId(Long cCustomerupId) {
        this.cCustomerupId = cCustomerupId;
    }

    public BigDecimal getFirsaledis() {
        return firsaledis;
    }

    public void setFirsaledis(BigDecimal firsaledis) {
        this.firsaledis = firsaledis;
    }

    public BigDecimal getFeelsale() {
        return feelsale;
    }

    public void setFeelsale(BigDecimal feelsale) {
        this.feelsale = feelsale;
    }

    public BigDecimal getFeeltake() {
        return feeltake;
    }

    public void setFeeltake(BigDecimal feeltake) {
        this.feeltake = feeltake;
    }

    public String getIsperiod() {
        return isperiod;
    }

    public void setIsperiod(String isperiod) {
        this.isperiod = isperiod == null ? null : isperiod.trim();
    }

    public Long getAreamngId() {
        return areamngId;
    }

    public void setAreamngId(Long areamngId) {
        this.areamngId = areamngId;
    }

    public Long getcCityId() {
        return cCityId;
    }

    public void setcCityId(Long cCityId) {
        this.cCityId = cCityId;
    }

    public String getIsautoin() {
        return isautoin;
    }

    public void setIsautoin(String isautoin) {
        this.isautoin = isautoin == null ? null : isautoin.trim();
    }

    public BigDecimal getOrderrate() {
        return orderrate;
    }

    public void setOrderrate(BigDecimal orderrate) {
        this.orderrate = orderrate;
    }

    public BigDecimal getRetRate() {
        return retRate;
    }

    public void setRetRate(BigDecimal retRate) {
        this.retRate = retRate;
    }

    public Long getBigareamngId() {
        return bigareamngId;
    }

    public void setBigareamngId(Long bigareamngId) {
        this.bigareamngId = bigareamngId;
    }

    public String getIsgroup() {
        return isgroup;
    }

    public void setIsgroup(String isgroup) {
        this.isgroup = isgroup == null ? null : isgroup.trim();
    }

    public String getIsaccount() {
        return isaccount;
    }

    public void setIsaccount(String isaccount) {
        this.isaccount = isaccount == null ? null : isaccount.trim();
    }

    public Long getcDepartmentId() {
        return cDepartmentId;
    }

    public void setcDepartmentId(Long cDepartmentId) {
        this.cDepartmentId = cDepartmentId;
    }

    public Long getcClasscodeId() {
        return cClasscodeId;
    }

    public void setcClasscodeId(Long cClasscodeId) {
        this.cClasscodeId = cClasscodeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getcAreaId() {
        return cAreaId;
    }

    public void setcAreaId(Long cAreaId) {
        this.cAreaId = cAreaId;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getmDimcus1Id() {
        return mDimcus1Id;
    }

    public void setmDimcus1Id(Long mDimcus1Id) {
        this.mDimcus1Id = mDimcus1Id;
    }

    public Long getmDimcus2Id() {
        return mDimcus2Id;
    }

    public void setmDimcus2Id(Long mDimcus2Id) {
        this.mDimcus2Id = mDimcus2Id;
    }

    public Long getmDimcus3Id() {
        return mDimcus3Id;
    }

    public void setmDimcus3Id(Long mDimcus3Id) {
        this.mDimcus3Id = mDimcus3Id;
    }

    public Long getmDimcus4Id() {
        return mDimcus4Id;
    }

    public void setmDimcus4Id(Long mDimcus4Id) {
        this.mDimcus4Id = mDimcus4Id;
    }

    public Long getmDimcus5Id() {
        return mDimcus5Id;
    }

    public void setmDimcus5Id(Long mDimcus5Id) {
        this.mDimcus5Id = mDimcus5Id;
    }

    public Long getmDimcus6Id() {
        return mDimcus6Id;
    }

    public void setmDimcus6Id(Long mDimcus6Id) {
        this.mDimcus6Id = mDimcus6Id;
    }

    public Long getmDimcus7Id() {
        return mDimcus7Id;
    }

    public void setmDimcus7Id(Long mDimcus7Id) {
        this.mDimcus7Id = mDimcus7Id;
    }

    public Long getmDimcus8Id() {
        return mDimcus8Id;
    }

    public void setmDimcus8Id(Long mDimcus8Id) {
        this.mDimcus8Id = mDimcus8Id;
    }

    public Long getmDimcus9Id() {
        return mDimcus9Id;
    }

    public void setmDimcus9Id(Long mDimcus9Id) {
        this.mDimcus9Id = mDimcus9Id;
    }

    public Long getmDimcus10Id() {
        return mDimcus10Id;
    }

    public void setmDimcus10Id(Long mDimcus10Id) {
        this.mDimcus10Id = mDimcus10Id;
    }

    public BigDecimal getButsaledis() {
        return butsaledis;
    }

    public void setButsaledis(BigDecimal butsaledis) {
        this.butsaledis = butsaledis;
    }

    public BigDecimal getAgtsaledis() {
        return agtsaledis;
    }

    public void setAgtsaledis(BigDecimal agtsaledis) {
        this.agtsaledis = agtsaledis;
    }

    public BigDecimal getFirsaleretdis() {
        return firsaleretdis;
    }

    public void setFirsaleretdis(BigDecimal firsaleretdis) {
        this.firsaleretdis = firsaleretdis;
    }

    public BigDecimal getAgtsaleretdis() {
        return agtsaleretdis;
    }

    public void setAgtsaleretdis(BigDecimal agtsaleretdis) {
        this.agtsaleretdis = agtsaleretdis;
    }

    public BigDecimal getTrandis() {
        return trandis;
    }

    public void setTrandis(BigDecimal trandis) {
        this.trandis = trandis;
    }

    public Long getcCusattrib1Id() {
        return cCusattrib1Id;
    }

    public void setcCusattrib1Id(Long cCusattrib1Id) {
        this.cCusattrib1Id = cCusattrib1Id;
    }

    public Long getcCusattrib2Id() {
        return cCusattrib2Id;
    }

    public void setcCusattrib2Id(Long cCusattrib2Id) {
        this.cCusattrib2Id = cCusattrib2Id;
    }

    public Long getcCusattrib3Id() {
        return cCusattrib3Id;
    }

    public void setcCusattrib3Id(Long cCusattrib3Id) {
        this.cCusattrib3Id = cCusattrib3Id;
    }

    public Long getcCusattrib4Id() {
        return cCusattrib4Id;
    }

    public void setcCusattrib4Id(Long cCusattrib4Id) {
        this.cCusattrib4Id = cCusattrib4Id;
    }

    public Long getcCusattrib5Id() {
        return cCusattrib5Id;
    }

    public void setcCusattrib5Id(Long cCusattrib5Id) {
        this.cCusattrib5Id = cCusattrib5Id;
    }

    public Long getcCusattrib6Id() {
        return cCusattrib6Id;
    }

    public void setcCusattrib6Id(Long cCusattrib6Id) {
        this.cCusattrib6Id = cCusattrib6Id;
    }

    public Long getcCusattrib7Id() {
        return cCusattrib7Id;
    }

    public void setcCusattrib7Id(Long cCusattrib7Id) {
        this.cCusattrib7Id = cCusattrib7Id;
    }

    public Long getcCusattrib8Id() {
        return cCusattrib8Id;
    }

    public void setcCusattrib8Id(Long cCusattrib8Id) {
        this.cCusattrib8Id = cCusattrib8Id;
    }

    public Long getcCusattrib9Id() {
        return cCusattrib9Id;
    }

    public void setcCusattrib9Id(Long cCusattrib9Id) {
        this.cCusattrib9Id = cCusattrib9Id;
    }

    public Long getcCusattrib10Id() {
        return cCusattrib10Id;
    }

    public void setcCusattrib10Id(Long cCusattrib10Id) {
        this.cCusattrib10Id = cCusattrib10Id;
    }

    public Long getcCusattrib11Id() {
        return cCusattrib11Id;
    }

    public void setcCusattrib11Id(Long cCusattrib11Id) {
        this.cCusattrib11Id = cCusattrib11Id;
    }

    public Long getcCusattrib12Id() {
        return cCusattrib12Id;
    }

    public void setcCusattrib12Id(Long cCusattrib12Id) {
        this.cCusattrib12Id = cCusattrib12Id;
    }

    public Long getcCusattrib13Id() {
        return cCusattrib13Id;
    }

    public void setcCusattrib13Id(Long cCusattrib13Id) {
        this.cCusattrib13Id = cCusattrib13Id;
    }

    public Long getcCusattrib14Id() {
        return cCusattrib14Id;
    }

    public void setcCusattrib14Id(Long cCusattrib14Id) {
        this.cCusattrib14Id = cCusattrib14Id;
    }

    public Long getcCusattrib15Id() {
        return cCusattrib15Id;
    }

    public void setcCusattrib15Id(Long cCusattrib15Id) {
        this.cCusattrib15Id = cCusattrib15Id;
    }

    public Long getcCusattrib16Id() {
        return cCusattrib16Id;
    }

    public void setcCusattrib16Id(Long cCusattrib16Id) {
        this.cCusattrib16Id = cCusattrib16Id;
    }

    public Long getcCusattrib17Id() {
        return cCusattrib17Id;
    }

    public void setcCusattrib17Id(Long cCusattrib17Id) {
        this.cCusattrib17Id = cCusattrib17Id;
    }

    public Long getcCusattrib18Id() {
        return cCusattrib18Id;
    }

    public void setcCusattrib18Id(Long cCusattrib18Id) {
        this.cCusattrib18Id = cCusattrib18Id;
    }

    public Long getcCusattrib19Id() {
        return cCusattrib19Id;
    }

    public void setcCusattrib19Id(Long cCusattrib19Id) {
        this.cCusattrib19Id = cCusattrib19Id;
    }

    public Long getcCusattrib20Id() {
        return cCusattrib20Id;
    }

    public void setcCusattrib20Id(Long cCusattrib20Id) {
        this.cCusattrib20Id = cCusattrib20Id;
    }

    public String getCanButsale() {
        return canButsale;
    }

    public void setCanButsale(String canButsale) {
        this.canButsale = canButsale == null ? null : canButsale.trim();
    }

    public String getCanNotbutsale() {
        return canNotbutsale;
    }

    public void setCanNotbutsale(String canNotbutsale) {
        this.canNotbutsale = canNotbutsale == null ? null : canNotbutsale.trim();
    }

    public String getCanAgtsale() {
        return canAgtsale;
    }

    public void setCanAgtsale(String canAgtsale) {
        this.canAgtsale = canAgtsale == null ? null : canAgtsale.trim();
    }

    public String getIscrefund() {
        return iscrefund;
    }

    public void setIscrefund(String iscrefund) {
        this.iscrefund = iscrefund == null ? null : iscrefund.trim();
    }

    public Long getcCustypeId() {
        return cCustypeId;
    }

    public void setcCustypeId(Long cCustypeId) {
        this.cCustypeId = cCustypeId;
    }

    public Long getmDim1Id() {
        return mDim1Id;
    }

    public void setmDim1Id(Long mDim1Id) {
        this.mDim1Id = mDim1Id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Long getCalculation() {
        return calculation;
    }

    public void setCalculation(Long calculation) {
        this.calculation = calculation;
    }

    public String getIskd() {
        return iskd;
    }

    public void setIskd(String iskd) {
        this.iskd = iskd == null ? null : iskd.trim();
    }

    public Long getLegalId() {
        return legalId;
    }

    public void setLegalId(Long legalId) {
        this.legalId = legalId;
    }

    public BigDecimal getFirretrate() {
        return firretrate;
    }

    public void setFirretrate(BigDecimal firretrate) {
        this.firretrate = firretrate;
    }

    public BigDecimal getRetrate() {
        return retrate;
    }

    public void setRetrate(BigDecimal retrate) {
        this.retrate = retrate;
    }

    public BigDecimal getAgtretrate() {
        return agtretrate;
    }

    public void setAgtretrate(BigDecimal agtretrate) {
        this.agtretrate = agtretrate;
    }

    public String getGlCompany() {
        return glCompany;
    }

    public void setGlCompany(String glCompany) {
        this.glCompany = glCompany == null ? null : glCompany.trim();
    }

    public String getProfitcenter() {
        return profitcenter;
    }

    public void setProfitcenter(String profitcenter) {
        this.profitcenter = profitcenter == null ? null : profitcenter.trim();
    }

    public String getIsthird() {
        return isthird;
    }

    public void setIsthird(String isthird) {
        this.isthird = isthird == null ? null : isthird.trim();
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal == null ? null : legal.trim();
    }

    public String getIsPck() {
        return isPck;
    }

    public void setIsPck(String isPck) {
        this.isPck = isPck == null ? null : isPck.trim();
    }

    public String getIsSalePck() {
        return isSalePck;
    }

    public void setIsSalePck(String isSalePck) {
        this.isSalePck = isSalePck == null ? null : isSalePck.trim();
    }

    public String getIsRetputPck() {
        return isRetputPck;
    }

    public void setIsRetputPck(String isRetputPck) {
        this.isRetputPck = isRetputPck == null ? null : isRetputPck.trim();
    }

    public String getImgurl1() {
        return imgurl1;
    }

    public void setImgurl1(String imgurl1) {
        this.imgurl1 = imgurl1 == null ? null : imgurl1.trim();
    }

    public String getImgurl2() {
        return imgurl2;
    }

    public void setImgurl2(String imgurl2) {
        this.imgurl2 = imgurl2 == null ? null : imgurl2.trim();
    }

    public String getImgurl3() {
        return imgurl3;
    }

    public void setImgurl3(String imgurl3) {
        this.imgurl3 = imgurl3 == null ? null : imgurl3.trim();
    }

    public String getImgurl4() {
        return imgurl4;
    }

    public void setImgurl4(String imgurl4) {
        this.imgurl4 = imgurl4 == null ? null : imgurl4.trim();
    }

    public String getImgurl5() {
        return imgurl5;
    }

    public void setImgurl5(String imgurl5) {
        this.imgurl5 = imgurl5 == null ? null : imgurl5.trim();
    }

    public Long getbCuscodeFormatId() {
        return bCuscodeFormatId;
    }

    public void setbCuscodeFormatId(Long bCuscodeFormatId) {
        this.bCuscodeFormatId = bCuscodeFormatId;
    }

    public String getSaleinvitem() {
        return saleinvitem;
    }

    public void setSaleinvitem(String saleinvitem) {
        this.saleinvitem = saleinvitem == null ? null : saleinvitem.trim();
    }

    public Long getcFranchiseeId() {
        return cFranchiseeId;
    }

    public void setcFranchiseeId(Long cFranchiseeId) {
        this.cFranchiseeId = cFranchiseeId;
    }

    public Long getcCusgroupId() {
        return cCusgroupId;
    }

    public void setcCusgroupId(Long cCusgroupId) {
        this.cCusgroupId = cCusgroupId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public Long getcCurrencyId() {
        return cCurrencyId;
    }

    public void setcCurrencyId(Long cCurrencyId) {
        this.cCurrencyId = cCurrencyId;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    public String getTradeway() {
        return tradeway;
    }

    public void setTradeway(String tradeway) {
        this.tradeway = tradeway == null ? null : tradeway.trim();
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getFranchiseeRelaship() {
        return franchiseeRelaship;
    }

    public void setFranchiseeRelaship(String franchiseeRelaship) {
        this.franchiseeRelaship = franchiseeRelaship == null ? null : franchiseeRelaship.trim();
    }

    public String getOpenstoreType() {
        return openstoreType;
    }

    public void setOpenstoreType(String openstoreType) {
        this.openstoreType = openstoreType == null ? null : openstoreType.trim();
    }

    public Date getStopdate() {
        return stopdate;
    }

    public void setStopdate(Date stopdate) {
        this.stopdate = stopdate;
    }

    public Long getcBranchId() {
        return cBranchId;
    }

    public void setcBranchId(Long cBranchId) {
        this.cBranchId = cBranchId;
    }

    public Long getcSalerId() {
        return cSalerId;
    }

    public void setcSalerId(Long cSalerId) {
        this.cSalerId = cSalerId;
    }

    public Long getSalesrepId() {
        return salesrepId;
    }

    public void setSalesrepId(Long salesrepId) {
        this.salesrepId = salesrepId;
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
        sb.append(", modifierid=").append(modifierid);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", ownerid=").append(ownerid);
        sb.append(", isactive=").append(isactive);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", enterdate=").append(enterdate);
        sb.append(", isstop=").append(isstop);
        sb.append(", contacter=").append(contacter);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", post=").append(post);
        sb.append(", account=").append(account);
        sb.append(", email=").append(email);
        sb.append(", remark=").append(remark);
        sb.append(", taxno=").append(taxno);
        sb.append(", feeremain=").append(feeremain);
        sb.append(", feesale=").append(feesale);
        sb.append(", saledis=").append(saledis);
        sb.append(", saleretdis=").append(saleretdis);
        sb.append(", cCusrankId=").append(cCusrankId);
        sb.append(", cCustomerupId=").append(cCustomerupId);
        sb.append(", firsaledis=").append(firsaledis);
        sb.append(", feelsale=").append(feelsale);
        sb.append(", feeltake=").append(feeltake);
        sb.append(", isperiod=").append(isperiod);
        sb.append(", areamngId=").append(areamngId);
        sb.append(", cCityId=").append(cCityId);
        sb.append(", isautoin=").append(isautoin);
        sb.append(", orderrate=").append(orderrate);
        sb.append(", retRate=").append(retRate);
        sb.append(", bigareamngId=").append(bigareamngId);
        sb.append(", isgroup=").append(isgroup);
        sb.append(", isaccount=").append(isaccount);
        sb.append(", cDepartmentId=").append(cDepartmentId);
        sb.append(", cClasscodeId=").append(cClasscodeId);
        sb.append(", code=").append(code);
        sb.append(", cAreaId=").append(cAreaId);
        sb.append(", priority=").append(priority);
        sb.append(", mDimcus1Id=").append(mDimcus1Id);
        sb.append(", mDimcus2Id=").append(mDimcus2Id);
        sb.append(", mDimcus3Id=").append(mDimcus3Id);
        sb.append(", mDimcus4Id=").append(mDimcus4Id);
        sb.append(", mDimcus5Id=").append(mDimcus5Id);
        sb.append(", mDimcus6Id=").append(mDimcus6Id);
        sb.append(", mDimcus7Id=").append(mDimcus7Id);
        sb.append(", mDimcus8Id=").append(mDimcus8Id);
        sb.append(", mDimcus9Id=").append(mDimcus9Id);
        sb.append(", mDimcus10Id=").append(mDimcus10Id);
        sb.append(", butsaledis=").append(butsaledis);
        sb.append(", agtsaledis=").append(agtsaledis);
        sb.append(", firsaleretdis=").append(firsaleretdis);
        sb.append(", agtsaleretdis=").append(agtsaleretdis);
        sb.append(", trandis=").append(trandis);
        sb.append(", cCusattrib1Id=").append(cCusattrib1Id);
        sb.append(", cCusattrib2Id=").append(cCusattrib2Id);
        sb.append(", cCusattrib3Id=").append(cCusattrib3Id);
        sb.append(", cCusattrib4Id=").append(cCusattrib4Id);
        sb.append(", cCusattrib5Id=").append(cCusattrib5Id);
        sb.append(", cCusattrib6Id=").append(cCusattrib6Id);
        sb.append(", cCusattrib7Id=").append(cCusattrib7Id);
        sb.append(", cCusattrib8Id=").append(cCusattrib8Id);
        sb.append(", cCusattrib9Id=").append(cCusattrib9Id);
        sb.append(", cCusattrib10Id=").append(cCusattrib10Id);
        sb.append(", cCusattrib11Id=").append(cCusattrib11Id);
        sb.append(", cCusattrib12Id=").append(cCusattrib12Id);
        sb.append(", cCusattrib13Id=").append(cCusattrib13Id);
        sb.append(", cCusattrib14Id=").append(cCusattrib14Id);
        sb.append(", cCusattrib15Id=").append(cCusattrib15Id);
        sb.append(", cCusattrib16Id=").append(cCusattrib16Id);
        sb.append(", cCusattrib17Id=").append(cCusattrib17Id);
        sb.append(", cCusattrib18Id=").append(cCusattrib18Id);
        sb.append(", cCusattrib19Id=").append(cCusattrib19Id);
        sb.append(", cCusattrib20Id=").append(cCusattrib20Id);
        sb.append(", canButsale=").append(canButsale);
        sb.append(", canNotbutsale=").append(canNotbutsale);
        sb.append(", canAgtsale=").append(canAgtsale);
        sb.append(", iscrefund=").append(iscrefund);
        sb.append(", cCustypeId=").append(cCustypeId);
        sb.append(", mDim1Id=").append(mDim1Id);
        sb.append(", mobile=").append(mobile);
        sb.append(", calculation=").append(calculation);
        sb.append(", iskd=").append(iskd);
        sb.append(", legalId=").append(legalId);
        sb.append(", firretrate=").append(firretrate);
        sb.append(", retrate=").append(retrate);
        sb.append(", agtretrate=").append(agtretrate);
        sb.append(", glCompany=").append(glCompany);
        sb.append(", profitcenter=").append(profitcenter);
        sb.append(", isthird=").append(isthird);
        sb.append(", legal=").append(legal);
        sb.append(", isPck=").append(isPck);
        sb.append(", isSalePck=").append(isSalePck);
        sb.append(", isRetputPck=").append(isRetputPck);
        sb.append(", imgurl1=").append(imgurl1);
        sb.append(", imgurl2=").append(imgurl2);
        sb.append(", imgurl3=").append(imgurl3);
        sb.append(", imgurl4=").append(imgurl4);
        sb.append(", imgurl5=").append(imgurl5);
        sb.append(", bCuscodeFormatId=").append(bCuscodeFormatId);
        sb.append(", saleinvitem=").append(saleinvitem);
        sb.append(", cFranchiseeId=").append(cFranchiseeId);
        sb.append(", cCusgroupId=").append(cCusgroupId);
        sb.append(", bank=").append(bank);
        sb.append(", cCurrencyId=").append(cCurrencyId);
        sb.append(", payway=").append(payway);
        sb.append(", tradeway=").append(tradeway);
        sb.append(", birthday=").append(birthday);
        sb.append(", franchiseeRelaship=").append(franchiseeRelaship);
        sb.append(", openstoreType=").append(openstoreType);
        sb.append(", stopdate=").append(stopdate);
        sb.append(", cBranchId=").append(cBranchId);
        sb.append(", cSalerId=").append(cSalerId);
        sb.append(", salesrepId=").append(salesrepId);
        sb.append("]");
        return sb.toString();
    }
}