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
     * 10000원으로 계좌 생성
     * 잔고 조회 결과 일치
     * -입금 --완료
     * 10000원으로 계좌 생성
     * 1000원 입금
     * 잔고 11000원 확인
     * -출금 --완료
     * 10000원으로 계좌 생성
     * 1000원 출금
     * 잔고 9000원 확인
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

    @Test
    public void testDeposit() throws Exception {
        Account account = new Account(10000);
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    @Test
    public void testWirhdraw() throws Exception {
        Account account = new Account(10000);
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());

    }

}
