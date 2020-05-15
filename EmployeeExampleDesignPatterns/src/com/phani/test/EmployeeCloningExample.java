package com.phani.test;

import com.phani.entity.Employee;

public class EmployeeCloningExample {

	public static void main(String[] args) {

		Employee employee = Employee.getInstance();
		try {
			Employee emp1 = (Employee) employee.clone();
			System.out.println(emp1.hashCode() + "  " + employee.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
