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

    public void run(String[] inputRoutes) {
        Town[] towns;

        int counter = 1;
        for (String route : inputRoutes) {
            towns = getTownsOf(route);
            try {
                System.out.println("Output #" + counter + ": " + getDistanceOfRoute(towns));
            } catch (NoSuchElementException e) {
                System.out.println("Output #" + counter + ": No such route");
            }
            counter++;
        }
    }

   private Town[] getTownsOf(String route) {
        Town towns[];
        towns = new Town[route.length()];
        for (int i = 0; i < route.length(); i++) {
            towns[i] = new Town(Character.toString(route.charAt(i)));
        }
        return towns;
    }
}
