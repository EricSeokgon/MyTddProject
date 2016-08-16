package com.hadeslee;

/**
 * Project: MyTddProject
 * FileName: Account
 * Date: 2016-08-16
 * Time: 오후 3:23
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Account {
    private int balance;

    public Account(int money) {
        this.balance = money;
    }

    public int getBalance() {
        return this.balance;
    }
}
