package com.anly.designpattern.proxy;

/**
 * Created by mingjun on 16/11/10.
 */
public class Demo {

    public static void main(String[] args) {

        DaLong daLong = new DaLong(new XiaoGuang());

        // 对方报价120.
        daLong.signing(120);

        // 对方报价100.
        daLong.signing(100);

        // 对方报价90.
        daLong.signing(90);

    }
}
