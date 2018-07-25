package com.thoughworks.katas.utils;

import com.thoughworks.katas.railways.Graph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphBuilderTest {

    @Test
    public void givenNoInput_returnsEmptyGraphWithoutTracks() {
        String[] input = {};
        Graph graph = GraphBuilder.buildGraphFrom(input);
        //how to better assert? here i had to made tracks field public
       assertEquals(true, graph.tracks.isEmpty());
    }

    @Test
    public void givenInputOfTwoTracksAsStrings_returnsGraphWithTwoTracks() {
        String[] input = {"AB5", "BC4"};

        Graph graph = GraphBuilder.buildGraphFrom(input);
        //how to better assert? here i had to made tracks field public
        assertEquals(2, graph.tracks.size());
    }

}