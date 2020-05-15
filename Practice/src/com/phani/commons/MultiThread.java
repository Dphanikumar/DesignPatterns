package com.phani.commons;

import com.phani.entity.Student;

public class MultiThread implements Runnable {

	@Override
	public void run() {
		Student s2 = null;
		s2 = Student.getInstance();

		System.out.println(s2.hashCode() + " " + Thread.currentThread().getName());

	}

}
