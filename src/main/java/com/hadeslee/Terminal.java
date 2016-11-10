package com.hadeslee;

/**
 * Created by hadeslee on 2016-11-11.
 */
public class Terminal {
    private static Terminal term;
    private String ReturnMessage;

    public void netConnect() {
        System.out.println("Network is estabilished.");
        return;
    }

    public void netDisconnect() {
        System.out.println("Network is disconnected.");
        return;
    }

    public void logon(String id, String pw) {
        System.out.println(">>logon " + id + ":" + pw);
        return;
    }

    public void logoff() {
        System.out.println("<<logoff");
        return;
    }

    public void isLogon() {
        return;
    }

    public void sendMessage(String msg) {
       // System.out.println(msg);
        this.ReturnMessage = msg;
    }

    public String getReturnMessage() {
        return this.ReturnMessage;
    }
}
