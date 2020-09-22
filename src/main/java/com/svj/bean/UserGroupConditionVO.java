package com.svj.bean;

import lombok.Data;

import java.util.List;

@Data
public class UserGroupConditionVO {
    private String comName;
    private List<LabelConditionVO> conditList;

}