package com.company.dao;

import com.company.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 @Query("FROM Employee where dept_id=?1")
 List <Employee> findByName(Long dept_Id);
}
