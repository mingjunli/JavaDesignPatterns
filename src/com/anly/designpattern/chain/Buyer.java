package com.anly.designpattern.chain;

/**
 * Created by mingjun on 17/2/20.
 */
public class Buyer {

    public static void main(String[] args) {

        // 小需求
        Request smallRequest = new Request("10箱饮料");
        RequestFlow.getRequestChain(RequestFlow.TYPE_SMALL_REQUEST).handleRequest(smallRequest);

        // 一般需求
        Request normalRequest = new Request("10套桌椅");
        RequestFlow.getRequestChain(RequestFlow.TYPE_NORMAL_REQUEST).handleRequest(normalRequest);

        // 大需求
        Request bigRequest = new Request("一套同步电子显示大屏");
        RequestFlow.getRequestChain(RequestFlow.TYPE_BIG_REQUEST).handleRequest(bigRequest);

    }
}
