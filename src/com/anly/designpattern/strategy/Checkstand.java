package com.anly.designpattern.strategy;

/**
 * Created by mingjun on 2016/11/17.
 * 收银台
 */
public class Checkstand {

    private ActivityStrategy mActivityStrategy;

    public Checkstand() {
        mActivityStrategy = new DefaultActivityStrategy();
    }

    public Checkstand(ActivityStrategy activityStrategy) {
        this.mActivityStrategy = activityStrategy;
    }

    public void setActivityStrategy(ActivityStrategy activityStrategy) {
        this.mActivityStrategy = activityStrategy;
    }

    public void printBill() {
        System.out.println("本次账单活动:" + mActivityStrategy.getActivityPrice());
    }
}
