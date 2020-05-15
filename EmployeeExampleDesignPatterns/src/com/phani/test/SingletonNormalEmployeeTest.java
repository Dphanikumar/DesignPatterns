package com.phani.test;

import com.phani.entity.Employee;

public class SingletonNormalEmployeeTest {

	public static void main(String[] args) {

		Employee employee = Employee.getInstance();
		employee.setId(234l);
		employee.setName("Phanikumar");
		employee.setAddress("Hyderabad");
		employee.setPhoneNumber("9542110101");

		System.out.println(employee.hashCode());
		Employee employee1 = Employee.getInstance();
		employee1.setId(124l);
		employee1.setName("Phani");
		employee1.setAddress("Hyd");
		employee1.setPhoneNumber("8919497474");

		System.out.println("Employee(employee) :" + employee.getId());
		System.out.println("Employee(employee1) :" + employee1.getId());
		System.out.println(employee1.hashCode());

	}

}