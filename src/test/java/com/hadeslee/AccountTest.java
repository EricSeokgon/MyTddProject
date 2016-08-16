package com.hadeslee;

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
    public void testAccount() throws Exception {
        Account account = new Account();
        if (account == null) {
            throw new Exception("계좌생성 실패");
        }
    }

    public static void main(String[] args) {
        AccountTest test = new AccountTest();
        try {
            test.testAccount();
        } catch (Exception e) {
            System.out.println("실패(X)");
            return;
        }
        System.out.println("성공(O)");
    }
}
