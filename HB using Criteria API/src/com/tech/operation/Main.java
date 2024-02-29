package com.tech.operation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.tech.entity.Student;
import com.tech.util.HibernateUtil;



public class Main {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
				
//		Student s=new Student();
//		s.setSid(101);
//		s.setSname("Rahul");
//		s.setAddress("Pune");
//		
//		Student s1=new Student();
//		s1.setSid(102);
//		s1.setSname("Ram");
//		s1.setAddress("Pune");
//		
//		session.save(s);//
//		session.save(s1);
//	    session.beginTransaction().commit();
		
		Criteria c=session.createCriteria(Student.class);
		//get data between id
//		c.add(Restrictions.between("sid", 104, 105));
		
		
//		 c.add(Restrictions.gt("sid", 102));
		
//		c.add(Restrictions.eq("sname", "Vijay"));
		
//		 c.add(Restrictions.like("address", "pune%"));//problem in like and ilike
		
		List<Student> list = c.list();
		
		for(Student l:list)
		{
			System.out.println(l);
		}
		
	session.close();
	sf.close();
			
		}

	}
		
//		
//		
		
