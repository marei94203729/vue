package com.cros.vue.service;

import com.cros.vue.entity.RefundAuditItem;
import com.cros.vue.entity.RefundAuditItemExample;
import com.cros.vue.mapper.RefundAuditItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author MaLei
 * @description: 退货审核单矩阵明细服务类
 * @create 2020/11/5
 */
@Service
public class RefundAuditItemService {
    @Autowired
    RefundAuditItemMapper refundAuditItemMapper;
    @Transactional("firstTransactionManager")
    public List<RefundAuditItem> obtainRefundAuditItems(long refundAuditId){
        RefundAuditItemExample example =new RefundAuditItemExample();
        RefundAuditItemExample.Criteria criteria =example.createCriteria();
        criteria.andMRetSaleIdEqualTo(refundAuditId);
        return refundAuditItemMapper.selectByExample(example);
    }
}
