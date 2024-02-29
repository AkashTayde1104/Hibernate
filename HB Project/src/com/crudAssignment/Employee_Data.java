package com.crudAssignment;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee_Data {
	@Id
	private int eid;
	private String ename;
	private String eaddress;
	private double esalary;
	
}
