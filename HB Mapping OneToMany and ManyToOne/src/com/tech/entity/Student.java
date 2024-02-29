package com.tech.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


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
	
	//student have many teachers so take in list bcoz more than one teacher is present
	@OneToMany(mappedBy = "student")//remove extraa created table student_teacher using mappedby propery  
	private List<Teacher> teacher;

}
