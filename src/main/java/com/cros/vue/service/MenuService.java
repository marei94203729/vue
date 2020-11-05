package com.cros.vue.service;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @author MaLei
 * @description: 菜单服务类
 * @create 2020/10/28
 */
@Component
public class MenuService {
    @Getter
    private ArrayNode menusNode;
    private Set<String> menus;
    public MenuService(){
        menus=new HashSet<>(0);
        menus.add("/");
        menus.add("/Home");
        menus.add("/apis/menu");
        //初始化menusNode
        JsonNodeFactory jsonNodeFactory=JsonNodeFactory.instance;
        menusNode=jsonNodeFactory.arrayNode();
        ObjectNode objectNode1=jsonNodeFactory.objectNode();
        objectNode1.put("title","审核支持");
        objectNode1.put("index","1");
        objectNode1.put("icon","el-icon-s-grid");
        //ArrayNode arr1=jsonNodeFactory.arrayNode();
        ArrayNode arr1=objectNode1.putArray("data");
        ObjectNode objectNode2=jsonNodeFactory.objectNode();
        objectNode2.put("title","退货审核");
        objectNode2.put("index","/Home/refund");
        objectNode2.put("icon","el-icon-location");
        arr1.add(objectNode2);
        ObjectNode objectNode3=jsonNodeFactory.objectNode();
        objectNode3.put("title","改价数据");
        objectNode3.put("index","1-2");
        objectNode3.put("icon","el-icon-s-check");
        arr1.add(objectNode3);
        menusNode.add(objectNode1);
    }

    /**
     * 检测是否存在指定菜单存在返回true
     * @param url
     * @return
     */
    public boolean hasMenu(String url){
        return menus.contains(url);
    }
}
