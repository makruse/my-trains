package com.thoughworks.katas;

public class RailwayGuide {

    private final String track;

    public RailwayGuide(String track) {
        this.track = track;
    }

    public int getDistanceOf(String track) {
        String lastChar = this.track.substring(this.track.length() - 1);
        return Integer.valueOf(lastChar);
    }
}
