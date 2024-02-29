package com.tech.tableperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Vehical v=new Vehical();
		v.setVehical_Name("Vehical_type");
		
		Two_Wheeler t=new Two_Wheeler();
		t.setVehical_Name("Bike");
		t.setStaring_Type_Two_Wheeler("Handle");
		
		Four_Wheeler f=new Four_Wheeler();
		f.setVehical_Name("City Honda");
		f.setStaring_Type_FourWheeler("Wheel");
		
		session.save(v);
		session.save(t);
		session.save(f);
		
		session.beginTransaction().commit();
		
		session.close();
		sf.close();
		
	}

}
