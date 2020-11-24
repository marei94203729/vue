package com.cros.vue.mapper;

import org.apache.ibatis.jdbc.SQL;

/**
 * @author MaLei
 * @description: 库存查询类sql管道
 * @create 2020/11/20
 */
public class InventoryStatisticsSqlProvider {
    public String listInventoryStatisticssByIdp(Long idp){
        StringBuilder sb=new StringBuilder();
        sb.append("with d as(select nvl(t5.attribname,' ') year,nvl(t6.attribname,' ') season ,sum(nvl(t1.qty,0)) total ");
        sb.append("from v_fa_storage_can t1 inner join c_store t2 on t1.C_STORE_ID=t2.id and t2.c_storetype='02' ");
        sb.append("inner join m_product t3 on t1.m_product_id=t3.id ");
        sb.append("left join M_DIM t5 on t3.M_DIM2_ID=t5.id left join M_DIM t6 on t3.M_DIM11_ID=t6.id ");
        sb.append("where t2.C_STORETYPE_JZ_ID in (select id from C_STORETYPE_JZ where no in('01','02','03','05','060')) and t1.qty!=0 ");
        sb.append("and t3.M_DIM3_ID=#{idp,jdbcType=NUMERIC} ");
        sb.append("group by t5.attribname,t6.attribname ");
        sb.append("order by  t5.attribname,t6.attribname ");
        sb.append("),pt as( ");
        sb.append("select * from d  ");
        sb.append("pivot ( ");
        sb.append("sum(total) ");
        sb.append("for season ");
        sb.append("in ('春'chun, '夏'xia, '春夏'chunxia, '秋'qiu,'冬'dong,'秋冬'qiudong,'其他' qita,' ' ss) ");
        sb.append(")) ");
        sb.append("select coalesce(year, '合计') year,sum(ss)other, ");
        sb.append("sum(chun)chun,sum(xia)xia,sum(chunxia)chunxia,sum(nvl(chun,0)+nvl(xia,0)+nvl(chunxia,0))sum1,sum(qiu)qiu,sum(dong) dong,sum(qiudong)qiudong,sum(qita)qita,sum(nvl(qiu,0)+nvl(dong,0)+nvl(qiudong,0))sum2,sum(nvl(chun,0)+nvl(xia,0)+nvl(chunxia,0)+nvl(qiu,0)+nvl(dong,0)+nvl(qiudong,0)+nvl(qita,0)+nvl(ss,0))total ");
        sb.append("from pt ");
        sb.append("group by rollup(year) ");
        sb.append("order by year ");
        return sb.toString();
    }
}
