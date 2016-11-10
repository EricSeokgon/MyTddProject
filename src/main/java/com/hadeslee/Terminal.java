package com.hadeslee;

/**
 * Created by hadeslee on 2016-11-11.
 */
public class Terminal {
    private static Terminal term;

    public void netConnect() {
        System.out.println("Network is estabilished.");
        return;
    }

    public void netDisconnect() {
        System.out.println("Network is disconnected.");
        return;
    }

    public void logon(String id, String pw) {
        System.out.println(id + ":" + pw);
        return;
    }

    public void logoff() {
        return;
    }

    public void isLogon() {
        return;
    }
}
