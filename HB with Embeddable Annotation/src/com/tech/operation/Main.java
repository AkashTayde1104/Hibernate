package com.tech.operation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.entity.Certificate;
import com.tech.entity.Student;
import com.tech.util.HibernateUtil;


public class Main {
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Certificate c=new Certificate();
		c.setCourseName("Java");
		c.setDuration("6 Months");
		

		Certificate c1=new Certificate();
		c1.setCourseName("Python");
		c1.setDuration("6 Months");
		

		Certificate c2=new Certificate();
		c2.setCourseName("JavaScript");
		c2.setDuration("6 Months");
		
		Student s=new Student();
		s.setId(101);
		s.setName("Ram");
		s.setAddress("Pune");
		s.setCertificate(c);
		
		
		Student s1=new Student();
		s1.setId(102);
		s1.setName("Ramesh");
		s1.setAddress("Mumbai");
		s1.setCertificate(c1);
		
		
		Student s2=new Student();
		s2.setId(103);
		s2.setName("Amol");
		s2.setAddress("Delhi");
		s2.setCertificate(c2);
		
		session.save(s);
		session.save(s1);
		session.save(s2);
		//don't need to save c becoz it is not entity object
		
		session.beginTransaction().commit();
	
		
	
		


	
		session.close();
		sf.close();
	}

}
