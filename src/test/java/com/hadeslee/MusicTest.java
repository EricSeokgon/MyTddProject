package com.hadeslee;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by hadeslee on 2016-11-29.
 */
public class MusicTest {
    @Test
    public void testEquals_case1() {
        Music musicA = new Music("Better in time ", "Leona Lewis");
        Music musicB = musicA;
        assertThat(musicB, equalTo(musicA));
    }

    @Test
    public void testEquals_case2() {
        Music musicA = new Music("Better in time", "Leona Lewis");
        Music musicB = new Music("Better in time", "Leona Lewis");
        //assertThat(musicB, is(musicA));
        assertThat(musicB.getPerformerName(), equalTo(musicA.getPerformerName()));
        assertThat(musicB.getSongName(), equalTo(musicA.getSongName()));
        assertThat(musicB.toString(), equalTo(musicA.toString()));
    }

    @Test
    public void testListEqual_Primitive() {
        List<String> listA = new ArrayList<String>();
        listA.add("김수현");
        listA.add("수지");

        List<String> listB = new ArrayList<String>();
        listB.add("김수현");
        listB.add("수지");

        assertThat("리스트 비교", listB, is(listA));
    }

}