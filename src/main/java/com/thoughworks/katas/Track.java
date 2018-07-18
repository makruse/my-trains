package com.thoughworks.katas;

public class Track {
    Town from;
    Town to;
    int distance;

    public Track(String track) {
        //it does not seem ideal to hard code the index, would fail if string track is not correct, where would i do validation
        //and how to make it more generic without hardcoding index?
        this.from = new Town(track.substring(0, 1));
        this.to = new Town(track.substring(1, 2));
        this.distance = Integer.valueOf(track.substring(2, 3));
    }

    public String getFromAsString() {
        return from.getName();
    }

    public String getToAsString() {
        return to.getName();
    }

    public int getDistance() {
        return distance;
    }
}
