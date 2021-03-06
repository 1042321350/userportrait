package com.svj.portrayalpublisher.service;


import com.svj.bean.ActionConvert;
import com.svj.portrayalpublisher.mapper.ConvertMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConvertServiceImp implements ConvertService {


    @Autowired
    ConvertMapper convertMapper;



    @Override
    public ActionConvert getConvert(String dtStart, String dtEnd) {
        return convertMapper.getConvert(dtStart,dtEnd);
    }
}
