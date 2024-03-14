package com.iesam.ryanair.features.employee.domain;

public class Employee {
    
    public final String id;
    public final String name;
    public final String surname;
    public final String charge;

    public Employee(String id, String name, String surname, String charge) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.charge = charge;
    }

    public String getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCharge() {
        return charge;
    }


    public String getId() {
        return id;
    }
}
