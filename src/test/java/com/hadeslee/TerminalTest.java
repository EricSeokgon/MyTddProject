package com.hadeslee;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hadeslee on 2016-11-11.
 */
public class TerminalTest {
    private static Terminal term;
    //TODO
    /*1.터미널에 접속 - 성공
    * */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        term = new Terminal();
        term.netConnect();
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void netConnect() throws Exception {

    }

    @Test
    public void netDisconnect() throws Exception {

    }

    @Test
    public void logon() throws Exception {

    }

    @Test
    public void logoff() throws Exception {

    }

    @Test
    public void isLogon() throws Exception {

    }

}