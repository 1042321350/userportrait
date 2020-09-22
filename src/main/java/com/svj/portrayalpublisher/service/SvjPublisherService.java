package com.svj.portrayalpublisher.service;




import com.svj.bean.MeijiaUser;
import com.svj.bean.SvjUserPortrait;


public interface SvjPublisherService {
    /**
     * 获取用户信息
     * @param userid
     * @return
     */

    SvjUserPortrait getUserInfo(String userid);
    MeijiaUser getMeijiaUserInfo(String userid);

}
