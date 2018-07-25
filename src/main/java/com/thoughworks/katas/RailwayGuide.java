package com.thoughworks.katas;

import com.thoughworks.katas.railways.Graph;
import com.thoughworks.katas.railways.Town;

import java.util.NoSuchElementException;

public class RailwayGuide {

    private Graph graph;

    public RailwayGuide(Graph graph) {
        this.graph = graph;
    }

    public int getDistanceOfRoute(Town[] route) {
        try {
            return graph.calculateSumOfDistances(route);
        } catch (NoSuchElementException e) {
            //isnt that doing twice the same thing? can i just throw the exception at the point where it is checked inside graph?
            //or does it have to be clear here, that an excpetion could be thrown?
            throw new NoSuchElementException("No such route");
        }
    }
}
