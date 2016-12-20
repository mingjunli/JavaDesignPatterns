package com.anly.designpattern.singleton;

/**
 * Created by mingjun on 2016/12/16.
 */
public class DCLForm extends Form {

    // 注意, 这里我们引入了volatile关键字
    private volatile static DCLForm sInstance;

    // 私有化的构造, 避免别人直接创建表格
    private DCLForm() {}

    // 店长们通过这个接口来取表格
    public static DCLForm getInstance() {

        // 第一次检查
        if (sInstance == null) {
            // 第一次调用getInstance时, sInstance为空, 进入此分支
            // 使用synchronized block来确保多线程的安全
            synchronized (DCLForm.class) {
                // 第二次检查
                if (sInstance == null) {
                    sInstance = new DCLForm();
                }
            }
        }
        return sInstance;
    }
}
