package com.hadeslee;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Project: MyTddProject
 * FileName: TestTwo
 * Date: 2016-08-05
 * Time: 오후 5:15
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TestTwo extends TestCase {
    public TestTwo(String name) {
        super(name);
    }

    public void testSub() {
        assertEquals(0, 1 - 1);
    }

    public void testMult() {
        assertEquals(1, 1 * 1);
    }

    public static Test Suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new TestTwo("testSub"));
        suite.addTestSuite(TestOne.class);
        return suite;
    }
}
