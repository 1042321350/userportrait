package com.svj.portrayalpublisher.controller;

import com.alibaba.fastjson.JSON;
import com.svj.bean.*;
import com.svj.portrayalpublisher.service.ConvertService;
import com.svj.portrayalpublisher.service.LabelQueryPublisherService;
import com.svj.portrayalpublisher.service.UserGroupQueryPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.svj.portrayalpublisher.service.SvjPublisherService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class SvjPublisherController {

    @Autowired
    SvjPublisherService service;
    @Autowired
    ConvertService convertService;
    // http://localhost:8070/user-query?userid=''
    @GetMapping("/user-query")
    public String svjuserportrayal(@RequestParam("userid") String userid) {

        System.out.println(userid);
        SvjUserPortrait user = service.getUserInfo(userid);
        System.out.println(user.getSvj_user_userid());
        ArrayList<Map<String, String>> result = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
       // map1.put("value", service.getUserInfo(userid).toString());
        map1.put("svj_user_userid", user.getSvj_user_userid());
        map1.put("svj_user_username",user.getSvj_user_username());
        map1.put("svj_user_nickname", user.getSvj_user_nickname());
        map1.put("svj_user_regdate", user.getSvj_user_regdate());
        map1.put("svj_user_regemail", user.getSvj_user_regemail());
        map1.put("svj_user_birthday", user.getSvj_user_birthdaytime());
        map1.put("svj_user_lastlogintime", user.getSvj_user_lastlogintime());
        map1.put("svj_user_organname", user.getSvj_user_organname());
        map1.put("svj_user_deptname", user.getSvj_user_deptname());
        map1.put("svj_user_employeeidname",user.getSvj_user_employeeid());
        map1.put("svj_user_mobile",user.getSvj_user_mobile());
        map1.put("svj_user_scheme_count", user.getSvj_user_scheme_count());
        map1.put("svj_user_average_mon_scheme_count",user.getSvj_user_average_mon_scheme_count());
        map1.put("svj_user_thisyear_scheme_count", user.getSvj_user_thisyear_scheme_count());
        map1.put("svj_user_lastyear_scheme_count", user.getSvj_user_lastyear_scheme_count());
        map1.put("svj_user_thismon_scheme_count", user.getSvj_user_thismon_scheme_count());
        map1.put("svj_user_rendergraph_count", user.getSvj_user_rendergraph_count());
        map1.put("svj_user_render_day_count", user.getSvj_user_render_day_count());
        map1.put("svj_user_finally_render_time", user.getSvj_user_finally_render_time());
        map1.put("svj_user_lastyear_rendergraph_count", user.getSvj_user_lastyear_rendergraph_count());
        map1.put("svj_user_thisyear_rendergraph_count", user.getSvj_user_thisyear_rendergraph_count());
        map1.put("svj_user_lastmon_rendergraph_count", user.getSvj_user_lastmon_rendergraph_count());
        map1.put("svj_user_thismon_rendergraph_count", user.getSvj_user_thismon_rendergraph_count());
        map1.put("svj_user_limit_count", user.getSvj_user_limit_count());
        map1.put("svj_user_allocation_count", user.getSvj_user_allocation_count());
        map1.put("svj_user_unallocation_count", user.getSvj_user_unallocation_count());
        map1.put("svj_user_payinglimit_count", user.getSvj_user_payinglimit_count());
        map1.put("svj_user_presenter_limit_count", user.getSvj_user_presenter_limit_count());
        map1.put("svj_user_order_date_first", user.getSvj_user_order_date_first());
        map1.put("svj_user_order_date_last", user.getSvj_user_order_date_last());
        map1.put("svj_user_order_count", user.getSvj_user_order_count());
        map1.put("svj_user_order_amount", user.getSvj_user_order_amount());
        map1.put("svj_user_payment_count", user.getSvj_user_payment_count());
        map1.put("svj_user_payment_amount", user.getSvj_user_payment_amount());
        map1.put("svj_user_average_payment_amount", user.getSvj_user_average_payment_amount());
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
//localhost:8070/convert-query?dtStart=2017-01-01&dtEnd=2020-09-01
@GetMapping("/convert-query")
public String getconvert(@RequestParam("dtStart") String dtStart,@RequestParam("dtEnd") String dtEnd) {

    System.out.println(dtStart+"-----"+dtEnd);
    ActionConvert convert = convertService.getConvert(dtStart, dtEnd);
    ArrayList<Map<String, Object>> result = new ArrayList<>();
    Map<String, Object> map1 = new HashMap<>();
    map1.put("dtStart", dtStart);
    map1.put("dtEnd", dtEnd);
    System.out.println(map1);
    if (convert!=null) {
        map1.put("collector_count", convert.getCollectorCount());
        map1.put("order_count", convert.getOrderCount());
        map1.put("collect2order_convert_ratio", convert.getCollect2orderConvertRatio());
        map1.put("payment_count", convert.getPaymentCount());
        map1.put("order2payment_convert_ratio", convert.getOrder2paymentConvertRatio());
    }else {
        map1.put("collector_count", "0");
        map1.put("order_count", "0");
        map1.put("collect2order_convert_ratio", "0");
        map1.put("payment_count", "0");
        map1.put("order2payment_convert_ratio", "0");
    }
    result.add(map1);
    return JSON.toJSONString(map1);
}
    @GetMapping("/user-meijiaquery")
    public String meijiaportrayal(@RequestParam("userid") String userid) {
        System.out.println(userid);
        MeijiaUser meijiaUserInfo = service.getMeijiaUserInfo(userid);
        System.out.println(meijiaUserInfo);
        return JSON.toJSONString(meijiaUserInfo);
    }
    //localhost:8070/convert-query?dtStart=2017-01-01&dtEnd=2020-09-01
    @GetMapping("/lifecycle-query")
    public String getlifecycle(@RequestParam(value = "dtStart", defaultValue = "2017-01-01") String dtStart,@RequestParam(value = "dtEnd", defaultValue = "2020-01-01") String dtEnd) {

        System.out.println(dtStart+"-----"+dtEnd);
        //ActionConvert convert = convertService.getConvert(dtStart, dtEnd);
        ArrayList<Map<String, String>> result = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("dtStart", dtStart);
        map1.put("dtEnd", dtEnd);
        map1.put("total_user", "5000");
        map1.put("new_user", "3000");
        map1.put("grow_user", "1000");
        map1.put("mature_user", "500");
        map1.put("silence_user", "300");
        map1.put("leave_user", "200");
        result.add(map1);
        return JSON.toJSONString(map1);
    }

    @Autowired
    UserGroupQueryPublisherService userGroupQueryservice;
    @PostMapping(path="/user-group-query")
    public String svjUserGroup(@RequestBody UserGroupConditionVO vo) {
        //{}
        ArrayList<LabelConditionVO> conditionlist = new ArrayList<>();
        for(LabelConditionVO labelConditionVO:vo.getConditList()){

            conditionlist.add(labelConditionVO);
        }
        /*Map<String, String> map = new HashMap<>();
        map.put("conName","svj");
        map.put("labelId","svj_user_scheme_count");
        map.put("condition",">");
        map.put("value","200");
        conditionlist.add(map);
        System.out.println(conditionlist);*/
       /* LabelConditionVO labelConditionVO = new LabelConditionVO();
        labelConditionVO.setLabelId("svj_user_scheme_count");
        labelConditionVO.setCondition(">");
        labelConditionVO.setValue("200");
        LabelConditionVO labelConditionVO1 = new LabelConditionVO();
        labelConditionVO1.setLabelId("svj_user_organname");
        labelConditionVO1.setCondition("=");
        labelConditionVO1.setValue("三维家家居运营系统");
        LabelConditionVO labelConditionVO2 = new LabelConditionVO();
        labelConditionVO2.setLabelId("svj_user_scheme_mon_count");
        labelConditionVO2.setCondition(">");
        labelConditionVO2.setValue("5");
        conditionlist.add(labelConditionVO);
        conditionlist.add(labelConditionVO1);
        conditionlist.add(labelConditionVO2);*/
        System.out.println(conditionlist.toString());
        //System.out.println(vo.getConditList());
        ArrayList<UserGroupQuery> result = new ArrayList<>();
        List<UserGroupQuery> querylist = userGroupQueryservice.getUserGroupQueryInfo(conditionlist);
        for(UserGroupQuery userGroupQuery:querylist){
            result.add(userGroupQuery);
        }

        return JSON.toJSONString(result);
    }
    //http://localhost:8070/label-query
    @Autowired
    LabelQueryPublisherService labelservice;
    @PostMapping(path="/label-query")
    public String svjlabel(@RequestBody OneLabelConditionVO vo) {

        System.out.println("公司名称:"+vo.getComName());
        String filter = null;
        if(vo.getCondition().equals("=")){
            filter = "\"info\".\""+vo.getLabelId()+"\""+vo.getCondition()+vo.getValue();
        }else {
             filter = "to_number(\"info\".\""+vo.getLabelId()+"\")"+vo.getCondition()+vo.getValue();
        }
        //String filter = "\"info\".\""+labelId+"\""+condition+conValue;
        System.out.println("查询条件:"+filter);
        ArrayList<LabelQuery> result = new ArrayList<>();
        //Map<String, String> map1 = new HashMap<>();
        List<LabelQuery> querylist = labelservice.getLabelQueryInfo(filter);
        for(LabelQuery labelQuery:querylist){
            result.add(labelQuery);
        }

        // map1.put("value", service.getUserInfo(userid).toString());
        //SvjUser user = service.getUserInfo(conValue);
        //System.out.println(user.getSvj_userid());
       /* map1.put("svj_user_userid", "用户id1");
        map1.put("svj_user_username","用户名称");
        map1.put("svj_user_regdate", "注册时间");
        map1.put("svj_user_regemail", "注册邮箱");
        map1.put("svj_user_birthday", "生日");
        map1.put("svj_user_lastlogintime", "最后登入时间");
        map1.put("svj_user_organname", "企业名称");
        map1.put("svj_user_deptname", "部门名称");
        map1.put("svj_user_employeeidname","员工姓名");
        map1.put("svj_user_mobile","13436965621");
        map1.put(labelId,"1111");
        result.add(map1);*/

        return JSON.toJSONString(result);
    }





}

