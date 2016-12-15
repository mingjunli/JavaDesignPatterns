package com.anly.designpattern.abstractfactory;

/**
 * Created by mingjun on 2016/12/14.
 */
public class HuashanStore implements Store {

    @Override
    public String getAddress() {
        return "花山软件新城";
    }

    @Override
    public String getName() {
        return "花山店";
    }
}
