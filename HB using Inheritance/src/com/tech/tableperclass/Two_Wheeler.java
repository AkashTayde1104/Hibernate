package com.tech.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name= "Bike_types")
public class Two_Wheeler extends Vehical {
	private String Staring_Type_Two_Wheeler;

}
