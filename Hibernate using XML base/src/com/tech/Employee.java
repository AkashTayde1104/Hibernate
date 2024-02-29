package com.tech;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Data
@Entity

@Table(name="Employee_Table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Emp_Id")
	private int Eid;
	
	@Column(name="Emp_Name")
	private String Ename;
	
	private String Eaddress;
	
	@Transient
	private long MobNo;
	
	private long Esalary;
	

}
