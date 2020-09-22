package com.svj.portrayalpublisher.service;

import com.svj.bean.LabelQuery;

import java.util.List;


public interface LabelQueryPublisherService {


    List<LabelQuery> getLabelQueryInfo(String filter);


}
