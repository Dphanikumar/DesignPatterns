package com.phani.runnables;

import com.phani.entity.Employee;

public class EmployeeThread implements Runnable {

	@Override
	public void run() {

		Employee employee = Employee.getInstance();

		System.out.println(employee.hashCode() + "  ---> " + Thread.currentThread().getName());

	}

}
