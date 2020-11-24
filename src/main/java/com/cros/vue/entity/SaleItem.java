package com.cros.vue.entity;

import com.cros.vue.common.AmountSerializerUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class SaleItem implements Serializable {
    private Long id;

    private Long qtyOut;
    private Long cDestId;
    private String mProductName;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT")
    private Date billDate;
    private String docon;
    @JsonSerialize(using = AmountSerializerUtils.class)//自定义格式化输出金额
    private BigDecimal priceActual;
    private String saleWaysName;
}