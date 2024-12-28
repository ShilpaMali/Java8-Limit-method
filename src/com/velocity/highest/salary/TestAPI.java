package com.velocity.highest.salary;

import java.util.ArrayList;
import java.util.Comparator;

public class TestAPI {
	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "vinit", 7000));
		al.add(new Employee(102, "akash", 8000));
		al.add(new Employee(103, "suresh", 7500));
		al.add(new Employee(104, "ashutosh", 9500));
		al.add(new Employee(105, "chetan", 9000));
		Comparator<Employee> c = (emp1, emp2) -> {
			if (emp1.getEmpSalary() == emp2.getEmpSalary()) {
				return 0;
			} else if (emp1.getEmpSalary() < emp2.getEmpSalary()) {
				return 1;
			} else {
				return -1;
			}
		};

		al.stream().sorted(c).limit(1).skip(0)
		.forEach(s -> System.out.println(s));

	}

}
