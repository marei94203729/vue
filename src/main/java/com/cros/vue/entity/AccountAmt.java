package com.cros.vue.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountAmt implements Serializable {

    private Long id;
    private String code;
    private String name;
    private  String description;
    //期初
    private BigDecimal qcye;
    //销售扣款
    private BigDecimal saleamt;
    //退货扣款
    private BigDecimal retsaleamt;
    //其他扣款
    private BigDecimal qtamt;
    //客户收款
    private BigDecimal custamt;
    //应收余额
    private BigDecimal ysamt;
    //固定授信
    private BigDecimal sdsxamt;
    //临时授信
    private BigDecimal lssxamt;
    // 	已占用金额
    private BigDecimal zsaleamt;
    // 	资金余额
    private BigDecimal amtye;


}