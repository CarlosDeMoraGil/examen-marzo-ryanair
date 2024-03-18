package com.iesam.ryanair.features.passenger.domain;

public interface PassengerRepository {

    void save(Passenger passenger);
    Passenger get(String id);


}
