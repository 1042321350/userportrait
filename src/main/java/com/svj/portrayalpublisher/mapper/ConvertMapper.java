package com.svj.portrayalpublisher.mapper;

import com.svj.bean.ActionConvert;

public interface ConvertMapper {


    ActionConvert getConvert(String dtStart, String dtEnd);
}
