package com.iesam.ryanair.features.flight.presentation;

import com.iesam.ryanair.features.flight.data.FlightDataRepository;
import com.iesam.ryanair.features.flight.domain.Flight;
import com.iesam.ryanair.features.flight.domain.SaveFlightUseCase;

public class MainFlight {

    public static void save(Flight flight){
        SaveFlightUseCase saveFlightUseCase = new SaveFlightUseCase(FlightDataRepository.newInstance());
        saveFlightUseCase.execute(flight);
    }

}
