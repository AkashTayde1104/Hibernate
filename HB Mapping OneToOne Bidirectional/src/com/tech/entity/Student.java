package com.tech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//import org.hibernate.dialect.MySQL55Dialect;

import lombok.Data;

@Data
@Entity


public class Student {
	@Id
	private int id;
//	MySQL55Dialect
	
	private String name;
	
	private String address;
	
	//student have teacher association but teacher doesn't have student association
	//only in one direction
	
	@OneToOne(mappedBy = "student")
	private Teacher teacher;

	
	//mappedBy="student" map student pk in teacher only as FK i.e. remove extra column which is in both table
    //we can get both table data using any of the entity class
}
