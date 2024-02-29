package com.tech.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.entity.Student;
import com.tech.util.HibernateUtil;

public class Main_with_CRUD {
	public static void main(String[] args) {
		
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session = sf.openSession();
	
//	Student s=new Student();
//	s.setId(101);
//	s.setName("Ram");
//	s.setAddress("Pune");
//	
//	Student s1=new Student();
//	s1.setId(102);
//	s1.setName("Ramesh");
//	s1.setAddress("Mumbai");
////	
//	Student s2=new Student();
//	s2.setId(103);
//	s2.setName("Amol");
//	s2.setAddress("Delhi");
	
	
	
//	//Insert or create data in db
//	session.save(s);
//	session.save(s1);
//	session.save(s2);
//	
//	session.beginTransaction().commit();
	
	
//	//Delete data from db
//	Student stu = session.get(Student.class, 101);
//	session.delete(stu);
//	session.beginTransaction().commit();//used when any type of changes like insert/delete/update make in db table
	
	
     //update data in db table
	 Student stu1 = session.get(Student.class, 102);
	 stu1.setAddress("Nashik");
	 stu1.setName("Akash");
	 session.beginTransaction().commit();
		
	session.close();
	sf.close();
	}
}
