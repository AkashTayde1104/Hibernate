package com.tech.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tech.entity.Student;

public class Main {
	public static void main(String[] args) {
		
	StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
	MetadataSources ms=new MetadataSources(registry);
	Metadata md = ms.getMetadataBuilder().build();
	SessionFactory sf = md.getSessionFactoryBuilder().build();
	Session session = sf.openSession();
	
	Student s=new Student();
//	s.setId(101);
	s.setName("Ram");
	s.setAddress("Pune");
	
	Student s1=new Student();
//	s1.setId(102);
	s1.setName("Ramesh");
	s1.setAddress("Mumbai");
//	
	Student s2=new Student();
//	s2.setId(103);
	s2.setName("Amol");
	s2.setAddress("Delhi");
	
	Student s3=new Student();
//	s3.setId(104);
	s3.setName("Vijay");
	s3.setAddress("Nagpur");
	
	session.save(s);
	session.save(s1);
	session.save(s2);
	session.save(s3);
	
	
	session.beginTransaction().commit();
	
	session.close();
	sf.close();
	
			
	
	
			
	}

}
