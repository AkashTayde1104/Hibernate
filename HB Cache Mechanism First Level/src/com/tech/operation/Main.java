package com.tech.operation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.entity.Student;
import com.tech.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
				
		Student s=new Student();
		s.setSid(101);
		s.setSname("Rahul");
		s.setAddress("Pune");
		
		Student s1=new Student();
		s1.setSid(102);
		s1.setSname("Ram");
		s1.setAddress("Pune");
		
		session.save(s);//
		session.save(s1);
	    session.beginTransaction().commit();
		
		//for stu and stu1 fire query once get data twice
		//bcoz session is same and obj always associate with session 
		// no matter even if reference is different
		Student stu = session.get(Student.class, 101);
		System.out.println(stu);
		
		Student stu1 = session.get(Student.class, 101);
		System.out.println(stu1);
		
		//fire query again for other data and get data
		Student stu2 = session.get(Student.class, 102);
		System.out.println(stu2);

	    session.close();
	    
	    
	    sf.close();
		}

	}
		
//		
//		
		
