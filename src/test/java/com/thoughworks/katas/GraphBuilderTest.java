package com.thoughworks.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphBuilderTest {

    @Test
    public void givenNoInput_returnsEmptyGraphWithoutTracks() {
        String[] input = {};
        Graph graph = GraphBuilder.buildGraphFrom(input);
        //here i do not check for the graph to be empty but that a property of the graph is empty = ok?
        assertEquals(true, graph.tracks.isEmpty());
    }

    @Test
    public void givenInputOfTwoTracksAsStrings_returnGraphWithTwoTracks() {
        String[] input = {"AB5", "BC4"};
        Graph graph = GraphBuilder.buildGraphFrom(input);
        //here i do not check for the graph to be empty but that a property of the graph is empty = ok?
        assertEquals(2, graph.tracks.size());
    }

}