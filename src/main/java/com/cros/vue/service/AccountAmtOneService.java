package com.cros.vue.service;

import com.cros.vue.entity.AccountAmt;
import com.cros.vue.entity.AccountAmtExample;
import com.cros.vue.entity.AccountAmtOne;
import com.cros.vue.entity.BasicInfo;
import com.cros.vue.mapper.AccountAmtMapper;
import com.cros.vue.service.annotation.Execute;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author MaLei
 * @description: 汇款服务类
 * @create 2020/11/18
 */
@Service
public class AccountAmtOneService {
    @Autowired
    AccountAmtMapper accountAmtMapper;
    @Transactional("firstTransactionManager")
    @Execute
    public List<AccountAmtOne> obtainRecableAccount(Date beginDate, Date endDate){
        AccountAmtExample example=new AccountAmtExample();
        example.setBeginDateStr(DateFormatUtils.format(beginDate,"yyyyMMdd"));
        example.setEndDateStr(DateFormatUtils.format(endDate,"yyyyMMdd"));
        return accountAmtMapper.selectRecableAmount(example);
    }
    //出库统计
    @Transactional("firstTransactionManager")
    public List<AccountAmtOne> queryStores(Date beginDate, Date endDate,Boolean flag){
        return accountAmtMapper.listStores(beginDate,endDate,flag);
    }
    //分店性质
    @Transactional("firstTransactionManager")
    public List<BasicInfo> queryKind(){
        List<BasicInfo> list=new ArrayList<>();
        BasicInfo info=new BasicInfo();
        info.setValue("Y");
        info.setDescription("加盟店");
        list.add(info);
        BasicInfo info1=new BasicInfo();
        info1.setValue("N");
        info1.setDescription("直营联营");
        list.add(info1);
        return list;
    }
}
