package com.hadeslee;

import junit.framework.TestCase;

/**
 * Project: MyTddProject
 * FileName: initTest
 * Date: 2016-08-05
 * Time: 오후 5:28
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class initTest extends TestCase {
    public int x = 10;

    public initTest(String arg) {
        super(arg);
    }

    public void setUp() {
        x = 20;
    }

    public void tearDown() {
        x = 0;
    }

    public void testOne() {
        for (int i = 0; i < 100; i++) {
            x++;
        }
        System.out.println("testOne's x=" + x);
    }

    public void testTwo() {
        for (int i = 0; i < 10; i++) {
            x++;
        }
        System.out.println("testTwo's x=" + x);
    }
}
