package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main_Employee {
	public static void main(String[] args) {
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		MetadataSources ms=new MetadataSources(registry);
	    Metadata md = ms.getMetadataBuilder().build();
	    SessionFactory sf = md.getSessionFactoryBuilder().build();
	    Session session = sf.openSession();
	    
	    Employee e=new Employee();	   
	    e.setEname("Yogesh");
	    e.setEaddress("SambhajiNagar");
	    e.setMobNo(76838289);
	    e.setEsalary(22000);
	    
	    Employee e1=new Employee();	   
	    e1.setEname("Ravi");
	    e1.setEaddress("pune");
	    e1.setMobNo(76838289);
	    e1.setEsalary(25000);
	    
	    Employee e2=new Employee();	   
	    e2.setEname("Amol");
	    e2.setEaddress("Mumbai");
	    e2.setMobNo(76838289);
	    e2.setEsalary(20000);
	    
	    Employee e3=new Employee();	   
	    e3.setEname("Suraj");
	    e3.setEaddress("Delhi");
	    e3.setMobNo(76838289);
	    e3.setEsalary(30000);
	    
	    Employee e4=new Employee();	   
	    e4.setEname("Shubham");
	    e4.setEaddress("SambhajiNagar");
	    e4.setMobNo(76838289);
	    e4.setEsalary(21000);
	    
	    session.save(e);
	    session.save(e1);
	    session.save(e2);
	    session.save(e3);
	    session.save(e4);
	    session.beginTransaction().commit();
	    session.close();
	    sf.close();
	    System.out.println("save");
	}

}
