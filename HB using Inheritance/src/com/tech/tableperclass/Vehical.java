package com.tech.tableperclass;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Data

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="Vehical_Types_")

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

//@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Vehical {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehical_Id;
	private String vehical_Name;

}
