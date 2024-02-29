package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
	public static void main(String[] args) {
		
	
	StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
	MetadataSources ms=new MetadataSources(registry);
	Metadata md = ms.getMetadataBuilder().build();
	
	SessionFactory sf = md.getSessionFactoryBuilder().build();
	Session session = sf.openSession();
	
	Student s=new Student();
	s.setSid(102);
	s.setSname("Ram");
	s.setAddress("Pune");
	s.setMobNo("2457898979");
	
	session.save(s);
	session.beginTransaction().commit();
	session.close();
	sf.close();
	
	System.out.println("Save");

}
}