package com.company.controller;

import com.company.entities.Employee;
import com.company.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.management.AttributeNotFoundException;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository empRepository;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData) {
        empRepository.saveAll(empData);
        return ResponseEntity.ok("Employees added successfully");
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        return empRepository.findAll();
    }
    @GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) throws AttributeNotFoundException {
		
		Employee employee = empRepository.findById(id)
				.orElseThrow(() -> new AttributeNotFoundException("Not found" + id));
		
		return ResponseEntity.ok(employee);
	}
    @GetMapping("/employeesbydept/{id}")
      public List<Employee> getEmployeess(@PathVariable long id){
      return empRepository.findByName(id);
}
}
