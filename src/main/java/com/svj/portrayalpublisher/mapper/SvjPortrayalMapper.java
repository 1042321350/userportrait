package com.svj.portrayalpublisher.mapper;

import com.svj.bean.SvjUser;

import java.util.List;
import java.util.Map;

public interface SvjPortrayalMapper {

    //SvjUser user = new SvjUser();
    SvjUser getUserInfo(String userid);
}
