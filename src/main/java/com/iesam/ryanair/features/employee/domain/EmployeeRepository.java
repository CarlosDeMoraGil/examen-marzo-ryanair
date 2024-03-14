package com.iesam.ryanair.features.employee.domain;

public interface EmployeeRepository {

    void save(Employee employee);
    Employee get(String id);

}
