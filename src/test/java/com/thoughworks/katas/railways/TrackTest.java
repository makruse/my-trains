package com.thoughworks.katas.railways;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrackTest {

    @Test
    public void shouldReturnTrue_givenTrackTBetweenTownAAndBExists() {
        Town from = new Town("A");
        Town to = new Town("B");
        Track track = new Track(from, to, 5);
        assertEquals(true, track.isTrackGoing(new Town("A"), new Town("B")));
    }
}