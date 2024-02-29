package com.tech.entity;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

//this class field added inside entity class field
@Embeddable
public class Certificate {
	
	private String courseName;
	private String duration;

}
