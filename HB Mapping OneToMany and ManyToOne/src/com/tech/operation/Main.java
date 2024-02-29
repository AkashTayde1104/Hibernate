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
//		List<Teacher> tList=new ArrayList<Teacher>();
//		tList.add(t);
//		tList.add(t1);
//		
//		s.setTeacher(tList);
//		
//		t.setStudent(s);
//		t1.setStudent(s);
//		
//		session.save(s);
//		session.save(t);
//		session.save(t1);
//		//don't need to save c becoz it is not entity object
//		
//		session.beginTransaction().commit();
	
		
//		//using student get teacher data also
//		Student stu = session.get(Student.class,101);
//		System.out.println(stu.getId());
//		System.out.println(stu.getName());
//		System.out.println(stu.getAddress());
		
		
//		List<Teacher> tech = stu.getTeacher();
//		//using java 1.8
//		tech.stream().forEach(c->
//		                       {System.out.println();
//		                    	System.out.println(c.getTid());
//			                    System.out.println(c.getTname());
//		                       });
		
//		or
		//before 1.8
//		for(Teacher tt:tech)//or
//		for(Teacher tt:stu.getTeacher())
//		{
//			System.out.println(tt.getTid());
//			System.out.println(tt.getTname());
//		}
		
		
		//using single teacher get student data
//		Teacher tech1 = session.get(Teacher.class, "t_01");//get only teacher data
//		System.out.println(tech1.getTid());
//		System.out.println(tech1.getTname());
//		System.out.println(tech1.getStudent().getId());
//		System.out.println(tech1.getStudent().getName());
//		System.out.println(tech1.getStudent().getAddress());
//		

		//get multiple teacher data with student data
		List<Teacher> list2 = session.createQuery("from Teacher").list();
		//using java 1.8
//		list2.stream().forEach(c->
//		                        {System.out.println(c.getTid());
//		                          System.out.println(c.getTname());
//		                          System.out.println(c.getStudent().getId());
//		                          System.out.println(c.getStudent().getName());
//		                          System.out.println(c.getStudent().getAddress());
//		                          System.out.println();
//		                        });

		//or
		//before 1.8
		for(Teacher tt:list2)
		{
			System.out.println(tt.getTid());
			System.out.println(tt.getTname());
			System.out.println(tt.getStudent().getId());
			System.out.println(tt.getStudent().getName());
			System.out.println(tt.getStudent().getAddress());
		}
	
		session.close();
		sf.close();
	}

}
