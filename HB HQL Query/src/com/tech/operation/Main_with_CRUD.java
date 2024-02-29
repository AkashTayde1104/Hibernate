package com.tech.operation;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
//	
//	Student s2=new Student();
//	s2.setId(103);
//	s2.setName("Amol");
//	s2.setAddress("Delhi");
//	
//	
//	
//	//Insert or create data in db
//	session.save(s);
//	session.save(s1);
//	session.save(s2);
//	
//	session.beginTransaction().commit();
//	
	
	//hql use entity class name in query
//	//get data using hql query
//    //	String hql="from Student where address='delhi'";
//	
//    //String hql="from Student where name='Amol'";
//	
//    //String sql="from Student where name=:s";
//	
//	String hql="from Student s where s.name=:n and s.address=:a ";
//
//	Query query=session.createQuery(hql);
//	query.setParameter("n", "Amol");
//	query.setParameter("a", "Delhi");
//	
//	
//	List<Student> list = query.getResultList();
//	
//	list.stream().forEach(c->
//	{System.out.println(c.getId());
//	System.out.println(c.getName());
//	System.out.println(c.getAddress());
//	}
//	);
//	
	
	
	
//	//delete data
//	Transaction t=session.beginTransaction();
////	String hql1="delete from Student s where s.id=:x;
//	
//	String hql1="delete from Student where id=:x";
//	Query q1=session.createQuery(hql1);
//	
//	q1.setParameter("x", 101);
//	
//	int x = q1.executeUpdate();
//	System.out.println(x);
//	
//	t.commit();
	
	//update data
	Transaction t=session.beginTransaction();
    String hql2="update Student set address=:x , name=:n where id=:i";

    Query qqq=session.createQuery(hql2);

    qqq.setParameter("x", "Mumbai");
    qqq.setParameter("n", "Vijay");
    qqq.setParameter("i", 102);

    int x1 = qqq.executeUpdate();

    System.out.println(x1);
    
    t.commit();

	session.close();
	sf.close();
	}
}
