package org.test;

import java.util.*;
import java.util.Map.Entry;

public class CompanyMap {
	public static void main(String[] args) {
	Map<Integer, Employee> m = new HashMap<>();
	Employee e1=new Employee();
	e1.setId(10);
	e1.setName("Jaga");
	e1.setPhno(9094030074l);
	Employee e2=new Employee();
	e2.setId(20);
	e2.setName("kumar");
	e2.setPhno(9094030084l);
	m.put(100, e1);
	m.put(200, e2);
	Set<Entry<Integer, Employee>> en=m.entrySet();
	for (Entry <Integer, Employee>a:en){
		System.out.println(a.getKey()+"employee information");
		System.out.println(a.getValue().getId());
		System.out.println(a.getValue().getName());
		System.out.println(a.getValue().getPhno());
	
	}
	}

}
