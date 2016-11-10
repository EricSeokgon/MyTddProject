package com.hadeslee;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by hadeslee on 2016-11-11.
 */
public class TerminalTest {
    private static Terminal term;
    //TODO

    /**
     * 1.터미널에 접속 - 성공
     * 2.터미널과 연결 해제한다-성공
     * 3.시스템에 로그온-성공
     * 4.시스템으로부터 로그오프-성공
     * 5.정상적으로 로그인됐는지 테스트
     * 6.터미널 메시지 테스트
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        term = new Terminal();
        term.netConnect();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        term.netDisconnect();
    }

    @Before
    public void setUp() throws Exception {
        term.logon("guest", "geust");
    }

    @After
    public void tearDown() throws Exception {
        term.logoff();
    }

    @Test
    public void testTerminalConnected() throws Exception {
        System.out.println("== logon test");
    }

    @Test
    public void testGetReturnMessage() throws Exception {
        term.sendMessage("world!");
        assertEquals("world!",term.getReturnMessage());
        System.out.println("== message test");

    }


}