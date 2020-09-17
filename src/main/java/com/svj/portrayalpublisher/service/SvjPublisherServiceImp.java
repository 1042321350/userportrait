package com.svj.portrayalpublisher.service;


import com.svj.bean.SvjUser;
import com.svj.portrayalpublisher.mapper.SvjPortrayalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SvjPublisherServiceImp implements SvjPublisherService {


    @Autowired
    SvjPortrayalMapper svjPortrayalMapper;

    // 用户信息
    @Override
        public SvjUser getUserInfo(String userid) {


         return svjPortrayalMapper.getUserInfo(userid);
   }
}
