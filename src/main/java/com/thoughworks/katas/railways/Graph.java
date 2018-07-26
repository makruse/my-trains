package com.thoughworks.katas.railways;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Graph {
    //should track type be used? S. 115
    //should be private but i didnt know how to assert the graphbuilder test then
    public List<Track> tracks;

    public Graph() {
        this.tracks = new ArrayList<>();
    }

    public void addTrack(Town from, Town to, int distance) {
        tracks.add(new Track(from, to, distance));
    }

    public int calculateSumOfDistances(Town[] route) {
        int sumOfDistances = 0;
        for (int i = 0; i < route.length - 1; i++) {
                    sumOfDistances += getDistanceOfTrack(route[i], route[i + 1]);
            }
        return sumOfDistances;
    }

    private int getDistanceOfTrack(Town from, Town to) {
//Is the java 8 syntax preferable to for-loop and if yes, why? performance?
//        Track track;
//        for (int i = 0; i < tracks.size(); i++) {
//            track = tracks.get(i);
//            if (track.isTrackGoing(from, to)) {
//                return track.getDistance();
//            }
//        }

        Optional<Track> track = tracks.stream()
                .filter(t -> t.isTrackGoing(from, to))
                .findFirst();
        if(track.isPresent()){
            return track.get().getDistance();
        }
        throw new NoSuchElementException("No such route");

    }

    public List<Track> getTracks() {
        return tracks;
    }
}


