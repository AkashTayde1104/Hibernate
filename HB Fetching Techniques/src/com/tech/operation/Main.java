package com.tech.operation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.entity.Student;
import com.tech.util.HibernateUtil;


public class Main {
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
//		Student s=new Student();
//		s.setId(101);
//		s.setName("Ram");
//		s.setAddress("Pune");
//		
//		Student s1=new Student();
//		s1.setId(102);
//		s1.setName("Ramesh");
//		s1.setAddress("Mumbai");
//	//	
//		Student s2=new Student();
//		s2.setId(103);
//		s2.setName("Amol");
//		s2.setAddress("Delhi");
//		
//		session.save(s);
//		session.save(s1);
//		session.save(s2);
//		
//		session.beginTransaction().commit();
//	
		
		
//fire query once if get same data twice with diff reference in same session
		Student stu2 = session.get(Student.class, 101);//it fire select query even if not use stu field/reference to get data
		System.out.println(stu2);// get data
		
		Student stu3 = session.get(Student.class, 101);//it fire select query even if not use stu field to get data
		System.out.println(stu3);// get data
		
//use get or load with known id
		Student stu = session.get(Student.class, 101);//it fire select query even if not use stu field to get data
		System.out.println(stu);// get data
		
//just load method doesnt fire query till not used field
		Student stuL = session.load(Student.class, 102);//it doesnt't fire query till not used stuL feild to get data
		System.out.println(stuL);//now it fire select query and get data
		
		
		
// fetch unique data
		Object list = session.createQuery("from Student where id=101 ").uniqueResult();//get one id data and fire query if not use field
		System.out.println(list);
		
		
		
//fetch multiple data
		List<Student> list2 = session.createQuery("from Student").list(); //or use getResultList()
		for(Student l:list2)
		{
			System.out.println(l);
		}
		
		

	
		session.close();
		sf.close();
	}

}
