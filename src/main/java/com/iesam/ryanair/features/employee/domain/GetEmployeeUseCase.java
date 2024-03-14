package com.iesam.ryanair.features.employee.domain;

public class GetEmployeeUseCase {

    private EmployeeRepository employeeRepository;

    public GetEmployeeUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee execute(String id){
        return this.employeeRepository.get(id);
    }

}
