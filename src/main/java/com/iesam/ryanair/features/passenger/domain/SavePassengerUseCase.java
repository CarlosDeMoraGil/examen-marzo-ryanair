package com.iesam.ryanair.features.passenger.domain;

public class SavePassengerUseCase {
    
    private PassengerRepository passengerRepository;

    public SavePassengerUseCase(PassengerRepository PassengerRepository) {
        this.passengerRepository = PassengerRepository;
    }
    
    public void execute(Passenger Passenger){
        this.passengerRepository.save(Passenger);
    }
    
}
