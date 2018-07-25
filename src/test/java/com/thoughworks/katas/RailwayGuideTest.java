package com.thoughworks.katas;

import com.thoughworks.katas.railways.Graph;
import com.thoughworks.katas.railways.Town;
import com.thoughworks.katas.utils.GraphBuilder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RailwayGuideTest {

    @Test
    public void givenAB5AsInput_whenAskedForDistanceAB_ReturnDistanceOf5() {
        String[] input = {"AB5"};
        Graph graph = GraphBuilder.buildGraphFrom(input);
        RailwayGuide guide = new RailwayGuide(graph);
        int distance = guide.getDistanceOfRoute(new Town[]{new Town("A"), new Town("B")});

        assertEquals(5, distance);
    }

    @Test
    public void givenTwoTracks_whenAskedForWholeRoute_ReturnsSumOfDistances() {
        String[] input = {"AB5", "BC4"};
        Graph graph = GraphBuilder.buildGraphFrom(input);
        RailwayGuide guide = new RailwayGuide(graph);
        int distance = guide.getDistanceOfRoute(new Town[]{new Town("A"), new Town("B"), new Town("C")});

        assertEquals(9, distance);
    }

    @Test
    public void givenAllTracksOfARouteExistInArbitraryOrder_whenAskedForRouteAEBCD_ReturnsSumOfDistancesForWholeRoute() {
        String[] input = {"BC4", "CD8", "EB3", "AE7"};
        Graph graph = GraphBuilder.buildGraphFrom(input);
        RailwayGuide guide = new RailwayGuide(graph);
        int distance = guide.getDistanceOfRoute(new Town[]{new Town("A"),
                new Town("E"),
                new Town("B"),
                new Town("C"),
                new Town("D")});

        assertEquals(22, distance);
    }

    @Test(expected=EmptyInputException.class)
    public void givenEmptyStringAsInput_whenAskedForDistanceAB_ReturnEmptyInputErrorMessage() {
        String[] input = {""};
        GraphBuilder.buildGraphFrom(input);
    }

    @Test
    public void givenRouteDoesNotExist_whenAskedForRoute_ReturnsNoSuchRoute() {
        String[] input = {"BC4", "CD8"};
        Graph graph = GraphBuilder.buildGraphFrom(input);
        RailwayGuide guide = new RailwayGuide(graph);

        try {
            guide.getDistanceOfRoute(new Town[]{new Town("A"), new Town("G")});
        } catch (RuntimeException expected) {
            assertEquals("No such route", expected.getMessage());
        }
    }
}