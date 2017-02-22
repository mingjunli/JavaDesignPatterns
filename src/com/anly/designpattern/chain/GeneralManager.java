package com.anly.designpattern.chain;

/**
 * Created by mingjun on 17/2/20.
 */
public class GeneralManager extends RequestHandler {

    public GeneralManager(RequestHandler next) {
        super(next);
    }

    @Override
    public String toString() {
        return "总经理";
    }
}
