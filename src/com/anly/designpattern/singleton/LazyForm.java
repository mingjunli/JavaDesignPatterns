package com.anly.designpattern.singleton;

/**
 * Created by mingjun on 2016/12/16.
 */
public class LazyForm extends Form {

    private static LazyForm sInstance;

    // 私有化的构造, 避免别人直接创建表格
    private LazyForm() {}

    // 店长们通过这个接口来取表格
    public static LazyForm getInstance() {

        // 在有店长访问该文件时才创建, 通过判断当前文件是否存在(sInstance == null)来避免重复创建
        if (sInstance == null) {
            sInstance = new LazyForm();
        }
        return sInstance;
    }
}
