package com.cros.vue.service;

import com.cros.vue.entity.AccountAmtExample;
import com.cros.vue.entity.AccountAmtOne;
import com.cros.vue.entity.BasicInfo;
import com.cros.vue.entity.InventoryStatistics;
import com.cros.vue.mapper.InventoryStatisticsMapper;
import com.cros.vue.service.annotation.Execute;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author MaLei
 * @description: 库存查询服务类
 * @create 2020/11/20
 */
@Service
public class InventoryStatisticsService {
    @Autowired
    InventoryStatisticsMapper inventoryStatisticsMapper;

    @Transactional("firstTransactionManager")
    @Execute
    public List<InventoryStatistics> obtainInventoryStatistics(Long idp){
        return inventoryStatisticsMapper.listInventoryStatisticssByIdp(idp);
    }
    @Transactional("firstTransactionManager")
    public List<BasicInfo> getIdps(){
        return inventoryStatisticsMapper.listIdps();
    }
}
