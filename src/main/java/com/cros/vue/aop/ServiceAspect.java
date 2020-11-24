package com.cros.vue.aop;

import com.cros.vue.entity.AccountAmt;
import com.cros.vue.entity.AccountAmtOne;
import com.cros.vue.entity.InventoryStatistics;
import com.cros.vue.entity.Slpriceadj;
import com.cros.vue.pojo.DataPackingBox;
import com.cros.vue.service.AccountAmtOneService;
import com.cros.vue.service.AccountAmtService;
import com.cros.vue.service.InventoryStatisticsService;
import com.cros.vue.service.SlpriceadjService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author MaLei
 * @description: aop切面
 * @create 2020/11/17
 */
@Component
@Aspect
@Slf4j
public class ServiceAspect {
    @Autowired
    HttpServletRequest request;
    @Autowired
    AccountAmtService accountAmtService;
    @Autowired
    AccountAmtOneService accountAmtOneService;
    @Autowired
    SlpriceadjService slpriceadjService;
    @Autowired
    InventoryStatisticsService inventoryStatisticsService;
    /**
     * 匹配规则
     * execution: 用于匹配方法执行的连接点;
     * execution(public * *(..)) ==> 匹配所有目标类的public方法,第一个*代表返回类型,第二个*代表方法名,而..代表任意入参的方法。
     * execution(* com.oysept.springboot.controller..*.*(..))                ==> 该包及所有子包下任何类的任何方法。
     * execution(* com.oysept.springboot.controller.*(..))                   ==> 该包下任何类的任何方法。
     * execution(* com.oysept.springboot.controller.AspectJController.*(..)) ==> 该包下AspectJController类的任何方法。
     * execution(* com..*.*Controller.method*(..)) ==> 匹配包名前缀为com的任何包下类名后缀为Controller的方法，方法名必须以method为前缀。
     * execution(* *To(..)) ==> 匹配目标类所有以To为后缀的方法。
     * 注: 该方法只是为了声明一个公共的环绕通知,也可以直接在具体方法配置,如: @Around("execution(* com.oysept.springboot.controller..*.*(..))")
     */
    //环绕检测指定类执行方法
    @Around(value = "execution(* com.cros.vue.controller..HandlerControl.queryConditionData(..))")
    public Object doProcess(ProceedingJoinPoint point) throws Throwable {
        Object arg = point.getArgs()[0];
        Map<String,String>params=(Map<String, String>)arg;
        if(params.containsKey("_class")&& StringUtils.equals(params.get("_class").toString(),"AccountAmtService")){
            //组长时间
            String billdate=(String) params.get("billdate");
            String corigid=(String) params.get("cOrigId");
            String custs=(String) params.get("custId");
            Date beginDate=null;
            Date endDate=null;
            if(!StringUtils.isEmpty(billdate)) {
                beginDate = DateUtils.parseDate(billdate.split(",")[0], "yyyy-MM-dd HH:mm:ss");
                endDate = DateUtils.parseDate(billdate.split(",")[1], "yyyy-MM-dd HH:mm:ss");
            }else{
                beginDate=new Date();
                endDate=beginDate;
            }
            //获取被代理对象
            PageHelper.startPage(Integer.valueOf(params.get("page")),Integer.valueOf(params.get("pagesize")));
            List<AccountAmt> list=accountAmtService.obtainAccountAmt(beginDate,endDate,custs,corigid);
            PageInfo page=new PageInfo(list);
            DataPackingBox dataPackingBox=new DataPackingBox();
            dataPackingBox.setTotal(page.getTotal());
            dataPackingBox.setPage(page.getPageNum());
            dataPackingBox.setData(list);
            return dataPackingBox;
        }else if(params.containsKey("_class")&& StringUtils.equals(params.get("_class").toString(),"AccountAmtOneService")){
            //组长时间
            String billdate=(String) params.get("billdate");
            Date beginDate=null;
            Date endDate=null;
            if(!StringUtils.isEmpty(billdate)) {
                beginDate = DateUtils.parseDate(billdate.split(",")[0], "yyyy-MM-dd HH:mm:ss");
                endDate = DateUtils.parseDate(billdate.split(",")[1], "yyyy-MM-dd HH:mm:ss");
            }else{
                beginDate=new Date();
                endDate=beginDate;
            }
            //获取被代理对象
            PageHelper.startPage(Integer.valueOf(params.get("page")),100);
            List<AccountAmtOne> list=accountAmtOneService.obtainRecableAccount(beginDate,endDate);
            PageInfo page=new PageInfo(list);
            DataPackingBox dataPackingBox=new DataPackingBox();
            dataPackingBox.setTotal(page.getTotal());
            dataPackingBox.setPage(page.getPageNum());
            dataPackingBox.setData(list);
            return dataPackingBox;
        }else if(params.containsKey("_class")&& StringUtils.equals(params.get("_class").toString(),"InventoryStatisticsService")){
            //组长时间
            Long idp=Long.valueOf(params.containsKey("idp")?params.get("idp"):"5540");

            //获取被代理对象
            PageHelper.startPage(Integer.valueOf(params.get("page")),100);
            List<InventoryStatistics> list=inventoryStatisticsService.obtainInventoryStatistics(idp);
            PageInfo page=new PageInfo(list);
            DataPackingBox dataPackingBox=new DataPackingBox();
            dataPackingBox.setTotal(page.getTotal());
            dataPackingBox.setPage(page.getPageNum());
            dataPackingBox.setData(list);
            return dataPackingBox;
        }else if(params.containsKey("_class")&& StringUtils.equals(params.get("_class").toString(),"SlpriceadjService")){
            //组长时间
            String billdate=(String) params.get("billdate");
            Date beginDate=null;
            Date endDate=null;
            if(!StringUtils.isEmpty(billdate)) {
                beginDate = DateUtils.parseDate(billdate.split(",")[0], "yyyy-MM-dd HH:mm:ss");
                endDate = DateUtils.parseDate(billdate.split(",")[1], "yyyy-MM-dd HH:mm:ss");
            }else{
                beginDate=new Date();
                endDate=beginDate;
            }
            //获取被代理对象
            PageHelper.startPage(Integer.valueOf(params.get("page")),100);
            List<Slpriceadj> list=slpriceadjService.obtainSlpriceadjs(beginDate,endDate);
            PageInfo page=new PageInfo(list);
            DataPackingBox dataPackingBox=new DataPackingBox();
            dataPackingBox.setTotal(page.getTotal());
            dataPackingBox.setPage(page.getPageNum());
            dataPackingBox.setData(list);
            return dataPackingBox;
        }else if(params.containsKey("_class")&& StringUtils.equals(params.get("_class").toString(),"AccountAmtTwoService")){
            //组长时间
            String billdate=(String) params.get("billdate");
            Date beginDate=null;
            Date endDate=null;
            if(!StringUtils.isEmpty(billdate)) {
                beginDate = DateUtils.parseDate(billdate.split(",")[0], "yyyy-MM-dd HH:mm:ss");
                endDate = DateUtils.parseDate(billdate.split(",")[1], "yyyy-MM-dd HH:mm:ss");
            }else{
                beginDate=new Date();
                endDate=beginDate;
            }
            String flag=(String) params.get("storekind");
            //获取被代理对象
            PageHelper.startPage(Integer.valueOf(params.get("page")),100);
            List<?> list=accountAmtOneService.queryStores(beginDate,endDate,flag==null?null:(StringUtils.equals(flag,"Y")?true:false));
            PageInfo page=new PageInfo(list);
            DataPackingBox dataPackingBox=new DataPackingBox();
            dataPackingBox.setTotal(page.getTotal());
            dataPackingBox.setPage(page.getPageNum());
            dataPackingBox.setData(list);
            return dataPackingBox;
        }else{//非指定方法进行放行
            return point.proceed();
        }
    }
}
