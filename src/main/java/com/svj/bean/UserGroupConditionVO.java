package com.svj.bean;

import lombok.Data;

import java.util.List;

public class UserGroupConditionVO {
    private String comName;
    private List<LabelConditionVO> conditList;

    public UserGroupConditionVO(String comName, List<LabelConditionVO> conditList) {
        this.comName = comName;
        this.conditList = conditList;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public List<LabelConditionVO> getConditList() {
        return conditList;
    }

    public void setConditList(List<LabelConditionVO> conditList) {
        this.conditList = conditList;
    }
}