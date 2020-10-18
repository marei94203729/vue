package com.cros.vue.controller;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/*
 * @description 首页
 * @author hjj
 * @createTime 2020/10/18
 */
@RestController
public class HomeController {
   // @CrossOrigin
    @RequestMapping("/apis/home")
    public ObjectNode home(@RequestParam("movieId") long movieId, HttpSession session){
        JsonNodeFactory jsonNodeFactory=JsonNodeFactory.instance;
        ObjectNode objectNode=jsonNodeFactory.objectNode();
        objectNode.put("code",session.getId());

        return objectNode;
    }
}
