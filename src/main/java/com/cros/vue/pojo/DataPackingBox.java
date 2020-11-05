package com.cros.vue.pojo;

import lombok.Data;

import java.util.Collection;

/**
 * @author MaLei
 * @description: 分页查询返回数据包装类
 * @create 2020/9/4
 */
@Data
public class DataPackingBox {
    private long total;
    private int page;
    private Collection<?> data;
}
