package com.hadeslee;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by hadeslee on 2016-11-25.
 */
public class MockMD5CipherTest {
    @Test
    public void test패스워드저장() throws Exception {
        UserRegister register =new UserRegister();
        Cipher cipher = new MockMD5Cipher();

        String passowrd = "potato";
        String userId = "sweet88";
        register.savePassword(userId, cipher.encrypt(passowrd));
        String decryptedPassword =  cipher.decrypt(register.)
        assertThat(userId, is("sweet88"));
        assertThat(passowrd, is("potato"));
    }

}