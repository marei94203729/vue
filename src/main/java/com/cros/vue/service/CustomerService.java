package com.cros.vue.service;

import com.cros.vue.entity.Customer;
import com.cros.vue.entity.CustomerExample;
import com.cros.vue.mapper.CustomerMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MaLei
 * @description: 加盟商服务类
 * @create 2020/11/11
 */
@Service
public class CustomerService {
    @Autowired
    CustomerMapper customerMapper;
    public List<Customer> obtainCusts(String name){
        CustomerExample example=new CustomerExample();
        CustomerExample.Criteria criteria=example.createCriteria();
        //判断传入的name中是否包含%
        criteria.andDescriptionLike("%"+name+"%");
        criteria.andIsactiveEqualTo("Y");
        return customerMapper.selectByExample(example);
    }
}
