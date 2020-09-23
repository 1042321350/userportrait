package com.svj.portrayalpublisher.service;



import com.svj.bean.LabelConditionVO;
import com.svj.bean.UserGroupQuery;

import java.util.List;
import java.util.Map;


public interface UserGroupQueryPublisherService {


    List<UserGroupQuery> getUserGroupQueryInfo(List<LabelConditionVO> list);


}
