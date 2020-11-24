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
        menus.add("/fieldHandler");
        menus.add("/exportInfoList");
        menus.add("/checkHistorySaleItem");
        menus.add("/checkHistorySaleItems");
        menus.add("/checkSaleRefundEidtor");
        menus.add("/queryCustByName");
        menus.add("/rejetBillCheckStatusEidtor");
        menus.add("/filterHandler");
        menus.add("/conditionDataHandler");
        menus.add("/queryAccountAmtEidtor");
        menus.add("/slpriceadjEidtor");
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
        objectNode3.put("title","改价支持");
        objectNode3.put("index","/Home/slpriceadj");
        objectNode3.put("icon","el-icon-s-management");
        arr1.add(objectNode3);
        ObjectNode objectNode4=jsonNodeFactory.objectNode();
        objectNode4.put("title","改价数据");
        objectNode4.put("index","/Home/slpriceadjpdtItem");
        objectNode4.put("icon","el-icon-s-check");
        arr1.add(objectNode4);
        menusNode.add(objectNode1);
        ObjectNode objectNode11=jsonNodeFactory.objectNode();
        objectNode11.put("title","数据查询");
        objectNode11.put("index","2");
        objectNode11.put("icon","el-icon-picture-outline-round");
        ArrayNode arr11=objectNode11.putArray("data");
        ObjectNode objectNode12=jsonNodeFactory.objectNode();
        objectNode12.put("title","科目余额");
        objectNode12.put("index","/Home/accountAmt");
        objectNode12.put("icon","el-icon-s-data");
        arr11.add(objectNode12);
        ObjectNode objectNode13=jsonNodeFactory.objectNode();
        objectNode13.put("title","汇款汇总");
        objectNode13.put("index","/Home/recable");
        objectNode13.put("icon","el-icon-s-grid");
        arr11.add(objectNode13);
        ObjectNode objectNode14=jsonNodeFactory.objectNode();
        objectNode14.put("title","库存汇总");
        objectNode14.put("index","/Home/inventory");
        objectNode14.put("icon","el-icon-s-marketing");
        arr11.add(objectNode14);
        ObjectNode objectNode15=jsonNodeFactory.objectNode();
        objectNode15.put("title","出库统计");
        objectNode15.put("index","/Home/sale");
        objectNode15.put("icon","el-icon-tickets");
        arr11.add(objectNode15);
        menusNode.add(objectNode11);
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
