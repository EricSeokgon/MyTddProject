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
    /* // TODO: 2016-08-16
    * 1.클래스 이름은 Account --완료
     * 2.기능은 세가지
     * -잔고 조회
     * -입금
     * -출금
     * 근액은 원 단위로(예: 천 원 = 1000)
    * */

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
