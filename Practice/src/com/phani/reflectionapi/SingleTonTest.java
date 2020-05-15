package com.phani.reflectionapi;

import com.phani.entity.Student;

public class SingleTonTest {

	public static void main(String[] args) {
		Student s1 = null;
		Student s2 = null;

		s1 = Student.getInstance();
		s2 = Student.getInstance();
		System.out.println(s1.hashCode() + "  " + s2.hashCode());

	}

}
