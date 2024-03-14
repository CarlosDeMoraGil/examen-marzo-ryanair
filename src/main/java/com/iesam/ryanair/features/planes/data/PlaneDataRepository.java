package com.iesam.ryanair.features.planes.data;

import com.iesam.ryanair.features.flight.data.FlightDataRepository;
import com.iesam.ryanair.features.planes.domain.Plane;
import com.iesam.ryanair.features.planes.domain.PlaneRepository;

import java.util.ArrayList;

public class PlaneDataRepository implements PlaneRepository {

    private static PlaneDataRepository instance = null;

    private ArrayList<Plane> listPlane = new ArrayList<>();

    @Override
    public void save(Plane plane) {
        listPlane.add(plane);
    }

    public Plane get(String id) {
        for(int i = 0; i < listPlane.size(); i++){
            if(listPlane.get(i).getId().equals(id)){
                return listPlane.get(i);
            }
        }
        return null ;
    }

    @Override
    public boolean check(Plane plane) {
        for (int i = 0; i < FlightDataRepository.listFlight.size(); i++ ){
            if(FlightDataRepository.listFlight.get(i).getPlane().equals(plane)){
                return true;
            }
        }
        return  false;

    }

    public static PlaneDataRepository newInstance(){
        if(instance == null){
            instance = new PlaneDataRepository();
        }
        return instance;
    }


}
