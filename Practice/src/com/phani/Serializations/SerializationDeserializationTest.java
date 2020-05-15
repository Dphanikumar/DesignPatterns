package com.phani.Serializations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.phani.entity.Student;

public class SerializationDeserializationTest {

	public static void serialize(Object obj) {
		ObjectOutputStream objectOutputStream = null;
		try {
			// creating an o/p stream to write the file
			objectOutputStream = new ObjectOutputStream(new FileOutputStream("F:/Stud.ser"));
			objectOutputStream.writeObject(obj);
			objectOutputStream.flush();

			System.out.println("Serialization Done");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			if (objectOutputStream != null)
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

	public static Object deserialize(String path) {

		// creating an inputstream to read the values from the file
		ObjectInputStream oInputStream = null;
		Object readObject = null;
		try {
			oInputStream = new ObjectInputStream(new FileInputStream(path));
			readObject = oInputStream.readObject();

			System.out.println("Deserialization Done");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oInputStream != null)
				try {
					oInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return readObject;

	}

	public static void main(String[] args) {
		Student s1 = null;
		Student deserialize = null;
		s1 = Student.getInstance();
		serialize(s1);

		deserialize = (Student) deserialize("F:/Stud.ser");
		System.out.println(s1.hashCode() + " " + deserialize.hashCode());

	}

}
