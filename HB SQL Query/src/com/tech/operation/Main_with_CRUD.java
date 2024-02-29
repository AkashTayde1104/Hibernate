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
	
	// sql use table name in query
	//get data using sql query
//	String sql="select * from student";
//	Query qq=session.createSQLQuery(sql);
//	List<Object[]> stu = qq.getResultList();
//	
//	for(Object[] stu1:stu)
//	{
//		System.out.println(stu1[0]+" "+stu1[1]);
//	}
	
	
	
	//delete data
//	Transaction t=session.beginTransaction();
//	
//	String sql1="delete from student where id=:x";
//	Query q1=session.createSQLQuery(sql1);
//	
//	q1.setParameter("x", 101);
//	
//	q1.executeUpdate();
//	
//	t.commit();
//	
	
	Transaction t=session.beginTransaction();
    String sql2="update student set address=:x , name=:n where id=:i";

    Query qqq=session.createSQLQuery(sql2);

    qqq.setParameter("x", "Nagpur");
    qqq.setParameter("n", "Akash");
    qqq.setParameter("i", 102);

    qqq.executeUpdate();

    t.commit();

	session.close();
	sf.close();
	}
}
