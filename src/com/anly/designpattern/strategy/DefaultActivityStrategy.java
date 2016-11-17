package com.anly.designpattern.strategy;

/**
 * Created by mingjun on 2016/11/17.
 */
public class DefaultActivityStrategy implements ActivityStrategy {
    @Override
    public String getActivityPrice() {
        // 什么都不做
        return "没有活动";
    }
}
