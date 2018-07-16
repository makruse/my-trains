package com.thoughworks.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RailwayGuideTest {

    @Test
    public void givenAB5AsInput_whenAskedForDistanceAB_ReturnDistanceOf5() {

        String input = "AB5";
        RailwayGuide guide = new RailwayGuide(input);
        int distance = guide.getDistanceOf("AB");

        assertEquals(5, distance);
    }
}