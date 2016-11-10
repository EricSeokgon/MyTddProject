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
    * */
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


}