package com.tech.operation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tech.entity.Student;
import com.tech.entity.Teacher;
import com.tech.util.HibernateUtil;


public class Main {
	private static List list;

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
		
		Student s1=new Student();
		s1.setId(102);
		s1.setName("Ramesh");
		s1.setAddress("Nashik");
		
		List<Teacher> tList=new ArrayList<Teacher>();
		tList.add(t);
		tList.add(t1);
		
		s.setTeacher(tList);
		
		List<Student> StuList=new ArrayList<Student>();
		StuList.add(s);
		StuList.add(s1);
		
		t.setStudent(StuList);
		
		session.save(s);
		session.save(s1);
		session.save(t);
		session.save(t1);
		//don't need to save c becoz it is not entity object
		
		session.beginTransaction().commit();
	
		
//		//using student get teacher data also
//		Student stu = session.get(Student.class,101);
//		System.out.println(stu.getId());
//		System.out.println(stu.getName());
//		System.out.println(stu.getAddress());
		
//		
//		
//		List<Teacher> tech = stu.getTeacher();
//		//using java 1.8
//		tech.stream().forEach(c->
//		                       {System.out.println();
//		                    	System.out.println(c.getTid());
//			                    System.out.println(c.getTname());
//			                    System.out.println();
//		                       });
		
//		or
		//before 1.8
//		for(Teacher tt:tech)//or
//		for(Teacher tt:stu.getTeacher())
//		{
//			System.out.println(tt.getTid());
//			System.out.println(tt.getTname());
//		}
		
		
//		//using single teacher get student data
//		Teacher tech1 = session.get(Teacher.class, "t_01");//get only teacher data
//		System.out.println(tech1.getTid());
//		System.out.println(tech1.getTname());
		
//		for(Student slist:tech1.getStudent())
//		{
//			System.out.println(slist.getId());
//			System.out.println(slist.getName());
//			System.out.println(slist.getAddress());
//		}
//		//or

//		List<Student> stu = tech1.getStudent();
////		using java 1.8
//		stu.stream().forEach(c->
//		                        {System.out.println(c.getId());
//		                          System.out.println(c.getName());
//		                          System.out.println(c.getAddress());
//		                          System.out.println();
//		                        });
//
//		
//	
		session.close();
		sf.close();
	}

}
