package org.vanrar.spring.mvc_hibernate_aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.vanrar.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import org.vanrar.spring.mvc_hibernate_aop.entity.Employee;
import org.vanrar.spring.mvc_hibernate_aop.service.EmployeeService;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "all-employees";
    }
}
