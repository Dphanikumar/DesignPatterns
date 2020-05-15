package com.phani.test;

import com.phani.entity.Student;

public class CloningSingleTonTest {
	public static void main(String[] args) {

		Student s1 = Student.getInstance();

		try {
			Student s2 = (Student) s1.clone();

			System.out.println(s1.hashCode() + " " + s2.hashCode());

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
