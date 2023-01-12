package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Java 8 Streams | Group By List of Employees By City | Accenture Mock L1 Coding Interview
public class GroupingBy {
	
	public static void main(String[] args) {
		Employee e1=new Employee("Amar", "Pune");
		Employee e2=new Employee("Ankita", "Mumbai");
		Employee e3=new Employee("Rahul", "Pune");
		Employee e4=new Employee("Anaksha", "Mumbai");
		Employee e5=new Employee("Rohit", "Pune");
		
		List<Employee> employee=Arrays.asList(e1,e2,e3,e4,e5);
		Map<String, List<Employee>> groupedBy =employee.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println(groupedBy);
		
	}

}
