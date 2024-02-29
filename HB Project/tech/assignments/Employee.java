package com.tech.assignments;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private int Eid;
	private String name;
	private double salary;
	

}
