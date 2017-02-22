package com.anly.designpattern.chain;

/**
 * Created by mingjun on 17/2/20.
 */
public class Request {

    public String name;

    public Request(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "采购申请";
    }
}
