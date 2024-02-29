package com.tech.test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Project {
	@Id
	private String pId;
	private String pName;
	private String duration;
	@ManyToOne
	private Employee employee;

}
