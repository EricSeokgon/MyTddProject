package com.hadeslee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Project: MyTddProject
 * FileName: AccountTest
 * Date: 2016-08-16
 * Time: 오후 3:20
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AccountTest {
    /* // TODO: 2016-08-16
    * 1.클래스 이름은 Account --완료
     * 2.기능은 세가지
     * -잔고 조회 --완료
     * -입금
     * -출금
     * 근액은 원 단위로(예: 천 원 = 1000)
    * */
    @Test
    public void testAccount() throws Exception {
        Account account = new Account(10000);
    }

    @Test
    public void testGetBalance() throws Exception {
        Account account = new Account(10000);
        assertEquals(10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());

    }

}
