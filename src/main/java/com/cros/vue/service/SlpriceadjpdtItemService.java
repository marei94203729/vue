package com.cros.vue.service;

import com.cros.vue.entity.SlpriceadjpdtItem;
import com.cros.vue.entity.SlpriceadjpdtItemExample;
import com.cros.vue.mapper.SlpriceadjpdtItemMapper;
import com.cros.vue.service.annotation.Execute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author MaLei
 * @description: 条件单服务类
 * @create 2020/11/19
 */
@Service
public class SlpriceadjpdtItemService {
    @Autowired
    SlpriceadjpdtItemMapper slpriceadjpdtItemMapper;
    @Transactional("firstTransactionManager")
    @Execute
    public List<SlpriceadjpdtItem> findSlpriceadjpdtItemByProduct(SlpriceadjpdtItemExample example){
        return slpriceadjpdtItemMapper.selectByExample(example);
    }
}
