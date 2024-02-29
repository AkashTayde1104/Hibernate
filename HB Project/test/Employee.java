package com.tech.test;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private int eId;
	private String eName;
	private String designation;
	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	private List<Project> project;
	

}
