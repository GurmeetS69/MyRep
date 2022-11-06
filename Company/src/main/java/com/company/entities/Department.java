package com.company.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dept_id")
    private Long deptId;
    @Column
    private String dept_name;
	public Long getdeptId() {
		return deptId;
	}
	public void setdeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getdept_name() {
		return dept_name;
	}
	public void setdept_name(String dept_name) {
		this.dept_name = dept_name;
	}

    

    
}
