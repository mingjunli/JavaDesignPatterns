package com.anly.designpattern.strategy;

/**
 * Created by mingjun on 16/11/10.
 */
public class XiaoGuang {

    public static void main(String[] args) {

        // 收银台, 默认
        Checkstand checkstand = new Checkstand();
        checkstand.printBill();

        // 感恩节期间
        checkstand.setActivityStrategy(new ThanksGivingDayStrategy());
        checkstand.printBill();

        // 双十二
        checkstand.setActivityStrategy(new DoubleTwelveDayStrategy());
        checkstand.printBill();

        // 圣诞节期间
        checkstand.setActivityStrategy(new ChristmasStrategy());
        checkstand.printBill();
    }
}
