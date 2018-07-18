package com.thoughworks.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RailwayGuideTest {

    @Test
    public void givenAB5AsInput_whenAskedForDistanceAB_ReturnDistanceOf5() {
        String[] input = {"AB5"};
        Graph graph = GraphBuilder.buildGraphFrom(input);
        RailwayGuide guide = new RailwayGuide(graph);
        int distance = guide.getDistanceOfRoute("AB");

        assertEquals(5, distance);
    }

    @Test
    public void givenTwoTracks_whenAskedForWholeRoute_ReturnsSumOfDistances() {
        String[] input = {"AB5", "BC4"};
        Graph graph = GraphBuilder.buildGraphFrom(input);
        RailwayGuide guide = new RailwayGuide(graph);
        int distance = guide.getDistanceOfRoute("ABC");

        assertEquals(9, distance);
    }
}