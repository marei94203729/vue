package com.cros.vue.service;

import com.cros.vue.entity.AccountAmt;
import com.cros.vue.entity.AccountAmtExample;
import com.cros.vue.mapper.AccountAmtMapper;
import com.cros.vue.service.annotation.Execute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public List<AccountAmt> obtainAccountAmt(){
        AccountAmtExample example=new AccountAmtExample();
        example.setBeginDateStr("20201101");
        example.setEndDateStr("20201117");
       // example.setCustIdChars("19299,19300");
        //example.setStoreIdChars("29837,29838,29556,29557,39473");
        return accountAmtMapper.selectByExample(example);
    }
}
