package com.tech;

import javax.persistence.Entity;
import javax.persistence.Id;



import lombok.Setter;
@Entity
public class Student {
//MySQL55Dialect
@Id	
private int sid;
private String sname;
private String address;
private String MobNo;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobNo() {
	return MobNo;
}
public void setMobNo(String mobNo) {
	MobNo = mobNo;
}
 

}
