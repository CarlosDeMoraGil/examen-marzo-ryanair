package com.iesam.ryanair.features.planes.presentation;

import com.iesam.ryanair.features.planes.data.PlaneDataRepository;
import com.iesam.ryanair.features.planes.domain.CheckPlaneDisponibilityUseCase;
import com.iesam.ryanair.features.planes.domain.GetPlaneUseCase;
import com.iesam.ryanair.features.planes.domain.Plane;
import com.iesam.ryanair.features.planes.domain.SavePlaneUseCase;

public class MainPlane {

    public static void save(Plane plane){
        SavePlaneUseCase savePlaneUseCase = new SavePlaneUseCase(PlaneDataRepository.newInstance());
        savePlaneUseCase.execute(plane);
    }
    public static Plane get(String id){
        GetPlaneUseCase getPlaneUseCase = new GetPlaneUseCase(PlaneDataRepository.newInstance());
        Plane p1 = getPlaneUseCase.execute(id);
        return p1;
    }
    public static boolean check(Plane plane){
        CheckPlaneDisponibilityUseCase checkPlaneDisponibilityUseCase = new CheckPlaneDisponibilityUseCase(PlaneDataRepository.newInstance());
        boolean tF = checkPlaneDisponibilityUseCase.execute(plane);
        return tF;
    }
    
}
