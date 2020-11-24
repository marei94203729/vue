package com.cros.vue.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author MaLei
 * @description: 账面汇款金额类
 * @create 2020/11/18
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountAmtOne {
    private String areaname;
    private String branchName;
    private BigDecimal a;
    private BigDecimal b;
    private BigDecimal c;
    private BigDecimal d;
    private BigDecimal total;
    private BigDecimal e;
    private BigDecimal f;
}
