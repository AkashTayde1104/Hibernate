package com.tech.operation;

import java.util.ArrayList;
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
		
//		Teacher t=new Teacher();
//		t.setTid("t_01");
//		t.setTname("Jadhav");
//		
//		Teacher t1=new Teacher();
//		t1.setTid("t_02");
//		t1.setTname("Nikam");
//		
//		Student s=new Student();
//		s.setId(101);
//		s.setName("Ram");
//		s.setAddress("Pune");
//		
//		
//		List<Teacher> tList=new ArrayList<Teacher>();
//		tList.add(t);
//		tList.add(t1);
//		
//		s.setTeacher(tList);
//		t.setStudent(s);
//		t1.setStudent(s);
//	
//		
//		
//		session.save(s);
//
//		session.save(t);
//		session.save(t1);
//		
//		
//		session.beginTransaction().commit();
//	
	Student stu = session.get(Student.class, 101);
	System.out.println(stu.getId());
//	System.out.println(stu.getTeacher().size());
	
		session.close();
		sf.close();
	}

}
