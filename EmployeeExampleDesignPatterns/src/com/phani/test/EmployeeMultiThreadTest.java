package com.phani.test;

import com.phani.runnables.EmployeeThread;

public class EmployeeMultiThreadTest {

	public static void main(String[] args) {
		EmployeeThread employeeThread = new EmployeeThread();

		Thread th1 = new Thread(employeeThread);
		Thread th2 = new Thread(employeeThread);

		th1.start();
		th2.start();

	}

}
