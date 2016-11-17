package com.anly.designpattern.factorymethod;

/**
 * Created by mingjun on 2016/11/15.
 */
public class OrangeJuice extends Drink {
    @Override
    String getInstantPackage() {
        return "速溶橙汁粉";
    }

    @Override
    String getName() {
        return "橙汁";
    }
}
