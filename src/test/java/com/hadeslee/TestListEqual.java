package com.hadeslee;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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
        assertThat("리스트 비교", listA, is(listB));
    }

    @Test
    public void restListEqual_NotSorted() {
        List<Employee> listA = new ArrayList<Employee>();
        listA.add(new Employee("김수현"));
        listA.add(new Employee("수지"));

        List<Employee> listB = new ArrayList<Employee>();
        listB.add(new Employee("김수현"));
        listB.add(new Employee("수지"));

        //assertEquals("리스트 비교", listA, listB);
        assertEquals("리스트 비교", listA.toString(), listB.toString());

    }
}
