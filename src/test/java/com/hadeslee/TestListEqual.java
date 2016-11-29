package com.hadeslee;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Project: MyTddProject
 * FileName: TestListEqual
 * Date: 2016-11-29
 * Time: 오전 11:22
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TestListEqual {
    @Test
    public void testListEqual_Primitive() {
        List<String> listA = new ArrayList<String>();
        listA.add("김수현");
        listA.add("수지");

        List<String> listB = new ArrayList<String>();
        listB.add("김수현");
        listB.add("수지");

        assertEquals("리스트 비교", listA, listB);
    }
}
