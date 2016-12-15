package com.anly.designpattern.abstractfactory;

/**
 * Created by mingjun on 2016/12/14.
 */
public interface CompanyFactory {

    Store createStore();

    Checkstand createCheckstand();

    Tableware createTableware();
}
