package com.svj.bean;



public class OneLabelConditionVO {
    private String comName;//事业部
    private String labelId;//标签id
    private String condition;//条件
    private String value;//条件值

    public OneLabelConditionVO(String comName, String labelId, String condition, String value) {
        this.comName = comName;
        this.labelId = labelId;
        this.condition = condition;
        this.value = value;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
