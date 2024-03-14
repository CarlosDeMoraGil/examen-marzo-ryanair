package com.iesam.ryanair;

import com.iesam.ryanair.features.employee.domain.Employee;
import com.iesam.ryanair.features.employee.presentation.MainEmployee;
import com.iesam.ryanair.features.flight.domain.Flight;
import com.iesam.ryanair.features.flight.presentation.MainFlight;
import com.iesam.ryanair.features.passenger.domain.Passenger;
import com.iesam.ryanair.features.passenger.presentation.MainPassenger;
import com.iesam.ryanair.features.planes.domain.Plane;
import com.iesam.ryanair.features.planes.presentation.MainPlane;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //EMPLEADOS
        MainEmployee.save(new Employee("70001","Empleado1","Empleado1Apelleidos1","Piloto"));
        MainEmployee.save(new Employee("70002","Empleado2","Empleado2Apelleidos2","Piloto"));
        MainEmployee.save(new Employee("70003","Empleado3","Empleado3Apelleidos3","Piloto"));

        //PASAJEROS
        MainPassenger.save(new Passenger("800001","Pasajero1","Pasajero1Apelledios1","Avila","Avila"));
        MainPassenger.save(new Passenger("800002","Pasajero2","Pasajero2Apelledios2","Avila","Avila"));

        //AVIONES
        MainPlane.save(new Plane("100001","Pajarito","Boing701","200"));
        MainPlane.save(new Plane("100002","Nube","Boing705","250"));
        MainPlane.save(new Plane("100003","Rayo","Boing710","100"));

        //VUELOS
        Plane p1 = MainPlane.get("100001");

        Employee e1 = MainEmployee.get("700001");
        Employee e2 = MainEmployee.get("700003");

        //MainFlight.save(new Flight("1",MainPlane.get("100001"),));

    }
}