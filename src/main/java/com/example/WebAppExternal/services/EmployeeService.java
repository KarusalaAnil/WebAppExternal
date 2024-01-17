package com.example.WebAppExternal.services;

import com.example.WebAppExternal.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.WebAppExternal.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
       /* Optional<Employee> optional = employeeRepository.save(employee);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }*/

        return employeeRepository.save(employee);
    }
}
