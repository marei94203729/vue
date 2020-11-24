package com.cros.vue.service;

import com.cros.vue.entity.AccountAmt;
import com.cros.vue.entity.AccountAmtExample;
import com.cros.vue.mapper.AccountAmtMapper;
import com.cros.vue.service.annotation.Execute;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author MaLei
 * @description: 科目余额表服务类
 * @create 2020/11/17
 */
@Service
public class AccountAmtService {
    @Autowired
    AccountAmtMapper accountAmtMapper;
    @Transactional("firstTransactionManager")
    @Execute
    public List<AccountAmt> obtainAccountAmt(Date beginDate,Date endDate,String custArr,String storeArr){
        AccountAmtExample example=new AccountAmtExample();
        example.setBeginDateStr(DateFormatUtils.format(beginDate,"yyyyMMdd"));
        example.setEndDateStr(DateFormatUtils.format(endDate,"yyyyMMdd"));
        example.setCustIdChars(custArr);
        example.setStoreIdChars(storeArr);
        return accountAmtMapper.selectByExample(example);
    }
}
