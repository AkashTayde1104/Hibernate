package com.tech.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.boot.CacheRegionDefinition.CacheRegionType;


import lombok.Data;


@Data
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Entity

public class Student {
	

	@Id
//EhCacheRegionFactory
	private int sid;
	private String sname;
	private String address;
	


}
