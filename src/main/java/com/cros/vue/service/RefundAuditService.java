package com.cros.vue.service;

import com.cros.vue.entity.BasicInfo;
import com.cros.vue.entity.RefundAudit;
import com.cros.vue.entity.RefundAuditExample;
import com.cros.vue.mapper.BasicInfoMapper;
import com.cros.vue.mapper.RefundAuditMapper;
import com.cros.vue.service.annotation.Execute;
import com.cros.vue.service.annotation.Read;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.HashMap;
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
    @Autowired
    BasicInfoMapper basicInfoMapper;
    @Transactional("firstTransactionManager")
    @Execute
    public List<RefundAudit> obtainRefundAudits(RefundAuditExample example){
        return refundAuditMapper.selectByExample(example);
    }
    @Transactional("firstTransactionManager")
    @Read
    public RefundAudit findRefundAuditById(long id){
       return refundAuditMapper.selectByPrimaryKey(id);
    }
    //销售类型
    @Transactional("firstTransactionManager")
    public List<BasicInfo> getSaleType(){
        return basicInfoMapper.listByLimitvalueGroupId(1728l);
    }
    //退货类型
    @Transactional("firstTransactionManager")
    public List<BasicInfo> getRetType(){
        return basicInfoMapper.listByLimitvalueGroupId(1529l);
    }
    //退货类型
    @Transactional("firstTransactionManager")
    public List<BasicInfo> getRetStatus(){
        return basicInfoMapper.listByLimitvalueGroupId(1609l);
    }
    //退货单据种类
    @Transactional("firstTransactionManager")
    public List<BasicInfo> getRetBillType(){
        return basicInfoMapper.listByLimitvalueGroupId(1522l);
    }

    //退货审核
    @Transactional(value = "firstTransactionManager",rollbackFor = SQLException.class)
    public Object[] checkBill(Long id){
        //二次判断单据是否允许审核
        RefundAudit refundAudit=findRefundAuditById(id);
        if(refundAudit==null|| StringUtils.isEmpty(refundAudit.getBillno())||refundAudit.getStatus()==2||refundAudit.getStatus()==1||refundAudit.getItems()==null||refundAudit.getItems().size()==0){
            //不存在或者已经审核的单子不能重复审核
            return null;
        }
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("id",id);
        paramMap.put("r_code",null);
        paramMap.put("r_message",null);
        Object[] strs=new Object[2];
        //更新单据修改人及修改时间
        refundAuditMapper.updateModifyStatusByPrimaryKey(id);
        refundAuditMapper.checkBill(paramMap);
        strs[0]=paramMap.get("r_code");
        strs[1]=paramMap.get("r_message");
        return strs;
    }
    //单据驳回，返回true驳回成功
    //Spring默认只对运行期异常（RuntimeException）进行事务回滚操作，对于编译异常Spring是不进行回滚的，所以对于需要进行事务控制的方法尽量将可能抛出的异常都转换成运行期异常，将编译时异常转为运行期异常
    //使用rollbackFor指定遇到SQLException异常回滚
    @Transactional(value = "firstTransactionManager",rollbackFor = SQLException.class)
    public boolean rejetBillCheckStatus(Long id,String no){
        //核对审核单据id与审核单据号是否能对上,只有状态时3 审核中时允许驳回
        RefundAudit refundAudit=findRefundAuditById(id);
        if(refundAudit==null||!StringUtils.equals(refundAudit.getDocno(),no)|| StringUtils.isEmpty(refundAudit.getBillno())||refundAudit.getStatus()==2||refundAudit.getStatus()==1||refundAudit.getItems()==null||refundAudit.getItems().size()==0){
            //不存在或者已经审核的单子不能重复审核
            return false;
        }
        //更新单据修改人及修改时间
        refundAuditMapper.updateModifyStatusByPrimaryKey(id);
        int result=refundAuditMapper.updateCheckStatusByPrimaryKey(id);
        if(result==1){
            return  true;
        }else{
            return false;
        }
    }
    //public void modifyBillStatus(Long id){
        //refundAuditMapper.updateModifyStatusByPrimaryKey(id);
    //}
}
