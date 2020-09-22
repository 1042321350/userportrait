package com.svj.bean;

public class MeijiaUser {
    private String userid;
    private String username;
    private String nickname;
    private String sex;
    private String birthdaytime;
    private String servicearea;
    private String shopIndustries;
    private String roleCode;
    private String stylecategoryid;
    private String registerSource;
    private String bookCount;
    private String collectCount;
    private String operationCount;
    private String commentCount;
    private String maxDayBookCount;
    private String maxDayCollectCount;
    private String maxDayOperationCount;
    private String maxDayCommentCount;
    private String orderCount;
    private String orderAmount;
    private String paymentCount;
    private String paymentAmount;
    private String averagePaymentAmount;
    private String maxDayPaymentAmount;



    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthdaytime() {
        return birthdaytime;
    }

    public void setBirthdaytime(String birthdaytime) {
        this.birthdaytime = birthdaytime;
    }

    public String getServicearea() {
        return servicearea;
    }

    public void setServicearea(String servicearea) {
        this.servicearea = servicearea;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "MeijiaUser{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthdaytime='" + birthdaytime + '\'' +
                ", servicearea='" + servicearea + '\'' +
                ", shopIndustries='" + shopIndustries + '\'' +
                ", roleCode='" + roleCode + '\'' +
                ", stylecategoryid='" + stylecategoryid + '\'' +
                ", registerSource='" + registerSource + '\'' +
                ", bookCount='" + bookCount + '\'' +
                ", collectCount='" + collectCount + '\'' +
                ", operationCount='" + operationCount + '\'' +
                ", commentCount='" + commentCount + '\'' +
                ", maxDayBookCount='" + maxDayBookCount + '\'' +
                ", maxDayCollectCount='" + maxDayCollectCount + '\'' +
                ", maxDayOperationCount='" + maxDayOperationCount + '\'' +
                ", maxDayCommentCount='" + maxDayCommentCount + '\'' +
                ", orderCount='" + orderCount + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                ", paymentCount='" + paymentCount + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", averagePaymentAmount='" + averagePaymentAmount + '\'' +
                ", maxDayPaymentAmount='" + maxDayPaymentAmount + '\'' +
                '}';
    }

    public String getShopIndustries() {
        return shopIndustries;
    }

    public void setShopIndustries(String shopIndustries) {
        this.shopIndustries = shopIndustries;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getStylecategoryid() {
        return stylecategoryid;
    }

    public void setStylecategoryid(String stylecategoryid) {
        this.stylecategoryid = stylecategoryid;
    }

    public String getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(String registerSource) {
        this.registerSource = registerSource;
    }

    public String getBookCount() {
        return bookCount;
    }

    public void setBookCount(String bookCount) {
        this.bookCount = bookCount;
    }

    public String getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(String collectCount) {
        this.collectCount = collectCount;
    }

    public String getOperationCount() {
        return operationCount;
    }

    public void setOperationCount(String operationCount) {
        this.operationCount = operationCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getMaxDayBookCount() {
        return maxDayBookCount;
    }

    public void setMaxDayBookCount(String maxDayBookCount) {
        this.maxDayBookCount = maxDayBookCount;
    }

    public String getMaxDayCollectCount() {
        return maxDayCollectCount;
    }

    public void setMaxDayCollectCount(String maxDayCollectCount) {
        this.maxDayCollectCount = maxDayCollectCount;
    }

    public String getMaxDayOperationCount() {
        return maxDayOperationCount;
    }

    public void setMaxDayOperationCount(String maxDayOperationCount) {
        this.maxDayOperationCount = maxDayOperationCount;
    }

    public String getMaxDayCommentCount() {
        return maxDayCommentCount;
    }

    public void setMaxDayCommentCount(String maxDayCommentCount) {
        this.maxDayCommentCount = maxDayCommentCount;
    }

    public String getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getPaymentCount() {
        return paymentCount;
    }

    public void setPaymentCount(String paymentCount) {
        this.paymentCount = paymentCount;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getAveragePaymentAmount() {
        return averagePaymentAmount;
    }

    public void setAveragePaymentAmount(String averagePaymentAmount) {
        this.averagePaymentAmount = averagePaymentAmount;
    }

    public String getMaxDayPaymentAmount() {
        return maxDayPaymentAmount;
    }

    public void setMaxDayPaymentAmount(String maxDayPaymentAmount) {
        this.maxDayPaymentAmount = maxDayPaymentAmount;
    }

    public MeijiaUser(String userid, String username, String nickname, String sex, String birthdaytime, String servicearea, String shopIndustries, String roleCode, String stylecategoryid, String registerSource, String bookCount, String collectCount, String operationCount, String commentCount, String maxDayBookCount, String maxDayCollectCount, String maxDayOperationCount, String maxDayCommentCount, String orderCount, String orderAmount, String paymentCount, String paymentAmount, String averagePaymentAmount, String maxDayPaymentAmount) {

        this.userid = userid;
        this.username = username;
        this.nickname = nickname;
        this.sex = sex;
        this.birthdaytime = birthdaytime;
        this.servicearea = servicearea;
        this.shopIndustries = shopIndustries;
        this.roleCode = roleCode;
        this.stylecategoryid = stylecategoryid;
        this.registerSource = registerSource;
        this.bookCount = bookCount;
        this.collectCount = collectCount;
        this.operationCount = operationCount;
        this.commentCount = commentCount;
        this.maxDayBookCount = maxDayBookCount;
        this.maxDayCollectCount = maxDayCollectCount;
        this.maxDayOperationCount = maxDayOperationCount;
        this.maxDayCommentCount = maxDayCommentCount;
        this.orderCount = orderCount;
        this.orderAmount = orderAmount;
        this.paymentCount = paymentCount;
        this.paymentAmount = paymentAmount;
        this.averagePaymentAmount = averagePaymentAmount;
        this.maxDayPaymentAmount = maxDayPaymentAmount;
    }

    public MeijiaUser() {


    }
}
