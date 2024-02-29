package com.tech.entity;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter



@Entity
public class Teacher {
	@Id
	private String tid;
	private String tname;
	
	//Many teachers have one student
	@ManyToOne
	private Student student;
	
	

}
