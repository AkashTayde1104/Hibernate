package com.tech.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class Main {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Project p=new Project();
		p.setPId("p_01");
		p.setPName("Bank Project");
		p.setDuration("2 Month");
		
		Project p1=new Project();
		p1.setPId("p_02");
		p1.setPName("Calculator");
		p1.setDuration("1 Month");
		
		Project p2=new Project();
		p2.setPId("p_03");
		p2.setPName("Testing site");
		p2.setDuration("2 Month");
		
		Employee e1=new Employee();
		e1.setEId(101);
		e1.setEName("Rahul");
		e1.setDesignation("backend Developer");
		
		List<Project> pList=new ArrayList<Project>();
		pList.add(p);
		pList.add(p1);
		pList.add(p2);
		
		e1.setProject(pList);
		p.setEmployee(e1);
		p1.setEmployee(e1);
		p2.setEmployee(e1);
		
		session.save(e1);
//		session.save(p);
//		session.save(p1);
//		session.save(p2);
		
		session.beginTransaction().commit();
		session.close();
		sf.close();
		
		
		
		
	}

}
