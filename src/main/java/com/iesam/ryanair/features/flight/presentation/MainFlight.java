package com.iesam.ryanair.features.flight.presentation;

import com.iesam.ryanair.features.flight.data.FlightDataRepository;
import com.iesam.ryanair.features.flight.domain.Flight;
import com.iesam.ryanair.features.flight.domain.GetFlightUseCase;
import com.iesam.ryanair.features.flight.domain.SaveFlightUseCase;

public class MainFlight {

    public static void save(Flight flight){
        SaveFlightUseCase saveFlightUseCase = new SaveFlightUseCase(FlightDataRepository.newInstance());
        saveFlightUseCase.execute(flight);
    }
    public static void print(String id){
        GetFlightUseCase getFlightUseCase = new GetFlightUseCase(FlightDataRepository.newInstance());
        Flight f1 = getFlightUseCase.execute(id);
        System.out.println(f1.toString());
    }

}
