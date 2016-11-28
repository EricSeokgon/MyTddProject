package com.hadeslee;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by hadeslee on 2016-11-29.
 */
public class TestArrayEqual {
    @Test
    public void test배열테스트() {
        String[] arrayA = new String[]{"A", "B", "C"};
        String[] arrayB = new String[]{"A", "B", "C"};
        assertArrayEquals("두 배열의 값과 순서가 같아야 함", arrayA, arrayB);
    }
}
