package com.company.test;

import com.company.PlayList;

import static org.junit.Assert.*;

public class PlayListTest {

    PlayList playList;
    @org.junit.Before
    public void setUp() throws Exception {
        playList = new PlayList();
    }

    @org.junit.Test
    public void getLengthFromName() {
        int theLength = playList.getLengthFromName("Cobra Kia");
        assertEquals(60, theLength);
        theLength = playList.getLengthFromName("Stranger Things");
        assertEquals(0, theLength);
    }

    @org.junit.Test
    public void getIsITGoodFromName() {
        assertFalse(playList.getIsITGoodFromName("Cobra Kia"));
        assertTrue(playList.getIsITGoodFromName("Stranger Things"));
    }

    @org.junit.Test
    public void getPlayList() {
    }
}