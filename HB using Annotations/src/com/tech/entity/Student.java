package com.tech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//import org.hibernate.dialect.MySQL55Dialect;

import lombok.Data;

@Data
@Entity

//change table name
@Table(name="Student_Table")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// auto increment value by 1 using internal sequence it doesn't generate extra table hibernate sequence
	
//	@GeneratedValue(strategy = GenerationType.AUTO)//generate extra table hibernate_sequence
	
//	@GeneratedValue(strategy = GenerationType.TABLE)//create extra table hibernate_sequences with sequence name,next value
	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)//create extra table hibernate_sequence
	
	//change column name associated with table
	@Column(name="Student_id")
	private int id;
	
//	MySQL55Dialect
	
	private String name;
	
	//ignore to create field in db table
	@Transient
	private String address;
	

}

//for Table type value - fired query

//select tbl.next_val from hibernate_sequences tbl where tbl.sequence_name=? for update
//Hibernate: insert into hibernate_sequences (sequence_name, next_val)  values (?,?)
//Hibernate: update hibernate_sequences set next_val=?  where next_val=? and sequence_name=?
//Hibernate: select tbl.next_val from hibernate_sequences tbl where tbl.sequence_name=? for update
//Hibernate: update hibernate_sequences set next_val=?  where next_val=? and sequence_name=?
//Hibernate: select tbl.next_val from hibernate_sequences tbl where tbl.sequence_name=? for update
//Hibernate: update hibernate_sequences set next_val=?  where next_val=? and sequence_name=?
//Hibernate: select tbl.next_val from hibernate_sequences tbl where tbl.sequence_name=? for update
//Hibernate: update hibernate_sequences set next_val=?  where next_val=? and sequence_name=?
//Hibernate: insert into Student_Table (name, Student_id) values (?, ?)
//Hibernate: insert into Student_Table (name, Student_id) values (?, ?)
//Hibernate: insert into Student_Table (name, Student_id) values (?, ?)
//Hibernate: insert into Student_Table (name, Student_id) values (?, ?)
