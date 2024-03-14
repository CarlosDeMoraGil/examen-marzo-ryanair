package com.iesam.ryanair.features.planes.domain;

public class Plane {

    public final String id;
    public final String name;
    public final String model;
    public final String seats;

    public Plane(String id, String name, String model, String seats) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.seats = seats;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getSeats() {
        return seats;
    }
}
