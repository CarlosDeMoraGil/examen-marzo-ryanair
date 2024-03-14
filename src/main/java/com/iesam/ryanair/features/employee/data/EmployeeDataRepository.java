package com.iesam.ryanair.features.employee.data;

import com.iesam.ryanair.features.employee.domain.Employee;
import com.iesam.ryanair.features.employee.domain.EmployeeRepository;

import java.util.ArrayList;

public class EmployeeDataRepository implements EmployeeRepository {

    private static EmployeeDataRepository instance = null;

    private ArrayList<Employee> listEmployee = new ArrayList<>();

    public EmployeeDataRepository() {

    }

    @Override
    public void save(Employee employee) {
        listEmployee.add(employee);
    }

    @Override
    public Employee get(String id) {
        for(int i = 0; i < listEmployee.size(); i++){
            if(listEmployee.get(i).getId().equals(id)){
                return listEmployee.get(i);
            }
        }
        return null ;
    }

    public static EmployeeDataRepository newInstance(){
        if(instance == null){
            instance = new EmployeeDataRepository();
        }
        return instance;
    }

}
