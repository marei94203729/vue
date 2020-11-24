package com.cros.vue.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class SaleItemExample {
    private List<String> custs;
    private String productName;
}