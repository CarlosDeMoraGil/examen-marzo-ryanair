package com.iesam.ryanair.features.planes.domain.data;

import com.iesam.ryanair.features.planes.domain.CheckPlaneDisponibilityUseCase;
import com.iesam.ryanair.features.planes.domain.Plane;
import com.iesam.ryanair.features.planes.domain.PlaneRepository;

public class Stub1CheckPlaneDisponibilityUseCaseTest implements PlaneRepository {


    @Override
    public void save(Plane plane) {

    }

    @Override
    public Plane get(String id) {
        return null;
    }

    @Override
    public boolean check(Plane plane) {
        Plane plane1 = new Plane("100001","Pajarito","Boing701","200");
        return true;
    }
}
