package com.iesam.ryanair.features.passenger.presentation;

import com.iesam.ryanair.features.passenger.data.PassengerDataRepository;
import com.iesam.ryanair.features.passenger.domain.GetPassengerUseCase;
import com.iesam.ryanair.features.passenger.domain.Passenger;
import com.iesam.ryanair.features.passenger.domain.SavePassengerUseCase;

import java.awt.*;

public class MainPassenger {

    public static void save(Passenger passenger){
        SavePassengerUseCase savePassengerUseCase = new SavePassengerUseCase(PassengerDataRepository.newInstance());
        savePassengerUseCase.execute(passenger);
    }
    public static Passenger get(String id){
        GetPassengerUseCase getPassengerUseCase = new GetPassengerUseCase(PassengerDataRepository.newInstance());
        Passenger p1 = getPassengerUseCase.execute(id);
        return p1;
    }
    
    
}
