package com.cros.vue.pojo;

import lombok.Data;

/**
 * @author MaLei
 * @description: 菜单类
 * @create 2020/10/28
 */
@Data
public class Menu implements Comparable<Menu> {
    private String title;
    private int index;
    private String icon;
    private String route;
    private int parentId;
    @Override
    public int compareTo(Menu o) {
        return this.index-o.index;
    }
}
