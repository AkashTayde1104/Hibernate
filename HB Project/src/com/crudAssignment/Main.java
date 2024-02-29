package com.crudAssignment;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		while(true)
		{		
		Crud_Methods m=new Crud_Methods();
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter your choice \n1. Add Data \n2. Update Data \n3. Get Data \n4. Delete Data");
			System.out.println("press 0 to close connection");
			int c=sc.nextInt();
			 switch(c)
			 {
			 case 1: m.createData();
			 break;
			 
			 case 2: m.updateData();
		     break;
				 
			 case 3: m.getData();
			 break;
			 
			 case 4: m.deleteData();
			 break;
			 
			 case 0:m.closeOperation();
			 break;
			 
			default:
				break;
			 }		
		}
	}
}
