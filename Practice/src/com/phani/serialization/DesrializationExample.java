package com.phani.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//for Deserialization
public class DesrializationExample {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stud.ser"));
			Student s1 = (Student) ois.readObject();

		} catch (Exception e) {
		}

	}
}
