package com.thoughworks.katas;

import com.thoughworks.katas.railways.Graph;
import com.thoughworks.katas.railways.Town;
import com.thoughworks.katas.utils.GraphBuilder;
import com.thoughworks.katas.utils.InputParser;

import java.util.NoSuchElementException;

public class RailwayRunner {

    public static void main(String[] args) {

        InputParser parser = new InputParser();
        String[] inputGraph = parser.readGraphInputFile("inputGraph.txt");
        String[] inputRoutes = parser.readRouteInputFile("inputRoutes.txt");
        Graph graph = GraphBuilder.buildGraphFrom(inputGraph);
        RailwayGuide guide = new RailwayGuide(graph);
        Town[] towns;

        int counter = 1;
        for (String route : inputRoutes) {
            towns = parser.getTownsOf(route);
            try {
                System.out.println("Output #"+counter+": " + guide.getDistanceOfRoute(towns));
            } catch (NoSuchElementException e) {
                System.out.println("Output #"+counter+": No such route");
            }
            counter ++;
        }
    }
}
