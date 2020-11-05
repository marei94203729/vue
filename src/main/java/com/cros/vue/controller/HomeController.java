package com.cros.vue.controller;

import com.cros.vue.entity.RefundAudit;
import com.cros.vue.entity.RefundAuditExample;
import com.cros.vue.entity.RefundAuditItem;
import com.cros.vue.service.MenuService;
import com.cros.vue.service.RefundAuditItemService;
import com.cros.vue.service.RefundAuditService;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/*
 * @description 首页
 * @author hjj
 * @createTime 2020/10/18
 */
@RestController
@Slf4j
public class HomeController {
    @Autowired
    MenuService menuService;
    @Autowired
    RefundAuditService refundAuditService;
    @Autowired
    RefundAuditItemService refundAuditItemService;
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
    @RequestMapping("/admin/task")
    public ObjectNode login(){
        JsonNodeFactory jsonNodeFactory=JsonNodeFactory.instance;
        ObjectNode objectNode=jsonNodeFactory.objectNode();
        objectNode.put("task","ok");
        return objectNode;
    }
}
