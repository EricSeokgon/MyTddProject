package com.hadeslee;

/**
 * Created by hadeslee on 2016-11-25.
 */
public interface ICupon {
    public String getName();
    public boolean isValid();
    public int getDiscountPercent();
    public boolean isAppliable(Item item);
    public void doExpire();
}
