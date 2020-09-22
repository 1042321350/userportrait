package com.svj.portrayalpublisher.mapper;


import com.svj.bean.LabelQuery;

import java.util.List;

public interface LabelQueryMapper {

    //SvjUser user = new SvjUser();
    List<LabelQuery> getLabelQueryInfo(String filter);
}
