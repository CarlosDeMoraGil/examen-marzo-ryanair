package com.iesam.ryanair.features.planes.domain;


public class SavePlaneUseCase {
    
    private PlaneRepository planeRepository;

    public SavePlaneUseCase(PlaneRepository PlaneRepository) {
        this.planeRepository = PlaneRepository;
    }
    
    public void execute(Plane plane){
        this.planeRepository.save(plane);
    }
    
}
