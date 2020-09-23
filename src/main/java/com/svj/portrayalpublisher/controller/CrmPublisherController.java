package com.svj.portrayalpublisher.controller;

import com.alibaba.fastjson.JSON;
import com.svj.bean.*;
import com.svj.portrayalpublisher.service.ConvertService;
import com.svj.portrayalpublisher.service.SvjPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class CrmPublisherController {

    @Autowired
    SvjPublisherService service;
    @Autowired
    ConvertService convertService;
    // http://localhost:8070/user-query1?userid=00000077214
    @GetMapping("/user-query1")
    public String svjuserportrayal(@RequestParam("userid") String userid) {


        SvjUserPortrait user = service.getUserInfo(userid);
        System.out.println(user.getSvj_user_userid());
        ArrayList<Map<String, String>> result = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        return JSON.toJSONString(map1);
    }

}

