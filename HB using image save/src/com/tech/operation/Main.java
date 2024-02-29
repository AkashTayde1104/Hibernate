package com.tech.operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tech.entity.Student;
import com.tech.util.HibernateUtil;

public class Main {
	public static void main(String[] args) throws IOException {
		
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session = sf.openSession();
	
	Student s=new Student();
	s.setId(101);
	s.setName("Ram");
	s.setAddress("Pune");
	
	FileInputStream f=new FileInputStream("src/clg pic.JPG");
	byte[] data=new byte[f.available()];
	
	f.read(data);

	s.setImage(data);
	
	session.save(s);
	
	session.beginTransaction().commit();

	session.close();
	sf.close();
	}
}
