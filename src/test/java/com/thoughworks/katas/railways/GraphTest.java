package com.thoughworks.katas.railways;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class GraphTest {

    @Test
    public void shouldAddTrackToGraph() {
        Graph graph = new Graph();
        Town from = new Town("A");
        Town to = new Town("B");
        int distance = 5;

        graph.addTrack(from, to, distance);

        assertEquals(1, graph.getTracks().size());
        //Track expectedTrack = new Track(from, to, distance);
        //assertEquals(expectedTrack.getDistance(), graph.getTracks().get(0).getDistance());
    }

    @Test
    public void shouldCalculateTheDistanceOfAGivenRoute() {
        Town[] route = {new Town("A"), new Town("B"), new Town("C")};
        Graph graph = new Graph();
        graph.addTrack(new Town("A"), new Town("B"), 5);
        graph.addTrack(new Town("B"), new Town("C"), 4);

        assertEquals(9, graph.calculateSumOfDistances(route));
    }

    @Test
    public void shouldReturnNoSuchRouteIfRouteDoesNotExist() {
        Town[] route = {new Town("A"), new Town("B"), new Town("C")};
        Graph graph = new Graph();
        graph.addTrack(new Town("A"), new Town("B"), 5);

        try{
            graph.calculateSumOfDistances(route);
        } catch (NoSuchElementException expected){
            assertEquals("No such route", expected.getMessage());
        }
    }
}