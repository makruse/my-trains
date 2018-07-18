package com.thoughworks.katas;

public class RailwayGuide {

    private Graph graph;

    public RailwayGuide(Graph graph) {
        this.graph = graph;
    }

    public int getDistanceOfRoute(String route){
        int sumOfDistances = 0;
        for (int i = 0; i < route.length()-1; i++){
            String from = String.valueOf(route.charAt(i));
            String to = String.valueOf(route.charAt(i+1));
            sumOfDistances += getDistanceOfTrack(from, to);
        }
           return sumOfDistances;
    }

    private int getDistanceOfTrack(String from, String to) {
        int distance = 0;
        Track track;
        //is graph.tracks.size() ok or many method calls chained?
        for(int i = 0; i < graph.tracks.size(); i++) {
            track = graph.tracks.get(i);
            String fromName = track.getFromAsString();
            String toName = track.getToAsString();
            if(fromName.equals(from) && toName.equals(to)) {
               distance = track.getDistance();
            }
        }
        return distance;
    }

//    public int getDistanceOfRoute(String route) {
//        int sumOfDistances = 0;
//        //why iterate over tracks.size?
//        // route.charAt(i+1) wouldnt it fail if route is shorter than track number
//        // and also not calculate correctly if route is longer than track.size?
//        for(int i = 0; i < tracks.size(); i++) {
//            //creation of 2 town objects ok for only getting the distance?
//            //also town b would be created twice
//            Town from =  new Town(route.charAt(i)); //creation of 2 town objects ok for only getting the distance?
//            Town to = new Town(route.charAt(i+1));
//            sumOfDistances += getDistanceOfTrack(from, to);
//        }
//        return sumOfDistances;
//    }
}
