package com.anly.designpattern.abstractfactory;

/**
 * Created by mingjun on 2016/12/14.
 */
public class SbiCompanyFactory implements CompanyFactory {
    @Override
    public Store createStore() {
        return new SbiStore();
    }

    @Override
    public Checkstand createCheckstand() {
        return new SbiCheckStand();
    }

    @Override
    public Tableware createTableware() {
        return new SbiTableware();
    }
}
