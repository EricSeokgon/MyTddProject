package com.hadeslee;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by hadeslee on 2016-11-26.
 */
public class UserTest {
    @Test
    public void test쿠폰추가() throws Exception {
        User user = new User("sklee");
        assertThat("쿠폰 수령 전 ",user.getTotalCouponCount(), is(0));

        ICupon cupon = new DummyCoupon();

        user.add
    }

}