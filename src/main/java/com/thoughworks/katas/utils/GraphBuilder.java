package com.thoughworks.katas.utils;

import com.thoughworks.katas.EmptyInputException;
import com.thoughworks.katas.railways.Graph;
import com.thoughworks.katas.railways.Town;

public class GraphBuilder {

    public static Graph buildGraphFrom(String[] input) {

        if(inputIsEmpty(input)) {
            throw new EmptyInputException();
        }

        Graph graph = new Graph();
        for (String each : input) {
            Town from = new Town(each.substring(0,1));
            Town to = new Town(each.substring(1,2));
            int distance = Integer.valueOf(each.substring(2,3));
            graph.addTrack(from, to, distance);
        }
        return graph;
    }

    private static boolean inputIsEmpty(String[] input) {
        return input.length == 1 && input[0].equals("");
    }
}
