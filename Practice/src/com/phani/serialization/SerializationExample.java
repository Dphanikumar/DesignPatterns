package com.phani.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//for Serialization
public class SerializationExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		try {
			s1.assignData(101, "phani");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stud.ser"));

			oos.writeObject(s1);
			oos.flush();
			oos.close();
		} catch (Exception e) {
		}

	}

}
