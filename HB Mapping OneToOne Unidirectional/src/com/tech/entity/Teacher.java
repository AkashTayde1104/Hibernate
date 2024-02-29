package com.tech.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter


//unidirection
@Entity
public class Teacher {
	@Id
	private String tid;
	private String tname;
	
	@OneToOne
	private Student student;
	
	

}
