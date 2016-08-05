package com.hadeslee;

import junit.framework.TestCase;

/**
 * Project: MyTddProject
 * FileName: TestOne
 * Date: 2016-08-05
 * Time: 오후 5:12
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TestOne extends TestCase {
    public TestOne(String name) {
        super(name);
    }

    public void testAdd() {
        assertEquals(2, 1 + 1);
    }
}
