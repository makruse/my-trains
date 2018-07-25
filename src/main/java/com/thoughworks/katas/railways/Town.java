package com.thoughworks.katas.railways;

import java.util.Objects;

public class Town {

    private final String name;

    public Town(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return Objects.equals(name, town.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
