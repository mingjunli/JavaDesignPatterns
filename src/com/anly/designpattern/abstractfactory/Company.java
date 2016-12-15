package com.anly.designpattern.abstractfactory;

/**
 * Created by mingjun on 2016/12/14.
 */
public class Company {

    private Store store;
    private Checkstand checkstand;
    private Tableware tableware;

    public Company(Store store, Checkstand checkstand, Tableware tableware) {
        this.store = store;
        this.checkstand = checkstand;
        this.tableware = tableware;
    }

    @Override
    public String toString() {
        return "分店{" +
                "地址:" + store.getAddress() +
                ", 名字:" + store.getName() +
                ", 收银账户:" + checkstand.getAccount() +
                ", 杯具餐具标签:" + tableware.getLabel() +
                '}';
    }
}
