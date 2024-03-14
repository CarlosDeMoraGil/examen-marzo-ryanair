package com.iesam.ryanair.features.planes.domain;

public interface PlaneRepository {

    void save(Plane plane);
    Plane get(String id);
     boolean check(Plane plane);


    }
