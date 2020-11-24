package com.cros.vue.service;

import com.cros.vue.entity.BasicInfo;
import com.cros.vue.entity.Store;
import com.cros.vue.entity.StoreExample;
import com.cros.vue.mapper.BasicInfoMapper;
import com.cros.vue.mapper.StoreMapper;
import com.cros.vue.service.annotation.Execute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author MaLei
 * @description: 店仓档案服务类
 * @create 2020/11/9
 */
@Service
public class StoreService {
    @Autowired
    BasicInfoMapper basicInfoMapper;
    @Autowired
    StoreMapper storeMapper;
    @Transactional("firstTransactionManager")
    @Execute
    public List<Store> obtainStores(StoreExample example){
        return storeMapper.selectByExample(example);
    }
    //关店标志
    @Transactional("firstTransactionManager")
    public List<BasicInfo> getIsStop(){
        return basicInfoMapper.listByLimitvalueGroupId(539l);
    }
    //是否可用
    @Transactional("firstTransactionManager")
    public List<BasicInfo> getIsActive(){
        return basicInfoMapper.listByLimitvalueGroupId(238l);
    }
}
