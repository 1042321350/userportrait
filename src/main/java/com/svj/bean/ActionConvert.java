package com.svj.bean;

/**
 * 3*descriptions:
 * 4*
 * 5*author: LiCan
 * 6*date: 2020 - 09 - 12 17:20
 * 7
 */
public class ActionConvert {
    //String dt;
    String collectorCount;
    String orderCount;
    String collect2orderConvertRatio;
    String paymentCount;
    String order2paymentConvertRatio;

    public ActionConvert(String collectorCount, String orderCount, String collect2orderConvertRatio, String paymentCount, String order2paymentConvertRatio) {
        this.collectorCount = collectorCount;
        this.orderCount = orderCount;
        this.collect2orderConvertRatio = collect2orderConvertRatio;
        this.paymentCount = paymentCount;
        this.order2paymentConvertRatio = order2paymentConvertRatio;
    }

    public String getCollectorCount() {
        return collectorCount;
    }

    public void setCollectorCount(String collectorCount) {
        this.collectorCount = collectorCount;
    }

    public String getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount;
    }

    public String getCollect2orderConvertRatio() {
        return collect2orderConvertRatio;
    }

    public void setCollect2orderConvertRatio(String collect2orderConvertRatio) {
        this.collect2orderConvertRatio = collect2orderConvertRatio;
    }

    public String getPaymentCount() {
        return paymentCount;
    }

    public void setPaymentCount(String paymentCount) {
        this.paymentCount = paymentCount;
    }

    public String getOrder2paymentConvertRatio() {
        return order2paymentConvertRatio;
    }

    public void setOrder2paymentConvertRatio(String order2paymentConvertRatio) {
        this.order2paymentConvertRatio = order2paymentConvertRatio;
    }
}
