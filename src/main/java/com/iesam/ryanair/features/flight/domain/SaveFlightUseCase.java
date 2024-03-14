package com.iesam.ryanair.features.flight.domain;

public class SaveFlightUseCase {

    private FlightRepository flightRepository;

    public SaveFlightUseCase(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public void execute(Flight flight){
        this.flightRepository.save(flight);
    }

}
