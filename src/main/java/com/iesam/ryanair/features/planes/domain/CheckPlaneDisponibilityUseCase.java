package com.iesam.ryanair.features.planes.domain;

public class CheckPlaneDisponibilityUseCase {

    private PlaneRepository planeRepository;

    public CheckPlaneDisponibilityUseCase(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    public boolean execute(Plane plane){
        return this.planeRepository.check(plane);
    }

}
