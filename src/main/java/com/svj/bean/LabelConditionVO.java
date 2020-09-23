package com.svj.bean;



public class LabelConditionVO {
    private int index;//索引顺序
    private String comName;//事业部
    private String titlale;//主题
    private String typeName;//类别名称
    private String labelId;//标签id
    private String labelName;//标签名称
    private String related;//关联关系
    private String condition;//条件
    private String value;//条件值
    private String valueType;//条件类别(1规则,0条件
    private String rulesId;//规则元
    private String rulesName;//规则元名称
    private String rulesData;//规则元数据

    public LabelConditionVO() {
        this.index = index;
        this.comName = comName;
        this.titlale = titlale;
        this.typeName = typeName;
        this.labelId = labelId;
        this.labelName = labelName;
        this.related = related;
        this.condition = condition;
        this.value = value;
        this.valueType = valueType;
        this.rulesId = rulesId;
        this.rulesName = rulesName;
        this.rulesData = rulesData;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getTitlale() {
        return titlale;
    }

    public void setTitlale(String titlale) {
        this.titlale = titlale;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
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

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getRulesId() {
        return rulesId;
    }

    public void setRulesId(String rulesId) {
        this.rulesId = rulesId;
    }

    public String getRulesName() {
        return rulesName;
    }

    public void setRulesName(String rulesName) {
        this.rulesName = rulesName;
    }

    public String getRulesData() {
        return rulesData;
    }

    public void setRulesData(String rulesData) {
        this.rulesData = rulesData;
    }
}
