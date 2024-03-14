package com.iesam.ryanair.features.fligth.domain;

public class Flight {

    public final String id;
    public final Plane plane;
    public final Employee employee;
    public final Passenger passenger;
    public final String date;
    public final String prize;
    public final String origin;
    public final String destiny;

    public Flight(String id, Plane plane, Employee employee, Passenger passenger, String date, String prize, String origin, String destiny) {
        this.id = id;
        this.plane = plane;
        this.employee = employee;
        this.passenger = passenger;
        this.date = date;
        this.prize = prize;
        this.origin = origin;
        this.destiny = destiny;
    }

    public String getId() {
        return id;
    }

    public Plane getPlane() {
        return plane;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getDate() {
        return date;
    }

    public String getPrize() {
        return prize;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestiny() {
        return destiny;
    }
}
