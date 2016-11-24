package com.hadeslee;

/**
 * Created by hadeslee on 2016-11-25.
 */
public class MockMD5Cipher implements Cipher {
    @Override
    public String encrypt(String source) {
        return "potato";
    }

    @Override
    public String decrypt(String source) {
        return "8ee2027983915ec78acc45027d874316";
    }
}
