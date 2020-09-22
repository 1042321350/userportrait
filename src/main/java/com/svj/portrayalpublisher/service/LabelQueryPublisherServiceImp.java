package com.svj.portrayalpublisher.service;


import com.svj.bean.LabelQuery;
import com.svj.portrayalpublisher.mapper.LabelQueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LabelQueryPublisherServiceImp implements LabelQueryPublisherService{


    @Autowired
    LabelQueryMapper labelQueryMapper;

    @Override
    public List<LabelQuery> getLabelQueryInfo(String filter) {
        List<LabelQuery> queryList =labelQueryMapper.getLabelQueryInfo(filter);


        return queryList;
    }
}
