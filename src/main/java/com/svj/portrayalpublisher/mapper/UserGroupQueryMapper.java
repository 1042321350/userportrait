package com.svj.portrayalpublisher.mapper;


import com.svj.bean.LabelConditionVO;
import com.svj.bean.UserGroupQuery;

import java.util.List;
import java.util.Map;

public interface UserGroupQueryMapper {

    //SvjUser user = new SvjUser();
    List<UserGroupQuery> getUserGroupQueryInfo(List<LabelConditionVO> conditionList);
}
