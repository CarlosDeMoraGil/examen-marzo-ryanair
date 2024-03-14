package com.iesam.ryanair.features.planes.domain;

public class GetPlaneUseCase {

    private PlaneRepository planeRepository;

    public GetPlaneUseCase(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    public Plane execute(String id){
        return this.planeRepository.get(id);
    }

}
