package com.example.WebAppExternal.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empCode;
    private String employeeName;
    private double salary;



}

