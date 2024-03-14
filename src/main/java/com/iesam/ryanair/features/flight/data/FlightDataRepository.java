package com.iesam.ryanair.features.flight.data;


import com.iesam.ryanair.features.flight.domain.Flight;
import com.iesam.ryanair.features.flight.domain.FlightRepository;

import java.util.ArrayList;

public class FlightDataRepository implements FlightRepository {

    private static FlightDataRepository instance = null;

    public static ArrayList<Flight> listFlight = new ArrayList<>();

    @Override
    public void save(Flight flight) {
        listFlight.add(flight);
    }

    public static FlightDataRepository newInstance(){
        if(instance == null){
            instance = new FlightDataRepository();
        }
        return instance;
    }
}
