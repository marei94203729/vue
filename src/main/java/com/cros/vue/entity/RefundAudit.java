package com.cros.vue.entity;

import com.cros.vue.service.StoreService;
import com.cros.vue.service.annotation.Cascade;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefundAudit implements Serializable {
    private Long id;
    @Getter
    @Setter
    private String storeName;
    @Getter
    @Setter
    private String storeCode;
    @Getter
    @Setter
    private String blockName;
    @Getter
    @Setter
    private String blockCode;
    @Getter
    @Setter
    private String lcName;
    @Getter
    @Setter
    private String lcCode;
    @Getter
    @Setter
    private String lcDescription;
    @Getter
    @Setter
    private String custName;
    @Getter
    @Setter
    private String custCode;
    @Getter
    @Setter
    private String custDescription;
    //退货审核单详细矩阵属性
    @Getter
    @Setter
    private List<RefundAuditItem> items;
    private Long adClientId;

    private Long adOrgId;

    private Long ownerid;

    private Long modifierid;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    private Date creationdate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    private Date modifieddate;

    private String isactive;

    private String docno;

    private String doctype;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT")
    private Date billdate;

    private Long salesrepId;

    private Long cStoreId;

    private Long cCustomerId;

    private String description;

    private String auState;

    private Long auPiId;

    private BigDecimal avgDiscount;

    private Long totLines;

    private Short totQty;

    private BigDecimal totAmtList;

    private BigDecimal totAmtActual;

    private Long cPeriodId;
    @Cascade(value = "StoreService",method = "obtainStores",argsType =StoreExample.class,assign = Store.class)
    private Long cOrigId;

    private Short outStatus;

    private Short inStatus;

    private Long totQtyout;

    private BigDecimal totAmtoutList;

    private BigDecimal totAmtoutActual;

    private Long totQtyin;

    private BigDecimal totAmtinList;

    private BigDecimal totAmtinActual;

    private String diffreason;

    private Integer dateout;

    private Integer datein;

    private Long cCustomerupId;

    private String retsaletype;
    @Getter
    @Setter
    private String retsaleName;
    private String retsaletype1;

    private Long statuserid;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    private Date statustime;

    private Long inerid;

    private Date intime;

    private Long outerid;

    private Date outtime;

    private Long cRetSaletypeId;

    private Short boxStatus;

    private Long cTranwayJzId;

    private String tranwayno;

    private BigDecimal tranwayPay;

    private Long operatoerid;

    private String operStatus;

    private Long pickerid;

    private String isuf;

    private Short processMode;

    private BigDecimal totAmtPrecost;

    private BigDecimal totAmtinPrecost;

    private BigDecimal discount;

    private Short isbox;

    private Long cSaledistypeId;

    private String imageurl;

    private Long cCargotypeId;

    private Long cStoreLocationId;

    private Long printtimes;

    private Long printouttimes;

    private Long printintimes;

    private Long cCargointypeId;

    private String scanstate;

    private Long sendqty;

    private Long subsendqty;

    private Integer realdate;

    private String ifmove;

    private String outAuState;

    private Long outAuPiId;

    private String inAuState;

    private Long inAuPiId;

    private BigDecimal totAmtPrice;

    private BigDecimal amtDeduction;

    private Short pckStatus;

    private Long pcheckid;

    private Date pchecktime;

    private BigDecimal totAmtinved;

    private Long totQtyinved;

    private Long mCroretsaleId;

    private String isMainRetsale;

    private String isCroretsalein;

    private String carrier;

    private String shippingRemark;

    private String isTowms;

    private String destAddr;

    private Long mBoxId;

    private Long qtyBox;

    private BigDecimal totTaxAmt;

    private BigDecimal totNotaxAmt;

    private BigDecimal taxDis;

    private String paymentstyle;

    private Short scanStatus;

    private Short billkind;
    @Getter
    @Setter
    private String billName;
    private String contractnoFile;

    private Short confirmStatus;

    private Date confirmStatustime;

    private Long confirmStatuserid;

    private String billno;

    private String fisno;

    private Short byinStatus;

    private Long scannerid;

    private Long cSalerId;

    private Date scanIntime;

    private Date confirmIntime;

    private Date deliveryConfirmtime;

    private Short byoutStatus;

    private Long unpickStoreId;

    private Short scaninStatus;

    private String behalfRemark;

    private String isdefaultscan;

    private Short status;
    @Getter
    @Setter
    private String statusName;
    private String retinfo;

    private Short saleType;
    @Getter
    @Setter
    private String saleName;
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

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno == null ? null : docno.trim();
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype == null ? null : doctype.trim();
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public Long getSalesrepId() {
        return salesrepId;
    }

    public void setSalesrepId(Long salesrepId) {
        this.salesrepId = salesrepId;
    }

    public Long getcStoreId() {
        return cStoreId;
    }

    public void setcStoreId(Long cStoreId) {
        this.cStoreId = cStoreId;
    }

    public Long getcCustomerId() {
        return cCustomerId;
    }

    public void setcCustomerId(Long cCustomerId) {
        this.cCustomerId = cCustomerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAuState() {
        return auState;
    }

    public void setAuState(String auState) {
        this.auState = auState == null ? null : auState.trim();
    }

    public Long getAuPiId() {
        return auPiId;
    }

    public void setAuPiId(Long auPiId) {
        this.auPiId = auPiId;
    }

    public BigDecimal getAvgDiscount() {
        return avgDiscount;
    }

    public void setAvgDiscount(BigDecimal avgDiscount) {
        this.avgDiscount = avgDiscount;
    }

    public Long getTotLines() {
        return totLines;
    }

    public void setTotLines(Long totLines) {
        this.totLines = totLines;
    }

    public Short getTotQty() {
        return totQty;
    }

    public void setTotQty(Short totQty) {
        this.totQty = totQty;
    }

    public BigDecimal getTotAmtList() {
        return totAmtList;
    }

    public void setTotAmtList(BigDecimal totAmtList) {
        this.totAmtList = totAmtList;
    }

    public BigDecimal getTotAmtActual() {
        return totAmtActual;
    }

    public void setTotAmtActual(BigDecimal totAmtActual) {
        this.totAmtActual = totAmtActual;
    }

    public Long getcPeriodId() {
        return cPeriodId;
    }

    public void setcPeriodId(Long cPeriodId) {
        this.cPeriodId = cPeriodId;
    }

    public Long getcOrigId() {
        return cOrigId;
    }

    public void setcOrigId(Long cOrigId) {
        this.cOrigId = cOrigId;
    }

    public Short getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(Short outStatus) {
        this.outStatus = outStatus;
    }

    public Short getInStatus() {
        return inStatus;
    }

    public void setInStatus(Short inStatus) {
        this.inStatus = inStatus;
    }

    public Long getTotQtyout() {
        return totQtyout;
    }

    public void setTotQtyout(Long totQtyout) {
        this.totQtyout = totQtyout;
    }

    public BigDecimal getTotAmtoutList() {
        return totAmtoutList;
    }

    public void setTotAmtoutList(BigDecimal totAmtoutList) {
        this.totAmtoutList = totAmtoutList;
    }

    public BigDecimal getTotAmtoutActual() {
        return totAmtoutActual;
    }

    public void setTotAmtoutActual(BigDecimal totAmtoutActual) {
        this.totAmtoutActual = totAmtoutActual;
    }

    public Long getTotQtyin() {
        return totQtyin;
    }

    public void setTotQtyin(Long totQtyin) {
        this.totQtyin = totQtyin;
    }

    public BigDecimal getTotAmtinList() {
        return totAmtinList;
    }

    public void setTotAmtinList(BigDecimal totAmtinList) {
        this.totAmtinList = totAmtinList;
    }

    public BigDecimal getTotAmtinActual() {
        return totAmtinActual;
    }

    public void setTotAmtinActual(BigDecimal totAmtinActual) {
        this.totAmtinActual = totAmtinActual;
    }

    public String getDiffreason() {
        return diffreason;
    }

    public void setDiffreason(String diffreason) {
        this.diffreason = diffreason == null ? null : diffreason.trim();
    }

    public Integer getDateout() {
        return dateout;
    }

    public void setDateout(Integer dateout) {
        this.dateout = dateout;
    }

    public Integer getDatein() {
        return datein;
    }

    public void setDatein(Integer datein) {
        this.datein = datein;
    }

    public Long getcCustomerupId() {
        return cCustomerupId;
    }

    public void setcCustomerupId(Long cCustomerupId) {
        this.cCustomerupId = cCustomerupId;
    }

    public String getRetsaletype() {
        return retsaletype;
    }

    public void setRetsaletype(String retsaletype) {
        this.retsaletype = retsaletype == null ? null : retsaletype.trim();
    }

    public String getRetsaletype1() {
        return retsaletype1;
    }

    public void setRetsaletype1(String retsaletype1) {
        this.retsaletype1 = retsaletype1 == null ? null : retsaletype1.trim();
    }

    public Long getStatuserid() {
        return statuserid;
    }

    public void setStatuserid(Long statuserid) {
        this.statuserid = statuserid;
    }

    public Date getStatustime() {
        return statustime;
    }

    public void setStatustime(Date statustime) {
        this.statustime = statustime;
    }

    public Long getInerid() {
        return inerid;
    }

    public void setInerid(Long inerid) {
        this.inerid = inerid;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Long getOuterid() {
        return outerid;
    }

    public void setOuterid(Long outerid) {
        this.outerid = outerid;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Long getcRetSaletypeId() {
        return cRetSaletypeId;
    }

    public void setcRetSaletypeId(Long cRetSaletypeId) {
        this.cRetSaletypeId = cRetSaletypeId;
    }

    public Short getBoxStatus() {
        return boxStatus;
    }

    public void setBoxStatus(Short boxStatus) {
        this.boxStatus = boxStatus;
    }

    public Long getcTranwayJzId() {
        return cTranwayJzId;
    }

    public void setcTranwayJzId(Long cTranwayJzId) {
        this.cTranwayJzId = cTranwayJzId;
    }

    public String getTranwayno() {
        return tranwayno;
    }

    public void setTranwayno(String tranwayno) {
        this.tranwayno = tranwayno == null ? null : tranwayno.trim();
    }

    public BigDecimal getTranwayPay() {
        return tranwayPay;
    }

    public void setTranwayPay(BigDecimal tranwayPay) {
        this.tranwayPay = tranwayPay;
    }

    public Long getOperatoerid() {
        return operatoerid;
    }

    public void setOperatoerid(Long operatoerid) {
        this.operatoerid = operatoerid;
    }

    public String getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(String operStatus) {
        this.operStatus = operStatus == null ? null : operStatus.trim();
    }

    public Long getPickerid() {
        return pickerid;
    }

    public void setPickerid(Long pickerid) {
        this.pickerid = pickerid;
    }

    public String getIsuf() {
        return isuf;
    }

    public void setIsuf(String isuf) {
        this.isuf = isuf == null ? null : isuf.trim();
    }

    public Short getProcessMode() {
        return processMode;
    }

    public void setProcessMode(Short processMode) {
        this.processMode = processMode;
    }

    public BigDecimal getTotAmtPrecost() {
        return totAmtPrecost;
    }

    public void setTotAmtPrecost(BigDecimal totAmtPrecost) {
        this.totAmtPrecost = totAmtPrecost;
    }

    public BigDecimal getTotAmtinPrecost() {
        return totAmtinPrecost;
    }

    public void setTotAmtinPrecost(BigDecimal totAmtinPrecost) {
        this.totAmtinPrecost = totAmtinPrecost;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Short getIsbox() {
        return isbox;
    }

    public void setIsbox(Short isbox) {
        this.isbox = isbox;
    }

    public Long getcSaledistypeId() {
        return cSaledistypeId;
    }

    public void setcSaledistypeId(Long cSaledistypeId) {
        this.cSaledistypeId = cSaledistypeId;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public Long getcCargotypeId() {
        return cCargotypeId;
    }

    public void setcCargotypeId(Long cCargotypeId) {
        this.cCargotypeId = cCargotypeId;
    }

    public Long getcStoreLocationId() {
        return cStoreLocationId;
    }

    public void setcStoreLocationId(Long cStoreLocationId) {
        this.cStoreLocationId = cStoreLocationId;
    }

    public Long getPrinttimes() {
        return printtimes;
    }

    public void setPrinttimes(Long printtimes) {
        this.printtimes = printtimes;
    }

    public Long getPrintouttimes() {
        return printouttimes;
    }

    public void setPrintouttimes(Long printouttimes) {
        this.printouttimes = printouttimes;
    }

    public Long getPrintintimes() {
        return printintimes;
    }

    public void setPrintintimes(Long printintimes) {
        this.printintimes = printintimes;
    }

    public Long getcCargointypeId() {
        return cCargointypeId;
    }

    public void setcCargointypeId(Long cCargointypeId) {
        this.cCargointypeId = cCargointypeId;
    }

    public String getScanstate() {
        return scanstate;
    }

    public void setScanstate(String scanstate) {
        this.scanstate = scanstate == null ? null : scanstate.trim();
    }

    public Long getSendqty() {
        return sendqty;
    }

    public void setSendqty(Long sendqty) {
        this.sendqty = sendqty;
    }

    public Long getSubsendqty() {
        return subsendqty;
    }

    public void setSubsendqty(Long subsendqty) {
        this.subsendqty = subsendqty;
    }

    public Integer getRealdate() {
        return realdate;
    }

    public void setRealdate(Integer realdate) {
        this.realdate = realdate;
    }

    public String getIfmove() {
        return ifmove;
    }

    public void setIfmove(String ifmove) {
        this.ifmove = ifmove == null ? null : ifmove.trim();
    }

    public String getOutAuState() {
        return outAuState;
    }

    public void setOutAuState(String outAuState) {
        this.outAuState = outAuState == null ? null : outAuState.trim();
    }

    public Long getOutAuPiId() {
        return outAuPiId;
    }

    public void setOutAuPiId(Long outAuPiId) {
        this.outAuPiId = outAuPiId;
    }

    public String getInAuState() {
        return inAuState;
    }

    public void setInAuState(String inAuState) {
        this.inAuState = inAuState == null ? null : inAuState.trim();
    }

    public Long getInAuPiId() {
        return inAuPiId;
    }

    public void setInAuPiId(Long inAuPiId) {
        this.inAuPiId = inAuPiId;
    }

    public BigDecimal getTotAmtPrice() {
        return totAmtPrice;
    }

    public void setTotAmtPrice(BigDecimal totAmtPrice) {
        this.totAmtPrice = totAmtPrice;
    }

    public BigDecimal getAmtDeduction() {
        return amtDeduction;
    }

    public void setAmtDeduction(BigDecimal amtDeduction) {
        this.amtDeduction = amtDeduction;
    }

    public Short getPckStatus() {
        return pckStatus;
    }

    public void setPckStatus(Short pckStatus) {
        this.pckStatus = pckStatus;
    }

    public Long getPcheckid() {
        return pcheckid;
    }

    public void setPcheckid(Long pcheckid) {
        this.pcheckid = pcheckid;
    }

    public Date getPchecktime() {
        return pchecktime;
    }

    public void setPchecktime(Date pchecktime) {
        this.pchecktime = pchecktime;
    }

    public BigDecimal getTotAmtinved() {
        return totAmtinved;
    }

    public void setTotAmtinved(BigDecimal totAmtinved) {
        this.totAmtinved = totAmtinved;
    }

    public Long getTotQtyinved() {
        return totQtyinved;
    }

    public void setTotQtyinved(Long totQtyinved) {
        this.totQtyinved = totQtyinved;
    }

    public Long getmCroretsaleId() {
        return mCroretsaleId;
    }

    public void setmCroretsaleId(Long mCroretsaleId) {
        this.mCroretsaleId = mCroretsaleId;
    }

    public String getIsMainRetsale() {
        return isMainRetsale;
    }

    public void setIsMainRetsale(String isMainRetsale) {
        this.isMainRetsale = isMainRetsale == null ? null : isMainRetsale.trim();
    }

    public String getIsCroretsalein() {
        return isCroretsalein;
    }

    public void setIsCroretsalein(String isCroretsalein) {
        this.isCroretsalein = isCroretsalein == null ? null : isCroretsalein.trim();
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getShippingRemark() {
        return shippingRemark;
    }

    public void setShippingRemark(String shippingRemark) {
        this.shippingRemark = shippingRemark == null ? null : shippingRemark.trim();
    }

    public String getIsTowms() {
        return isTowms;
    }

    public void setIsTowms(String isTowms) {
        this.isTowms = isTowms == null ? null : isTowms.trim();
    }

    public String getDestAddr() {
        return destAddr;
    }

    public void setDestAddr(String destAddr) {
        this.destAddr = destAddr == null ? null : destAddr.trim();
    }

    public Long getmBoxId() {
        return mBoxId;
    }

    public void setmBoxId(Long mBoxId) {
        this.mBoxId = mBoxId;
    }

    public Long getQtyBox() {
        return qtyBox;
    }

    public void setQtyBox(Long qtyBox) {
        this.qtyBox = qtyBox;
    }

    public BigDecimal getTotTaxAmt() {
        return totTaxAmt;
    }

    public void setTotTaxAmt(BigDecimal totTaxAmt) {
        this.totTaxAmt = totTaxAmt;
    }

    public BigDecimal getTotNotaxAmt() {
        return totNotaxAmt;
    }

    public void setTotNotaxAmt(BigDecimal totNotaxAmt) {
        this.totNotaxAmt = totNotaxAmt;
    }

    public BigDecimal getTaxDis() {
        return taxDis;
    }

    public void setTaxDis(BigDecimal taxDis) {
        this.taxDis = taxDis;
    }

    public String getPaymentstyle() {
        return paymentstyle;
    }

    public void setPaymentstyle(String paymentstyle) {
        this.paymentstyle = paymentstyle == null ? null : paymentstyle.trim();
    }

    public Short getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(Short scanStatus) {
        this.scanStatus = scanStatus;
    }

    public Short getBillkind() {
        return billkind;
    }

    public void setBillkind(Short billkind) {
        this.billkind = billkind;
    }

    public String getContractnoFile() {
        return contractnoFile;
    }

    public void setContractnoFile(String contractnoFile) {
        this.contractnoFile = contractnoFile == null ? null : contractnoFile.trim();
    }

    public Short getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Short confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Date getConfirmStatustime() {
        return confirmStatustime;
    }

    public void setConfirmStatustime(Date confirmStatustime) {
        this.confirmStatustime = confirmStatustime;
    }

    public Long getConfirmStatuserid() {
        return confirmStatuserid;
    }

    public void setConfirmStatuserid(Long confirmStatuserid) {
        this.confirmStatuserid = confirmStatuserid;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getFisno() {
        return fisno;
    }

    public void setFisno(String fisno) {
        this.fisno = fisno == null ? null : fisno.trim();
    }

    public Short getByinStatus() {
        return byinStatus;
    }

    public void setByinStatus(Short byinStatus) {
        this.byinStatus = byinStatus;
    }

    public Long getScannerid() {
        return scannerid;
    }

    public void setScannerid(Long scannerid) {
        this.scannerid = scannerid;
    }

    public Long getcSalerId() {
        return cSalerId;
    }

    public void setcSalerId(Long cSalerId) {
        this.cSalerId = cSalerId;
    }

    public Date getScanIntime() {
        return scanIntime;
    }

    public void setScanIntime(Date scanIntime) {
        this.scanIntime = scanIntime;
    }

    public Date getConfirmIntime() {
        return confirmIntime;
    }

    public void setConfirmIntime(Date confirmIntime) {
        this.confirmIntime = confirmIntime;
    }

    public Date getDeliveryConfirmtime() {
        return deliveryConfirmtime;
    }

    public void setDeliveryConfirmtime(Date deliveryConfirmtime) {
        this.deliveryConfirmtime = deliveryConfirmtime;
    }

    public Short getByoutStatus() {
        return byoutStatus;
    }

    public void setByoutStatus(Short byoutStatus) {
        this.byoutStatus = byoutStatus;
    }

    public Long getUnpickStoreId() {
        return unpickStoreId;
    }

    public void setUnpickStoreId(Long unpickStoreId) {
        this.unpickStoreId = unpickStoreId;
    }

    public Short getScaninStatus() {
        return scaninStatus;
    }

    public void setScaninStatus(Short scaninStatus) {
        this.scaninStatus = scaninStatus;
    }

    public String getBehalfRemark() {
        return behalfRemark;
    }

    public void setBehalfRemark(String behalfRemark) {
        this.behalfRemark = behalfRemark == null ? null : behalfRemark.trim();
    }

    public String getIsdefaultscan() {
        return isdefaultscan;
    }

    public void setIsdefaultscan(String isdefaultscan) {
        this.isdefaultscan = isdefaultscan == null ? null : isdefaultscan.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getRetinfo() {
        return retinfo;
    }

    public void setRetinfo(String retinfo) {
        this.retinfo = retinfo == null ? null : retinfo.trim();
    }

    public Short getSaleType() {
        return saleType;
    }

    public void setSaleType(Short saleType) {
        this.saleType = saleType;
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
        sb.append(", docno=").append(docno);
        sb.append(", doctype=").append(doctype);
        sb.append(", billdate=").append(billdate);
        sb.append(", salesrepId=").append(salesrepId);
        sb.append(", cStoreId=").append(cStoreId);
        sb.append(", cCustomerId=").append(cCustomerId);
        sb.append(", description=").append(description);
        sb.append(", auState=").append(auState);
        sb.append(", auPiId=").append(auPiId);
        sb.append(", avgDiscount=").append(avgDiscount);
        sb.append(", totLines=").append(totLines);
        sb.append(", totQty=").append(totQty);
        sb.append(", totAmtList=").append(totAmtList);
        sb.append(", totAmtActual=").append(totAmtActual);
        sb.append(", cPeriodId=").append(cPeriodId);
        sb.append(", cOrigId=").append(cOrigId);
        sb.append(", outStatus=").append(outStatus);
        sb.append(", inStatus=").append(inStatus);
        sb.append(", totQtyout=").append(totQtyout);
        sb.append(", totAmtoutList=").append(totAmtoutList);
        sb.append(", totAmtoutActual=").append(totAmtoutActual);
        sb.append(", totQtyin=").append(totQtyin);
        sb.append(", totAmtinList=").append(totAmtinList);
        sb.append(", totAmtinActual=").append(totAmtinActual);
        sb.append(", diffreason=").append(diffreason);
        sb.append(", dateout=").append(dateout);
        sb.append(", datein=").append(datein);
        sb.append(", cCustomerupId=").append(cCustomerupId);
        sb.append(", retsaletype=").append(retsaletype);
        sb.append(", retsaletype1=").append(retsaletype1);
        sb.append(", statuserid=").append(statuserid);
        sb.append(", statustime=").append(statustime);
        sb.append(", inerid=").append(inerid);
        sb.append(", intime=").append(intime);
        sb.append(", outerid=").append(outerid);
        sb.append(", outtime=").append(outtime);
        sb.append(", cRetSaletypeId=").append(cRetSaletypeId);
        sb.append(", boxStatus=").append(boxStatus);
        sb.append(", cTranwayJzId=").append(cTranwayJzId);
        sb.append(", tranwayno=").append(tranwayno);
        sb.append(", tranwayPay=").append(tranwayPay);
        sb.append(", operatoerid=").append(operatoerid);
        sb.append(", operStatus=").append(operStatus);
        sb.append(", pickerid=").append(pickerid);
        sb.append(", isuf=").append(isuf);
        sb.append(", processMode=").append(processMode);
        sb.append(", totAmtPrecost=").append(totAmtPrecost);
        sb.append(", totAmtinPrecost=").append(totAmtinPrecost);
        sb.append(", discount=").append(discount);
        sb.append(", isbox=").append(isbox);
        sb.append(", cSaledistypeId=").append(cSaledistypeId);
        sb.append(", imageurl=").append(imageurl);
        sb.append(", cCargotypeId=").append(cCargotypeId);
        sb.append(", cStoreLocationId=").append(cStoreLocationId);
        sb.append(", printtimes=").append(printtimes);
        sb.append(", printouttimes=").append(printouttimes);
        sb.append(", printintimes=").append(printintimes);
        sb.append(", cCargointypeId=").append(cCargointypeId);
        sb.append(", scanstate=").append(scanstate);
        sb.append(", sendqty=").append(sendqty);
        sb.append(", subsendqty=").append(subsendqty);
        sb.append(", realdate=").append(realdate);
        sb.append(", ifmove=").append(ifmove);
        sb.append(", outAuState=").append(outAuState);
        sb.append(", outAuPiId=").append(outAuPiId);
        sb.append(", inAuState=").append(inAuState);
        sb.append(", inAuPiId=").append(inAuPiId);
        sb.append(", totAmtPrice=").append(totAmtPrice);
        sb.append(", amtDeduction=").append(amtDeduction);
        sb.append(", pckStatus=").append(pckStatus);
        sb.append(", pcheckid=").append(pcheckid);
        sb.append(", pchecktime=").append(pchecktime);
        sb.append(", totAmtinved=").append(totAmtinved);
        sb.append(", totQtyinved=").append(totQtyinved);
        sb.append(", mCroretsaleId=").append(mCroretsaleId);
        sb.append(", isMainRetsale=").append(isMainRetsale);
        sb.append(", isCroretsalein=").append(isCroretsalein);
        sb.append(", carrier=").append(carrier);
        sb.append(", shippingRemark=").append(shippingRemark);
        sb.append(", isTowms=").append(isTowms);
        sb.append(", destAddr=").append(destAddr);
        sb.append(", mBoxId=").append(mBoxId);
        sb.append(", qtyBox=").append(qtyBox);
        sb.append(", totTaxAmt=").append(totTaxAmt);
        sb.append(", totNotaxAmt=").append(totNotaxAmt);
        sb.append(", taxDis=").append(taxDis);
        sb.append(", paymentstyle=").append(paymentstyle);
        sb.append(", scanStatus=").append(scanStatus);
        sb.append(", billkind=").append(billkind);
        sb.append(", contractnoFile=").append(contractnoFile);
        sb.append(", confirmStatus=").append(confirmStatus);
        sb.append(", confirmStatustime=").append(confirmStatustime);
        sb.append(", confirmStatuserid=").append(confirmStatuserid);
        sb.append(", billno=").append(billno);
        sb.append(", fisno=").append(fisno);
        sb.append(", byinStatus=").append(byinStatus);
        sb.append(", scannerid=").append(scannerid);
        sb.append(", cSalerId=").append(cSalerId);
        sb.append(", scanIntime=").append(scanIntime);
        sb.append(", confirmIntime=").append(confirmIntime);
        sb.append(", deliveryConfirmtime=").append(deliveryConfirmtime);
        sb.append(", byoutStatus=").append(byoutStatus);
        sb.append(", unpickStoreId=").append(unpickStoreId);
        sb.append(", scaninStatus=").append(scaninStatus);
        sb.append(", behalfRemark=").append(behalfRemark);
        sb.append(", isdefaultscan=").append(isdefaultscan);
        sb.append(", status=").append(status);
        sb.append(", retinfo=").append(retinfo);
        sb.append(", saleType=").append(saleType);
        sb.append("]");
        return sb.toString();
    }
}