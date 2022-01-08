package org.vanrar.spring.mvc_hibernate_aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vanrar.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import org.vanrar.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

//Service - отмечает что здесь будет бизнес логика
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
