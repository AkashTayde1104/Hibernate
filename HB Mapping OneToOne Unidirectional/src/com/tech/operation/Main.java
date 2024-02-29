package com.tech.operation;

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
//		
//		Teacher t1=new Teacher();
//		t1.setTid("t_02");
//		t1.setTname("Nikam");
//		
//		Student s=new Student();
//		s.setId(101);
//		s.setName("Ram");
//		s.setAddress("Pune");
//		s.setTeacher(t);//student have teacher association
//		
//		
//		Student s1=new Student();
//		s1.setId(102);
//		s1.setName("Ramesh");
//		s1.setAddress("Mumbai");
//	    s1.setTeacher(t1);
//		
//	    t.setStudent(s);//techer have student association 
//	    t1.setStudent(s1);
//		
//		
//		session.save(s);
//		session.save(s1);
//		session.save(t);
//		session.save(t1);
//		//don't need to save c becoz it is not entity object
//		
//		session.beginTransaction().commit();
	
		
		//using student get teacher data also
//		Student stu = session.get(Student.class,101);
//		System.out.println(stu.getId());
//		System.out.println(stu.getName());
//		System.out.println(stu.getAddress());
//		System.out.println(stu.getTeacher().getTid());
//		System.out.println(stu.getTeacher().getTname());
		
//		List<Student> stuList= session.createQuery("from Student").list();
//		for(Student list:stuList)
//		{
//			System.out.println(list.getId());
//			System.out.println(list.getName());
//			System.out.println(list.getAddress());
//			System.out.println(list.getTeacher().getTid());
//			System.out.println(list.getTeacher().getTname());
//			System.out.println();
//		}
		
		
		//using teacher get student data also
		
//		Teacher tech = session.get(Teacher.class, "t_01");//get only teacher data
//		System.out.println(tech.getTid());
//		System.out.println(tech.getTname());
//		System.out.println(tech.getStudent().getId());
//		System.out.println(tech.getStudent().getName());
//		System.out.println(tech.getStudent().getAddress());
		
		List<Teacher> techList = session.createQuery("from Teacher").list();
		for(Teacher Tlist:techList)
		{
			
			System.out.println(Tlist.getTid());
			System.out.println(Tlist.getTname());
			System.out.println(Tlist.getStudent().getId());
			System.out.println(Tlist.getStudent().getName());
			System.out.println(Tlist.getStudent().getAddress());
			System.out.println();
			
		}
		


	
		session.close();
		sf.close();
	}

}
