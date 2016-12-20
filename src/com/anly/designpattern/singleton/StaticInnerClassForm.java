package com.anly.designpattern.singleton;

/**
 * Created by mingjun on 2016/12/16.
 */
public class StaticInnerClassForm extends Form {


    // 私有化的构造, 避免别人直接创建表格
    private StaticInnerClassForm() {}

    // 店长们通过这个接口来取表格
    public static StaticInnerClassForm getInstance() {
        return FormHolder.INSTANCE;
    }

    // 在静态内部类中实例化该单例
    private static class FormHolder {
        private static final StaticInnerClassForm INSTANCE = new StaticInnerClassForm();
    }
}
