package com.svj.portrayalpublisher.controller;

import com.alibaba.fastjson.JSON;
import com.svj.bean.SvjUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.svj.portrayalpublisher.service.PublisherService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@RestController
public class PublisherController {

    @Autowired
    PublisherService service;

    // http://localhost:8070/user-query?userid=''
    @GetMapping("/user-query")
    public String svjportrayal(@RequestParam("userid") String userid) {

        System.out.println(userid);
        SvjUser user = service.getUserInfo(userid);
        System.out.println(user.getDeptid()+user.getOrganname()+user.getRegdate());

        //ArrayList<Map<String, String>> result = new ArrayList<>();
        //Map<String, String> map1 = new HashMap<>();
       // map1.put("value", service.getUserInfo(userid).toString());
       // map1.put("sex", "男");
        //map1.put("name", "张三");
        //map1.put("userid", userid);
        //map1.put("organname", service.getUserInfo(userid).toString());
        //result.add(map1);
        return JSON.toJSONString(user);

    }





}

