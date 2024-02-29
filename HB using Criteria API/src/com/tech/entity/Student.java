package com.tech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.boot.CacheRegionDefinition.CacheRegionType;

import lombok.Data;

@Data
@Entity

public class Student {
	@Id
	private int sid;
	private String sname;
	private String address;


}
