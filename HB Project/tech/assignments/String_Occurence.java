package com.tech.assignments;

import java.util.HashMap;
import java.util.Map;

public class String_Occurence {
	public static void main(String[] args) {
		
		String s="aaabbcddddee";
		
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		
		char[] array = s.toCharArray();
		
		for(char c:array)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		 
		}
		System.out.println(m);
	}
}
