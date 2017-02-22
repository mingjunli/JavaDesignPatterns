package com.anly.designpattern.chain;

/**
 * Created by mingjun on 17/2/20.
 */
public abstract class RequestHandler {

    // 上一级的处理人员
    private RequestHandler mNext;

    public RequestHandler(RequestHandler next) {
        this.mNext = next;
    }

    /**
     * 处理采购需求
     * @param req
     */
    public void handleRequest(Request req) {
        printHandling(req);
        if (mNext != null) {
            mNext.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        System.out.println(this.toString() + "审批了:" + req);
    }

    @Override
    public abstract String toString();
}
