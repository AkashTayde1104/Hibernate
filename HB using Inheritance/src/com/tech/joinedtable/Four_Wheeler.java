package com.tech.joinedtable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Car_types")
public class Four_Wheeler extends Vehical {
	
	private String Staring_Type_FourWheeler;

}
