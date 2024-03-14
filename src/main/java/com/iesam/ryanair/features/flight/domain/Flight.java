package com.iesam.ryanair.features.flight.domain;

import com.iesam.ryanair.features.employee.domain.Employee;
import com.iesam.ryanair.features.passenger.domain.Passenger;
import com.iesam.ryanair.features.planes.domain.Plane;

import java.util.ArrayList;

public class Flight {

    public final String id;
    public final Plane plane;
    public final ArrayList<Employee> employee;
    public final ArrayList<Passenger> passenger;
    public final String date;
    public final String prize;
    public final String origin;
    public final String destiny;

    public Flight(String id, Plane plane, ArrayList<Employee> employee, ArrayList<Passenger> passenger, String date, String prize, String origin, String destiny) {
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

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public ArrayList<Passenger> getPassenger() {
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
