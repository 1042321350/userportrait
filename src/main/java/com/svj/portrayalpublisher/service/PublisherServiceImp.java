package com.svj.portrayalpublisher.service;


import com.svj.bean.SvjUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.svj.portrayalpublisher.mapper.SvjPortrayalMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class PublisherServiceImp implements PublisherService {


    @Autowired
    SvjPortrayalMapper svjPortrayalMapper;

    // 用户信息
    @Override
        public SvjUser getUserInfo(String userid) {


        return svjPortrayalMapper.getUserInfo(userid);
}
}
