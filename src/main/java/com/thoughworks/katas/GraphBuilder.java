package com.thoughworks.katas;

public class GraphBuilder {
    // is the introduction of a graphBuilder class ok or over-engineered at this point?
    public static Graph buildGraphFrom(String[] input) {
        Graph graph = new Graph();
        for (String each : input) {
            graph.addTrack(each);
        }
        return graph;

    }
}
