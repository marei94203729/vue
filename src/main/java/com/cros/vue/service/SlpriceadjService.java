package com.cros.vue.service;

import com.cros.vue.entity.RefundAudit;
import com.cros.vue.entity.Slpriceadj;
import com.cros.vue.entity.SlpriceadjpdtItem;
import com.cros.vue.entity.SlpriceadjpdtItemExample;
import com.cros.vue.mapper.SlpriceadjMapper;
import com.cros.vue.mapper.SlpriceadjpdtItemMapper;
import com.cros.vue.service.annotation.Read;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author MaLei
 * @description: 销售调价单服务类
 * @create 2020/11/18
 */
@Service
public class SlpriceadjService {
    @Autowired
    SlpriceadjMapper slpriceadjMapper;

    @Transactional("firstTransactionManager")
    public List<Slpriceadj> obtainSlpriceadjs(Date beginDate,Date endDate){
        return slpriceadjMapper.listByDates(beginDate,endDate);
    }
    @Transactional("firstTransactionManager")
    @Read
    public Slpriceadj findSlpriceadjById(long id){
        return slpriceadjMapper.selectByPrimaryKey(id);
    }
    //更新调价单数据
    @Transactional(value = "firstTransactionManager",rollbackFor = SQLException.class)
    public boolean modifyItem(Map<String,String> param) throws SQLException{
        if(param!=null&&!param.isEmpty()) {
            int num = param.size() / 3;
            int rs=0;
            for (int i = 0; i < num; i++) {
                long id = Long.valueOf(param.get(String.format("%d[id]", i)));
                BigDecimal price = new BigDecimal(param.get(String.format("%d[pricedis]", i)));
                long sid=Long.valueOf(param.get(String.format("%d[sid]", i)));
                if(price.compareTo(BigDecimal.ZERO)>=0)
                    rs += slpriceadjMapper.updateItemByInfo(id, (price.doubleValue()<=0?null:price), sid);
            }
            if(num==rs) {
                return true;
            }else{
                throw new SQLException("存在负价格!");
                //return false;
            }
        }else{
            return false;
        }
    }
}
