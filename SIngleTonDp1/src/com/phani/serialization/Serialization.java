package com.phani.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	// serialization is a process of converitng the object into bytes
	public static void serialize(Object object) {
		try {
			// it is used to create a file
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.ser"));
			// writing the object into the file
			outputStream.writeObject(object);
			// commiting the file
			outputStream.flush();
			System.out.println("Serialization Done");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// deserilazation is opposite to serialization
	public static void deserialize() {
		try {
			// gettoing the file
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.ser"));
			Object readObject = objectInputStream.readObject();
			System.out.println("Deserialzation done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// serialize(new Student());
		deserialize();
	}
}

class Student implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int a;
int b;

}
