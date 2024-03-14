package com.iesam.ryanair.features.flight.domain;



public class GetFlightUseCase {

    private FlightRepository flightRepository;

    public GetFlightUseCase(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Flight execute(String id){
        return this.flightRepository.print(id);
    }

}
