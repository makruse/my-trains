package com.thoughworks.katas;

import com.thoughworks.katas.railways.Graph;
import com.thoughworks.katas.utils.GraphBuilder;
import com.thoughworks.katas.utils.InputParser;

public class RailwayRunner {

    public static void main(String[] args) {

        InputParser parser = new InputParser();
        String[] inputGraph = parser.readGraphInputFile("inputGraph.txt");
        String[] inputRoutes = parser.readRouteInputFile("inputRoutes.txt");
        Graph graph = GraphBuilder.buildGraphFrom(inputGraph);
        RailwayGuide guide = new RailwayGuide(graph);

        guide.run(inputRoutes);
    }
}
