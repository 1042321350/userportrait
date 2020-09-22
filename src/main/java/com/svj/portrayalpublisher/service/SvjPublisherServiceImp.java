package com.svj.portrayalpublisher.service;

import com.svj.bean.MeijiaUser;
import com.svj.bean.SvjUserPortrait;
import com.svj.portrayalpublisher.mapper.MeijiaPortrayalMapper;
import com.svj.portrayalpublisher.mapper.SvjPortrayalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SvjPublisherServiceImp implements SvjPublisherService {


    @Autowired
    SvjPortrayalMapper svjPortrayalMapper;
    @Autowired
    private MeijiaPortrayalMapper meijiaPortrayalMapper;

    @Override
        public SvjUserPortrait getUserInfo(String userid) {


         return svjPortrayalMapper.getUserInfo(userid);
   }
    @Override
    public MeijiaUser getMeijiaUserInfo(String userid) {
        return meijiaPortrayalMapper.getUserInfo(userid);
    }
}
