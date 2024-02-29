package com.tech.assignments;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main_Employee {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
//		Employee e=new Employee();
//		e.setEid(101);
//		e.setName("Ram");
//		e.setSalary(25000);
//		
//		Employee e1=new Employee();
//		e1.setEid(102);
//		e1.setName("Ramesh");
//		e1.setSalary(15000);
//		
//		Employee e2=new Employee();
//		e2.setEid(103);
//		e2.setName("Rekha");
//		e2.setSalary(9000);
//		
//		Employee e3=new Employee();
//		e3.setEid(104);
//		e3.setName("Amol");
//		e3.setSalary(20000);
//		
//		Employee e4=new Employee();
//		e4.setEid(105);
//		e4.setName("Vijay");
//		e4.setSalary(22000);
//		
//		session.save(e);
//		session.save(e1);
//		session.save(e2);
//		session.save(e3);
//		session.save(e4);
		
		List<Employee> list = session.createQuery("from Employee").list();
		
		//print employee data who's salary greater than 10000
		list.stream().filter(i->i.getSalary()>10000).forEach(c->System.out.println(c));
		
		
		session.beginTransaction().commit();
		
		session.close();
		sf.close();
		
	}

}
