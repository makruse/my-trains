package com.thoughworks.katas.railways;

public class Track {
    private final Town from;
    private final Town to;
    private final int distance;

    public Track(Town from, Town to, int distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public boolean isTrackGoing(Town from, Town to) {
        return (this.from.equals(from) && this.to.equals(to));
    }

    public int getDistance() {
        return distance;
    }
}
