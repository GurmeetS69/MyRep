package com.company.controller;


import com.company.dao.DepartmentRepository;
import com.company.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository deptRepository;

    @GetMapping("/getAddress")
    public List<Department> getEmployees(){
        return deptRepository.findAll();
    }
}
