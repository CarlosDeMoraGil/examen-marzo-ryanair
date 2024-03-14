package com.iesam.ryanair.features.passenger.presentation;

import com.iesam.ryanair.features.passenger.data.PassengerDataRepository;
import com.iesam.ryanair.features.passenger.domain.Passenger;
import com.iesam.ryanair.features.passenger.domain.SavePassengerUseCase;

public class MainPassenger {

    public static void save(Passenger passenger){
        SavePassengerUseCase savePassengerUseCase = new SavePassengerUseCase(PassengerDataRepository.newInstance());
        savePassengerUseCase.execute(passenger);
    }
    
    
}
