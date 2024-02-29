package com.tech.operation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.entity.Student;
import com.tech.entity.Teacher;
import com.tech.util.HibernateUtil;


public class Main {
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Teacher t=new Teacher();
		t.setTid("t_01");
		t.setTname("Jadhav");
		
		Teacher t1=new Teacher();
		t1.setTid("t_02");
		t1.setTname("Nikam");
		
		Student s=new Student();
		s.setId(101);
		s.setName("Ram");
		s.setAddress("Pune");
		s.setTeacher(t);
		
		
		Student s1=new Student();
		s1.setId(102);
		s1.setName("Ramesh");
		s1.setAddress("Mumbai");
	    s1.setTeacher(t1);
		
//		
//		Student s2=new Student();
//		s2.setId(103);
//		s2.setName("Amol");
//		s2.setAddress("Delhi");
//		
		session.save(s);
		session.save(s1);
		session.save(t);
		session.save(t1);
		//don't need to save c becoz it is not entity object
		
		session.beginTransaction().commit();
	
		


	
		session.close();
		sf.close();
	}

}
