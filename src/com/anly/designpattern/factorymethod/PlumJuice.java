package com.anly.designpattern.factorymethod;

/**
 * Created by mingjun on 2016/11/15.
 */
public class PlumJuice extends Drink {
    @Override
    String getInstantPackage() {
        return "速溶酸梅粉";
    }

    @Override
    String getName() {
        return "酸梅汤";
    }
}
