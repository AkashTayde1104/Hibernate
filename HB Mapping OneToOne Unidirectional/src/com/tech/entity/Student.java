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
	@OneToOne//Unidirection just use in student
	private Teacher teacher;

}
