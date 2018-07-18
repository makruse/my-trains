package com.thoughworks.katas;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrackTest {

// I am not sure how to approach this test in a tdd way
// i had to create the constructor town(string name) to create this test, is that ok?
// where do i the spliting of the string? in the track constructor?
// and then i still have the iteration over the string[] in the railway guide, in what order to approach this?

    @Test
    public void createsATrackFromInputString() {
        String trackInput = "AB5";
        Track track = new Track(trackInput);

        assertEquals("A", track.getFromAsString());
        assertEquals("B", track.getToAsString());
    }
}