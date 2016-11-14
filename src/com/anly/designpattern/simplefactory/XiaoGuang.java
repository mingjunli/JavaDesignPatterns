package com.anly.designpattern.simplefactory;

/**
 * Created by mingjun on 16/11/10.
 */
public class XiaoGuang {

    public static void main(String[] args) {

        Drink drink = Cousins.create("可乐");
        drink.make();
    }
}
