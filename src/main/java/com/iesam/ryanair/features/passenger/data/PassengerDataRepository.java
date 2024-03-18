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

    @Override
    public Passenger get(String id) {
        for(int i = 0; i < listPassenger.size(); i++){
            if(listPassenger.get(i).getDni().equals(id)){
                return listPassenger.get(i);
            }
        }
        return null ;
    }


    public static PassengerDataRepository newInstance(){
        if(instance == null){
            instance = new PassengerDataRepository();
        }
        return instance;
    }

}
