package org.vanrar.spring.mvc_hibernate_aop.dao;

import org.vanrar.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployees(int id);
}
