package com.iesam.ryanair.features.employee.domain;

public class SaveEmployeeUseCase {

    private EmployeeRepository employeeRepository;

    public SaveEmployeeUseCase(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void execute(Employee employee){
        this.employeeRepository.save(employee);
    }

}
