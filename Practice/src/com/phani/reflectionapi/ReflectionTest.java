package com.phani.reflectionapi;

import java.lang.reflect.Constructor;

import com.phani.entity.Student;

public class ReflectionTest {

	public static void main(String[] args) {
		try {
			// loading the class
			Class c = Class.forName("com.phani.reflectionapi.Student");
			// get constructors of the loaded class
			Constructor cons[] = c.getDeclaredConstructors();
			// get Access to private Constructor
			cons[0].setAccessible(true);// breaking encapsulation
//			create the object using reflection api.
			try {
				Student st = (Student) cons[0].newInstance(cons);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
