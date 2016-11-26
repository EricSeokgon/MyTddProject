package com.hadeslee;

/**
 * Created by hadeslee on 2016-11-26.
 */
public class User {
    private String userId;
    private String Password;
    private int TotalCouponCount;
    private int addCoupon;


    public User(String sklee) {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getTotalCouponCount() {
        return TotalCouponCount;
    }

    public void setTotalCouponCount(int totalCouponCount) {
        TotalCouponCount = totalCouponCount;
    }

    public int getAddCoupon() {
        return addCoupon;
    }

    public void setAddCoupon(int addCoupon) {
        this.addCoupon = addCoupon;
    }

    public void addCoupon(ICupon cupon) {
        TotalCouponCount = 1;
    }
}
