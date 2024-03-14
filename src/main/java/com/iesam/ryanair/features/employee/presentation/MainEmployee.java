package com.iesam.ryanair.features.employee.presentation;

import com.iesam.ryanair.features.employee.data.EmployeeDataRepository;
import com.iesam.ryanair.features.employee.domain.Employee;
import com.iesam.ryanair.features.employee.domain.GetEmployeeUseCase;
import com.iesam.ryanair.features.employee.domain.SaveEmployeeUseCase;

public class MainEmployee {

    public static void save(Employee employee){
        SaveEmployeeUseCase saveEmployeeUseCase = new SaveEmployeeUseCase(EmployeeDataRepository.newInstance());
        saveEmployeeUseCase.execute(employee);

    }
    public static Employee get(String id){
        GetEmployeeUseCase getEmployeeUseCase = new GetEmployeeUseCase(EmployeeDataRepository.newInstance());
        Employee e1 = getEmployeeUseCase.execute(id);
        return e1;
    }

}
