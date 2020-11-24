package com.cros.vue.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author MaLei
 * @description: 库存统计类
 * @create 2020/11/20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class InventoryStatistics {
   private Long idp;
   private String year;
   private Integer chun;
   private Integer xia;
   private Integer chunxia;
   private Integer sum1;
   private Integer qiu;
   private Integer dong;
   private Integer qiudong;
   private Integer sum2;
   private Integer other;
   private Integer qita;
   private Integer total;
}
