package com.anly.designpattern.templatemethod;

/**
 * Created by mingjun on 2016/12/22.
 */
public class PackingMaker extends Maker {

    @Override
    void zhuangwan() {
        System.out.println("热干面捞出, 装入一次性碗");
    }
}
