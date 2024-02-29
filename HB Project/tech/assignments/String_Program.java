package com.tech.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class String_Program {
	public static void main(String[] args) {
		String s = "Rahul,Sachin,Ram,Pawan,Sachin,Ramesh";
		
//		Integer i= 101, 102, 103, 104, 105, 106;
	Map<String, Integer> m=new HashMap<String, Integer>();
	
	String[] s1 = s.split(",");
	
	for(String key:s1)
	{
        if(m.containsKey(key))
        {
        	m.put(key, m.get(key)+1);
        }
        else
        {
        	m.put(key, 1);
        }
     
	
	}
	System.out.println(m); 
	
	}

		
		
		
//		List<String> l=new ArrayList<String>();
//		
//		for(String ss:s.split(", "))
//		{
//			l.add(ss);
//		}
//		System.out.println(l);
////		Iterator<String> iterator = l.iterator();
////		while(iterator.hasNext())
////		{
////			String next = iterator.next();
////			System.out.println(next);
////		}
//		
//		Map m=new HashMap<>();
//		m.put(101, l.get(0));
//		m.put(102, l.get(1));
//		m.put(103,l.get(3));
//		m.put(104,l.get(4));
//		m.put(105,l.get(5));
//		
//		System.out.println(m);
//		
//		Set key = m.keySet();
//		
//		for(Object keys:key)
//		{
//			System.out.println(keys);
//			String val = (String) m.get(keys);
//			if(val.equals(m.))
//			{
//				System.out.println(val);
//				
//			}
//
//		}
		
		
//		m.get(key)
		
	

}
