package com.anly.designpattern.chain;

/**
 * Created by mingjun on 17/2/20.
 */
public class XiaoGuang extends RequestHandler {

    public XiaoGuang(RequestHandler next) {
        super(next);
    }

    @Override
    public String toString() {
        return "小光";
    }
}
