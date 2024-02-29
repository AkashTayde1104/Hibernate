package com.crudAssignment;

import java.util.List;
import java.util.Scanner;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Crud_Methods {
	int a;
	int id;
	String name;
	String address;
	double salary;
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	
	Scanner sc=new Scanner(System.in);
	
	public void createData()
	
	{
		while(true)
		{
		System.out.println("Want add data Y/N");
		a=sc.next().charAt(0);
		if(a=='Y')
		{
		System.out.println("Enter Eid");
		id=sc.nextInt();
		
		System.out.println("Enter Ename");
		name=sc.next();
		
		System.out.println("Enter Eaddress");
		address=sc.next();
		
		System.out.println("Enter Esalary");
		salary=sc.nextDouble();
		
		Transaction t=session.beginTransaction();
		Employee_Data e=new Employee_Data();
		e.setEid(id);
		e.setEname(name);
		e.setEaddress(address);
		e.setEsalary(salary);
		
		session.save(e);
		t.commit();
		
		
		System.out.println("Data add successfully");
		}
		else if(a=='N')
		{
			break;
		}
		else {
			System.out.println("Invalid Choice");
		}
		}
	}
	
	public void updateData()
	{
	
		while(true)
		{
	
			System.out.println("Wants to update data press Y/N");
			a=sc.next().charAt(0);
			if(a=='Y')
			{
				
				System.out.println("Enter address");
				address=sc.next();
				
				System.out.println("Enter id");
				id=sc.nextInt();
			
//				Query hql = session.createQuery("update Employee_Data set eaddress=? where eid=?");
//					hql.setParameter("a", address);
//					hql.setParameter("e", id);
//					hql.executeUpdate();
				Employee_Data emp = session.get(Employee_Data.class, id);
				emp.setEaddress(address);
					
					session.save(emp);
					session.beginTransaction().commit();
					System.out.println("Data update successesfully");
			}
			else if(a=='N')
			{
				break;
			}
			else
			{
				System.out.println("Invalid choice");
			}
			
		}
					
		
	}
	
	public void getData()
	{
		while(true)
		{
		System.out.println("Wants to get Single id data or All data press below choice");
		System.out.println("1. Get Single Data \n2. Get All data \n3. Exit" );
		a=sc.nextInt();
		if(a==1)
		{
		System.out.println("Enter id");
		id=sc.nextInt();
		Employee_Data emp = session.get(Employee_Data.class, id);
		System.out.println(emp);
		
		}
		else if(a==2)
		{
			List<Employee_Data> list = session.createQuery("from Employee_Data").list();
			for(Employee_Data data:list)
			{
				System.out.println(data.getEid());
				System.out.println(data.getEname());
				System.out.println(data.getEaddress());
				System.out.println(data.getEsalary());
				System.out.println("****************");
			}
			
			
		}
		else if(a==3)
		{
			break;
		}
		else
		{
		     System.out.println("Invalid Choice");
		}
		}
	}
	
	public void deleteData()
	{
		while(true)
		{
		System.out.println("You want to delete data press Y/N");
		a=sc.next().charAt(0);
		if(a=='Y')
		{
		System.out.println("Enter id");
		id=sc.nextInt();
		
		Employee_Data emps = session.get(Employee_Data.class, id);
		session.delete(emps);
		session.beginTransaction().commit();
		
		}
		else if(a=='N')
		{
			break;
		}
		else {
			System.out.println("Invalid Choice");
		}
	}		
	}
	
	public void closeOperation()
	{
		session.close();
		sf.close();
	}

}
