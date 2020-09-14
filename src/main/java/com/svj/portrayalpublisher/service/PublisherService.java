package com.svj.portrayalpublisher.service;

import com.svj.bean.SvjUser;



public interface PublisherService {
    /**
     * 获取用户信息
     * @param userid
     * @return
     */

    SvjUser getUserInfo(String userid);


}
