package com.hadeslee;

/**
 * Created by hadeslee on 2016-11-26.
 */
public class StubCoupon implements ICupon {
    @Override
    public String getName() {
        return "VIP 고객 한가위 감사쿠폰";
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public int getDiscountPercent() {
        return 7;
    }

    @Override
    public boolean isAppliable(Item item) {
        return false;
    }

    @Override
    public void doExpire() {

    }
}
