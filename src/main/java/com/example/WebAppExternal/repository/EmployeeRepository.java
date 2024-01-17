package com.example.WebAppExternal.repository;

import com.example.WebAppExternal.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Integer> {
}
