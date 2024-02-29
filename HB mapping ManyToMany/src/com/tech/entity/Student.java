package com.tech.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	
	// many student have many teachers so take in list bcoz more than one teacher is present
	@ManyToMany(mappedBy = "student")//remove extraa created table student_teacher using mappedby propery  
	private List<Teacher> teacher;

}
