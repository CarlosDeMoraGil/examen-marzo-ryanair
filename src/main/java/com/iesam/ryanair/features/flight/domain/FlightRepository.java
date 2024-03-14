package com.iesam.ryanair.features.flight.domain;

public interface FlightRepository {

    void save(Flight flight);
    Flight print(String id);


    }
