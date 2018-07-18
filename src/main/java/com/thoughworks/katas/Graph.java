package com.thoughworks.katas;

import java.util.ArrayList;

public class Graph {

    public ArrayList<Track> tracks;

    public Graph() {
        this.tracks = new ArrayList<Track>();
    }

    public void addTrack(String track) {
        tracks.add(new Track(track));
    }
}

