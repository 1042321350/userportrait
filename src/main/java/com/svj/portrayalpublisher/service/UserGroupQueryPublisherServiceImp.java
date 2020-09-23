package com.svj.portrayalpublisher.service;


import com.svj.bean.LabelConditionVO;
import com.svj.bean.LabelQuery;
import com.svj.bean.UserGroupQuery;
import com.svj.portrayalpublisher.mapper.LabelQueryMapper;
import com.svj.portrayalpublisher.mapper.UserGroupQueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class UserGroupQueryPublisherServiceImp implements UserGroupQueryPublisherService{


    @Autowired
    UserGroupQueryMapper userGroupQueryMapper;

    @Override
    public List<UserGroupQuery> getUserGroupQueryInfo(List<LabelConditionVO> conditionList) {
        List<UserGroupQuery> queryList =userGroupQueryMapper.getUserGroupQueryInfo(conditionList);


        return queryList;
    }

    /*@Override
    public List<UserGroupQuery> getUserGroupQueryInfo(List conditionList) {
        List<LabelQuery> queryList =labelQueryMapper.getLabelQueryInfo(filter);


        return queryList;
    }*/
}
