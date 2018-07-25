package com.thoughworks.katas;

import com.thoughworks.katas.railways.Graph;
import com.thoughworks.katas.railways.Town;
import com.thoughworks.katas.utils.GraphBuilder;
import com.thoughworks.katas.utils.InputParser;


public class RailwayRunner {

    public static void main(String[] args) {
        InputParser parser = new InputParser();
        String[] input = parser.readFile("input.txt");

        Graph graph = GraphBuilder.buildGraphFrom(input);
        RailwayGuide guide = new RailwayGuide(graph);

        Town[] route1 = {new Town ("A"), new Town ("B"),new Town ("C")};

        System.out.println("Output #1: " + guide.getDistanceOfRoute(route1));


    }
}
