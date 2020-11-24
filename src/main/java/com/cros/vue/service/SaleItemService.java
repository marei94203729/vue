package com.cros.vue.service;

import com.cros.vue.entity.SaleItem;
import com.cros.vue.entity.SaleItemExample;
import com.cros.vue.mapper.SaleItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author MaLei
 * @description: 销售明细服务类
 * @create 2020/11/11
 */
@Service
public class SaleItemService {
    @Autowired
    SaleItemMapper saleItemMapper;
    @Transactional("firstTransactionManager")
    public List<SaleItem> obtainItemsBySingle(String productName,Long storeid){
        return saleItemMapper.listByInfo(productName,storeid);
    }
    @Transactional("firstTransactionManager")
    public List<SaleItem> obtainItemsByList(String productName,List<String> custs){
        SaleItemExample example=new SaleItemExample();
        example.setCusts(custs);
        example.setProductName(productName);
        return saleItemMapper.selectByExample(example);
    }
}
