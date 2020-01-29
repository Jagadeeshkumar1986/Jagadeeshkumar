package org.test;

import java.util.*;

public class Company {
public static void main(String[] args) {
	List <Employee> l = new ArrayList<>();
	Employee e1=new Employee();
	e1.setId(10);
	e1.setName("Jaga");
	e1.setPhno(9094030074l);
	Employee e2=new Employee();
	e2.setId(20);
	e2.setName("kumar");
	e2.setPhno(9094030084l);
	l.add(e1);
	l.add(e2);
	for (int i=0; i<l.size(); i++){
	System.out.println(l.get(i).getId());
	System.out.println(l.get(i).getName());
	System.out.println(l.get(i).getPhno());

	
}
}
}
