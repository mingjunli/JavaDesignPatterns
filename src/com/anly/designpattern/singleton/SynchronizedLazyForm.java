package com.anly.designpattern.singleton;

/**
 * Created by mingjun on 2016/12/16.
 */
public class SynchronizedLazyForm extends Form {

    private static SynchronizedLazyForm sInstance;

    // 私有化的构造, 避免别人直接创建表格
    private SynchronizedLazyForm() {}

    // 店长们通过这个接口来取表格
    // 注意, 这是一个synchronized方法
    // 参考https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html
    public static synchronized SynchronizedLazyForm getInstance() {

        // 在有店长访问该文件时才创建, 通过判断当前文件是否存在(sInstance == null)来避免重复创建
        if (sInstance == null) {
            sInstance = new SynchronizedLazyForm();
        }
        return sInstance;
    }
}
