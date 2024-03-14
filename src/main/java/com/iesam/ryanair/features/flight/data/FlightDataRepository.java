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

    @Override
    public Flight print(String id) {
        for(int i = 0; i < listFlight.size(); i++){
            if(listFlight.get(i).getId().equals(id)){
                return listFlight.get(i);
            }
        }
        return null ;    }

    public static FlightDataRepository newInstance(){
        if(instance == null){
            instance = new FlightDataRepository();
        }
        return instance;
    }
}
