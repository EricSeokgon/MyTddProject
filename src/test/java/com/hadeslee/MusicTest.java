package com.hadeslee;

import org.junit.Test;

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
        Music musicA = new Music("Better in time ", "Leona Lewis");
        Music musicB = new Music("Better in time ", "Leona Lewis");
        //assertThat(musicB,equalTo(musicA));
        assertThat(musicB.getPerformerName(), equalTo(musicA.getPerformerName()));
        assertThat(musicB.getSongName(), equalTo(musicA.getSongName()));
        assertThat(musicB.toString(),equalTo(musicA.toString()));
    }

}