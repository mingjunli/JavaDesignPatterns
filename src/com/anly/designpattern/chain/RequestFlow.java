package com.anly.designpattern.chain;

/**
 * Created by mingjun on 17/2/21.
 */
public class RequestFlow {

    public static final int TYPE_SMALL_REQUEST = 1;
    public static final int TYPE_NORMAL_REQUEST = 2;
    public static final int TYPE_BIG_REQUEST = 3;

    public static RequestHandler getRequestChain(int type) {
        switch (type) {
            // 小物件, 只需采购经理审批
            case TYPE_SMALL_REQUEST:
                return new PurchasingManager(null);

            // 一般物件, 需要总经理审批
            case TYPE_NORMAL_REQUEST:
                return new PurchasingManager(new GeneralManager(null));

            // 大件物品, 需要小光审批
            case TYPE_BIG_REQUEST:
            default:
                return  new PurchasingManager(new GeneralManager(new XiaoGuang(null)));
        }
    }
}
