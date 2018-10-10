package com.luoExpress.Assignment_07;

import java.util.ArrayList;

public class Q7 {
	public static void main(String[] args) {
		Employee e1= new Employee();
		Employee e2= new Employee();
		Employee e3= new Employee();
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(e1);
		arrayList.add(e2);
		arrayList.add(e3);
		for (Employee element : arrayList) {
			System.out.println(element);
		
	}
}
}

