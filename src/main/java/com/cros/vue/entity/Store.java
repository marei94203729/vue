package com.cros.vue.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Store implements Serializable {
    private Long id;
    //关店标志539
    private String isStop;
    //是否可用238
    private String isactive;
    private String partNo;
    private String name;

    private String description;

    private Long cAreaId;
    private String areaName;
    private Long cCustomerId;
    private String custCode;
    private String custName;
    private String code;

    private Long cBlockId;
    private String blockCode;
    private String blockName;
    private Long cSalerId;
    private String salerName;
    private Long cBranchId;
    private String branchName;
    private static final long serialVersionUID = 1L;
}