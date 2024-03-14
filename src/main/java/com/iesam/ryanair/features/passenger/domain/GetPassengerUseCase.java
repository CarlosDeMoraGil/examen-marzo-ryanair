package com.iesam.ryanair.features.passenger.domain;

public class GetPassengerUseCase {

    private PassengerRepository passengerRepository;

    public GetPassengerUseCase(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public Passenger execute(String id){
        return this.passengerRepository.get(id);
    }

}
