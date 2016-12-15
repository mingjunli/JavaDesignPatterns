package com.anly.designpattern.abstractfactory;

/**
 * Created by mingjun on 2016/12/14.
 */
public class HuashanCompanyFactory implements CompanyFactory {
    @Override
    public Store createStore() {
        return new HuashanStore();
    }

    @Override
    public Checkstand createCheckstand() {
        return new HuashanCheckStand();
    }

    @Override
    public Tableware createTableware() {
        return new HuashanTableware();
    }
}
