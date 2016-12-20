package com.anly.designpattern.singleton;

/**
 * Created by mingjun on 2016/12/16.
 */
public class HungryForm extends Form {

    // 提前创建好
    private static HungryForm sInstance = new HungryForm();

    // 私有化的构造, 避免别人直接创建表格
    private HungryForm() {}

    // 店长们通过这个接口来取表格
    public static HungryForm getInstance() {
        return sInstance;
    }
}
