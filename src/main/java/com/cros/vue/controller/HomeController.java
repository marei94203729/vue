package com.cros.vue.controller;

import com.cros.vue.entity.*;
import com.cros.vue.mapper.SaleItemMapper;
import com.cros.vue.service.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;

/*
 * @description 首页
 * @author hjj
 * @createTime 2020/10/18
 */
@RestController
@Slf4j
public class HomeController {
    @Autowired
    Producer captchaProducer;
    @Autowired
    MenuService menuService;
    @Autowired
    RefundAuditService refundAuditService;
    @Autowired
    RefundAuditItemService refundAuditItemService;
    @Autowired
    SaleItemService saleItemService;
    @Autowired
    CustomerService customerService;
    @Autowired
    AccountAmtService accountAmtService;
    @Autowired
    SlpriceadjService slpriceadjService;
   // @CrossOrigin
    @RequestMapping("/apis/menu")
    public ArrayNode queryMenu(){
       /* RefundAuditExample example=new RefundAuditExample();
        RefundAuditExample.Criteria  criteria=example.createCriteria();
        Date date= null;
        try {
            date = DateUtils.parseDate("2020-11-04","yyyy-MM-dd");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        criteria.andBilldateBetween(date,new Date());
        //criteria.andIdGreaterThanOrEqualTo(49619l);
        PageHelper.startPage(1,4);
        List<RefundAudit> list=refundAuditService.obtainRefundAudits(example);*/
        List<RefundAuditItem> list=refundAuditItemService.obtainRefundAuditItems(49622l);
        PageInfo page=new PageInfo(list);
        RefundAudit re=refundAuditService.findRefundAuditById(49622l);
     //   log.info(page.getTotal());
        return menuService.getMenusNode();
    }
    @RequestMapping("/Login")
    public ObjectNode login(HttpServletResponse response){
        response.setStatus(403);
        JsonNodeFactory jsonNodeFactory=JsonNodeFactory.instance;
        ObjectNode objectNode=jsonNodeFactory.objectNode();
        objectNode.put("message","请重新登录!");
        return objectNode;
    }
    @GetMapping("/captcha.jpg")
    public void getCaptcha(HttpSession session, HttpServletResponse response)throws IOException {
        //客户端和服务器都不做缓存
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
        String capText = captchaProducer.createText();
        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
        BufferedImage bi = captchaProducer.createImage(capText);
        @Cleanup ServletOutputStream out = response.getOutputStream();
        ImageIO.write(bi, "jpg", out);
        out.flush();
        out.close();
    }
    @PostMapping("/checkHistorySaleItem")
    public ObjectNode checkHistorySaleItem(String productName,Long storeid){
        List<SaleItem> list=saleItemService.obtainItemsBySingle(productName,storeid);
        ObjectNode objectNode=callNode(list);
        return objectNode;
    }
    @PostMapping("/checkHistorySaleItems")
    public ObjectNode checkHistorySaleItems(@RequestParam Map<String,String> param){
        //获取参数
        String productName=param.get("productName");
        String storeid=param.get("storeid");
        List<String> custs=null;
        //判断是否含有逗号
        if(!StringUtils.contains(storeid,",")){
            custs=new ArrayList<>();
            custs.add(storeid);
        }else {
            custs = Arrays.asList(storeid.split(","));
        }
        List<SaleItem> list=saleItemService.obtainItemsByList(productName,custs);
        ObjectNode objectNode=callNode(list);
        return objectNode;
    }
    private ObjectNode callNode(List<SaleItem> list){
        JsonNodeFactory jsonNodeFactory=JsonNodeFactory.instance;
        ObjectNode objectNode=jsonNodeFactory.objectNode();
        //循环组装数据
        StringBuilder sb=new StringBuilder("");
        list.forEach(s->{
            sb.append(String.format("%s-%s-%tF-价格%g-%d条-%s;%n",s.getMProductName(),s.getDocon(),s.getBillDate(),s.getPriceActual(),s.getQtyOut(),s.getSaleWaysName()));
        });
        objectNode.put("data",sb.toString());
        return objectNode;
    }
    @PostMapping("/queryCustByName")
    public List<Customer> queryCusts(String name){
        return customerService.obtainCusts(name);
    }
    @PostMapping("/checkSaleRefundEidtor")
    public ObjectNode checkSaleRefund(Long storeid){
        Object[] objs=refundAuditService.checkBill(storeid);
        JsonNodeFactory jsonNodeFactory=JsonNodeFactory.instance;
        ObjectNode objectNode=jsonNodeFactory.objectNode();
        if(objs==null){
            objectNode.put("message","已审核单据不能重复审核或单据还未初审提交!");
            return objectNode;
        }
        if(objs[0]!=null&&(int)((BigDecimal)objs[0]).intValue()==0){
            objectNode.put("code",200);
        }else{
            objectNode.put("message",objs[1].toString());
        }
        return objectNode;
    }
    //驳回退货单据
    @PostMapping("/rejetBillCheckStatusEidtor")
    public ObjectNode rejetBillCheckStatus(Long storeid,String no){
        boolean result=refundAuditService.rejetBillCheckStatus(storeid,no);
        JsonNodeFactory jsonNodeFactory=JsonNodeFactory.instance;
        ObjectNode objectNode=jsonNodeFactory.objectNode();

        if(result){
            objectNode.put("code",200);
        }else{
            objectNode.put("message","审核失败!请确认驳回单据是处于审核中状态!");
        }
        return objectNode;
    }
    //更新改价单
    @PostMapping("/slpriceadjEidtor")
    public ObjectNode slpriceadjEidtor(@RequestParam Map<String,String>params) throws SQLException{
        boolean result=slpriceadjService.modifyItem(params);
        JsonNodeFactory jsonNodeFactory=JsonNodeFactory.instance;
        ObjectNode objectNode=jsonNodeFactory.objectNode();

        if(result){
            objectNode.put("code",200);
        }else{
            objectNode.put("message","修改失败!单据已审核或无修改或修改价格小于0!");
        }
        return objectNode;
    }
    // 指定view来渲染对应的异常
    @ExceptionHandler(SQLException.class)
    public ObjectNode databaseError(HttpServletRequest req, SQLException ex) {
        JsonNodeFactory jsonNodeFactory = JsonNodeFactory.instance;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        objectNode.put("message",ex.getMessage());
        // 啥也不干，就返回异常页面view的名称
        // 注意这里的view访问不到异常，因为异常没有添加到model中
        return objectNode;
    }
}
