package com.tech.entity;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
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
	
	//Many teachers have many student
	@ManyToMany//if commenting join table then create teacher_student table
	
	@JoinTable(name="techstu",
	joinColumns = {@JoinColumn(name="t_id")},
	inverseJoinColumns = {@JoinColumn(name="s_id")})
	
	private List<Student> student;
	
	

}
