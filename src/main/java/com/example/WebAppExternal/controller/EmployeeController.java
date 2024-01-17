package com.example.WebAppExternal.controller;

import com.example.WebAppExternal.entity.UserInfo;
import com.example.WebAppExternal.modal.Employee;
import com.example.WebAppExternal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.example.WebAppExternal.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String getName(){
        return "This is Anil";
    }


    @GetMapping("/testing")
    public String hello(){
        return "This is Anil";
    }
    @PostMapping("/postTest")
    public String hi(){
        return "This is Anil_post";
    }
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
            System.out.println("-------------");
            System.out.println(employee);
        return employeeService.saveEmployee(employee);
    }


    @PostMapping("/saveUser")
    public UserInfo save(@RequestBody UserInfo userInfo) {
        String password = encoder.encode(userInfo.getPassword());
        System.out.println(password);
        userInfo.setPassword(password);
        return userRepository.save(userInfo);
    }



}
