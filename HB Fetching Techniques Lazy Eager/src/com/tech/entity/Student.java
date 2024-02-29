package com.tech.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
//	 @OneToMany(fetch = FetchType.LAZY)// only fire paricular field which is used //or
    @OneToMany(fetch = FetchType.EAGER)//. fire query if not used particuar techer field 
	private List<Teacher> teacher;

}
