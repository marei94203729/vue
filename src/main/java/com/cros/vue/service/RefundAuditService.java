package com.cros.vue.service;

import com.cros.vue.entity.RefundAudit;
import com.cros.vue.entity.RefundAuditExample;
import com.cros.vue.mapper.RefundAuditMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author MaLei
 * @description: 退货单审核服务类
 * @create 2020/11/4
 */
@Service
public class RefundAuditService {
    @Autowired
    RefundAuditMapper refundAuditMapper;
    @Transactional("firstTransactionManager")
    public List<RefundAudit> obtainRefundAudits(RefundAuditExample example){
        return refundAuditMapper.selectByExample(example);
    }
    @Transactional("firstTransactionManager")
    public RefundAudit findRefundAuditById(long id){
       return refundAuditMapper.selectByPrimaryKey(id);
    }
}
