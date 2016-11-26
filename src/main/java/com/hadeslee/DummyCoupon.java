package com.hadeslee;

/**
 * Created by hadeslee on 2016-11-26.
 */
public class DummyCoupon implements ICupon {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public int getDiscountPercent() {
        return 1;
    }

    @Override
    public boolean isAppliable(Item item) {
        return false;
    }

    @Override
    public void doExpire() {

    }
}
