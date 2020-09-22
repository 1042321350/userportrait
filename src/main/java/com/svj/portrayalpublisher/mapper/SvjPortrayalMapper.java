package com.svj.portrayalpublisher.mapper;


import com.svj.bean.SvjUserPortrait;

import java.util.List;
import java.util.Map;

public interface SvjPortrayalMapper {

    //SvjUser user = new SvjUser();
    SvjUserPortrait getUserInfo(String userid);
}
