package com.hadeslee;

import org.hamcrest.Matcher;
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
        assertThat("쿠폰 수령 전 ", user.getTotalCouponCount(), is(0));

        ICupon cupon = new DummyCoupon();

        user.addCoupon(cupon);
        assertThat("쿠폰 수령 후", user.getTotalCouponCount(), is(1));

    }

    @Test
    public void testGetLastoccupiedCoupon() throws Exception {
        User user = new User("sklee");
        ICupon eventCoupon = new StubCoupon();
        user.addCoupon(eventCoupon);
        ICupon lastCoupon = user.getLastOccupiedCoupon();

        //assertThat("쿠폰 할인율", lastCoupon.getDiscountPercent(), is(7));
        //assertThat("쿠폰 이름", lastCoupon.getName(), is("VIP 고객 한가위 감사쿠폰"));
    }

    @Test
    public void testGetOrderPrice_discountableItem() throws Exception {
        PriceCalculator calcuator = new PriceCalculator();
        User user = new User("sklee");
        //new Item(이름,카테고리,가격)
        Item item = new Item("LightSavor", "부억칼", 100000);
        ICupon coupon = new StubCoupon();
        user.setDiscountPercent(10);

        assertThat("쿠폰으로 인해 할인된 가격", calcuator.getOrderPrice(item, coupon), is(93000));

    }

}