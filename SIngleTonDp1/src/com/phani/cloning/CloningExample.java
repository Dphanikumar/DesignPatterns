package com.phani.cloning;

public class CloningExample {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s1 = new Student();
		Student s2 = (Student) s1.clone();

		System.out.println(s1.hashCode() + " " + s2.hashCode());

	}

}

class Student implements Cloneable {
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
