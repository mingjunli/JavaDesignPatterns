package com.anly.designpattern.chain;

/**
 * Created by mingjun on 17/2/20.
 */
public class PurchasingManager extends RequestHandler {

    /**
     * 构造时, 传入下一个处理人
     * @param next 下一个处理人
     */
    public PurchasingManager(RequestHandler next) {
        super(next);
    }

    @Override
    public String toString() {
        return "采购经理";
    }
}
