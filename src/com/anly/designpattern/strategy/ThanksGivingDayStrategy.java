package com.anly.designpattern.strategy;

/**
 * Created by mingjun on 2016/11/17.
 */
public class ThanksGivingDayStrategy implements ActivityStrategy {

    @Override
    public String getActivityPrice() {
        // 经过一系列算法
        return "(感恩节)所有饮品一律5折";
    }
}
