package com.anly.designpattern.proxy;

/**
 * Created by mingjun on 2016/11/25.
 */
public class XiaoGuang implements Person {

    @Override
    public void signing(int price) {
        System.out.println("小光以" + price + "每箱的价格签单.");
    }
}
