package com.iesam.ryanair.features.passenger.domain;

public class Passenger {

    public final String dni;
    public final String name;
    public final String surname;
    public final String provinvce;
    public final String town;

    public Passenger(String dni, String name, String surname, String provinvce, String town) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.provinvce = provinvce;
        this.town = town;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getProvinvce() {
        return provinvce;
    }

    public String getTown() {
        return town;
    }
}
