package com.svj.portrayalpublisher.controller;

import com.alibaba.fastjson.JSON;
import com.svj.bean.SvjUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.svj.portrayalpublisher.service.SvjPublisherService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@RestController
public class SvjPublisherController {

    @Autowired
    SvjPublisherService service;

    // http://localhost:8070/user-query?userid=''
    @GetMapping("/user-query")
    public String svjuserportrayal(@RequestParam("userid") String userid) {

        System.out.println(userid);
        SvjUser user = service.getUserInfo(userid);
        System.out.println(user.getSvj_userid());
        ArrayList<Map<String, String>> result = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
       // map1.put("value", service.getUserInfo(userid).toString());
        map1.put("svj_user_userid", user.getSvj_userid());
        map1.put("svj_user_username",user.getSvj_user_name());
        map1.put("svj_user_nickname", user.getSvj_user_nickname());
        map1.put("svj_user_regdate", user.getSvj_user_regdate());
        map1.put("svj_user_regemail", user.getSvj_user_regemail());
        map1.put("svj_user_birthday", "1996-05-20");
        map1.put("svj_user_lastlogintime", "2020-09-01");
        map1.put("svj_user_organname", "三维家");
        map1.put("svj_user_deptname", "三维家公司");
        map1.put("svj_user_employeeidname", "张三");
        map1.put("svj_user_mobile", "136****5462");
        map1.put("svj_user_scheme_count", "200");
        map1.put("svj_user_average_mon_scheme_count", "50");
        map1.put("svj_user_thisyear_scheme_count", "100");
        map1.put("svj_user_lastyear_scheme_count", "60");
        map1.put("svj_user_thismon_scheme_count", "20");
        map1.put("svj_user_rendergraph_count", "60");
        map1.put("svj_user_render_day_count", "5");
        map1.put("svj_user_finally_render_time", "2020-09-12");
        map1.put("svj_user_lastyear_rendergraph_count", "150");
        map1.put("svj_user_thisyear_rendergraph_count", "100");
        map1.put("svj_user_lastmon_rendergraph_count", "200");
        map1.put("svj_user_thismon_rendergraph_count", "100");
        map1.put("svj_user_limit_count", "20");
        map1.put("svj_user_allocation_count", "10");
        map1.put("svj_user_unallocation_count", "10");
        map1.put("svj_user_payinglimit_count", "50");
        map1.put("svj_user_presenter_limit_count", "20");
        map1.put("svj_user_order_date_first", "2010-10-06");
        map1.put("svj_user_order_date_last", "2020-06-01");
        map1.put("svj_user_order_count", "30");
        map1.put("svj_user_order_amount", "30000");
        map1.put("svj_user_payment_count", "20");
        map1.put("svj_user_payment_amount", "20000");
        map1.put("svj_user_average_payment_amount", "1000");
        result.add(map1);
        //return JSON.toJSONString(user);
        return JSON.toJSONString(map1);
    }
    @GetMapping("/customer-query")
    public String svjcustomerportrayal(@RequestParam("customerid") String customerid) {

        System.out.println(customerid);
        //SvjUser user = service.getUserInfo(customerid);
       // System.out.println(user.getSvj_userid());
        ArrayList<Map<String, String>> result = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        // map1.put("value", service.getUserInfo(userid).toString());
        map1.put("svj_customer_username", customerid);
        map1.put("svj_customer_address", "广东省广州市");
        map1.put("svj_customer_customername", "小王");
        map1.put("svj_customer_phone", "136****5462");
        map1.put("svj_customer_usernum", "20");
        map1.put("svj_customer_scheme_count", "100");
        map1.put("svj_customer_average_mon_scheme_count", "20");
        map1.put("svj_customer_thisyear_scheme_count", "52");
        map1.put("svj_customer_lastyear_scheme_count", "32");
        map1.put("svj_customer_thismon_scheme_count", "13");
        map1.put("svj_customer_rendergraph_count", "55");
        map1.put("svj_customer_render_day_count", "200");
        map1.put("svj_customer_finally_render_time", "50");
        map1.put("svj_customer_lastyear_rendergraph_count", "100");
        map1.put("svj_customer_thisyear_rendergraph_count", "60");
        map1.put("svj_customer_lastmon_rendergraph_count", "20");
        map1.put("svj_customer_thismon_rendergraph_count", "60");
        map1.put("svj_customer_limit_count", "20");
        map1.put("svj_customer_allocation_count", "30");
        map1.put("svj_customer_unallocation_count", "150");
        map1.put("svj_customer_payinglimit_count", "100");
        map1.put("svj_customer_presenter_limit_count", "200");
        map1.put("svj_customer_order_date_first", "100");
        map1.put("svj_customer_order_date_last", "20");
        map1.put("svj_customer_order_count", "10");
        map1.put("svj_customer_order_amount", "10");
        map1.put("svj_customer_payment_count", "50");
        map1.put("svj_customer_payment_amount", "20");
        map1.put("svj_customer_average_payment_amount", "66");

        result.add(map1);
        //return JSON.toJSONString(user);
        return JSON.toJSONString(map1);
    }


    @GetMapping("/user-group-query")
    public String svjusergroup(@RequestParam(value = "filter", defaultValue = "World") String filter) {

        System.out.println(filter);
        ArrayList<Map<String, String>> result = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();
        // map1.put("value", service.getUserInfo(userid).toString());
        map1.put("userId", "00000001");
        map1.put("userName", "张三");
        map1.put("userType", "三维家");
        map1.put("organId", "111111");
        map1.put("organName", "三维家");
        map1.put("deptId", "45645");
        map1.put("deptName", "65665");
        map1.put("phone", "13656565462");
        map1.put("regDate", "1995-05-20");
        map1.put("whetherPay", "是");
        map1.put("lastMon_login_day", "50");
        map1.put("lastMon_login_count", "50");
        map1.put("lastmon_scheme_count", "50");
        map1.put("lastmon_rendergraph_count", "50");
        map1.put("min_unexpire_allocation_time", "2000-09-01");
        map1.put("lastlogintime", "2020-09-01");
        result.add(map1);
        map2.put("userId", "00000002");
        map2.put("userName", "李四");
        map2.put("userType", "三维家");
        map2.put("organId", "111111");
        map2.put("organName", "三维家");
        map2.put("deptId", "45645");
        map2.put("deptName", "65665");
        map2.put("phone", "13656565462");
        map2.put("regDate", "1995-05-20");
        map2.put("whetherPay", "是");
        map2.put("lastMon_login_day", "50");
        map2.put("lastMon_login_count", "50");
        map2.put("lastmon_scheme_count", "50");
        map2.put("lastmon_rendergraph_count", "50");
        map2.put("min_unexpire_allocation_time", "2000-09-01");
        map2.put("lastlogintime", "2020-09-01");
        result.add(map2);
        map3.put("userId", "00000003");
        map3.put("userName", "王五");
        map3.put("userType", "三维家");
        map3.put("organId", "111111");
        map3.put("organName", "三维家");
        map3.put("deptId", "45645");
        map3.put("deptName", "65665");
        map3.put("phone", "13656565462");
        map3.put("regDate", "1995-05-20");
        map3.put("whetherPay", "是");
        map3.put("lastMon_login_day", "50");
        map3.put("lastMon_login_count", "50");
        map3.put("lastmon_scheme_count", "50");
        map3.put("lastmon_rendergraph_count", "50");
        map3.put("min_unexpire_allocation_time", "2000-09-01");
        map3.put("lastlogintime", "2020-09-01");
        result.add(map3);
        return JSON.toJSONString(result);
    }





}

