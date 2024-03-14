package com.iesam.ryanair.features.passenger.data;

import com.iesam.ryanair.features.employee.data.EmployeeDataRepository;
import com.iesam.ryanair.features.passenger.domain.Passenger;
import com.iesam.ryanair.features.passenger.domain.PassengerRepository;

import java.util.ArrayList;

public class PassengerDataRepository implements PassengerRepository {

    private static PassengerDataRepository instance = null;

    private ArrayList<Passenger> listPassenger = new ArrayList<>();

    @Override
    public void save(Passenger passenger) {
        listPassenger.add(passenger);
    }

    public static PassengerDataRepository newInstance(){
        if(instance == null){
            instance = new PassengerDataRepository();
        }
        return instance;
    }

}
