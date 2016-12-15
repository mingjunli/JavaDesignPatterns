package com.anly.designpattern.abstractfactory;

/**
 * Created by mingjun on 2016/12/14.
 */
public class SbiStore implements Store {

    @Override
    public String getAddress() {
        return "关山创业街";
    }

    @Override
    public String getName() {
        return "SBI店";
    }
}
