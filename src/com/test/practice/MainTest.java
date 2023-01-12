package com.test.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1, "Rakesh", 30, new Address("street1", 123456));
		Employee emp2=new Employee(2,"Soham",45, new Address("street2", 789456));
		Employee emp3=new Employee(3, "Sonali", 10, new Address("street3", 159753));
		Employee emp4=new Employee(4,"Pranali",75, new Address("street4", 357852));
		
		List<Employee> emp=new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		System.out.println("Un-Sorted employee List >> "+emp);
		
		Collections.sort(emp, new AgeComparator());
		for (Iterator iterator = emp.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println("Sorted List"+employee);
			
		}

	}

}
