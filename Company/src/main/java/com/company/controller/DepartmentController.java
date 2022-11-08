package com.company.controller;


import com.company.dao.DepartmentRepository;
import com.company.entities.Department;
import com.company.entities.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository deptRepository;

    @GetMapping("/getDepartments")
    public List<Department> getEmployees(){
        return deptRepository.findAll();
    }
    @PostMapping("/saveDepartments")
    public ResponseEntity<String> saveDepartments(@RequestBody List<Department> deptData) {
        deptRepository.saveAll(deptData);
        return ResponseEntity.ok("Data saved");
    }
}
