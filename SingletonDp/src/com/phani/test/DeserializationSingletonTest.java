package com.phani.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.phani.sdp.Printer;

public class DeserializationSingletonTest {

	public static void serialize(Object obj) {

		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("E:/stud.ser"));
			oos.writeObject(obj);
			oos.flush();

			System.out.println("Object Serialized");

		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static Object Deserialize() {
		ObjectInputStream ois = null;
		Object obj = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("E:/stud.ser"));
			obj = ois.readObject();
			System.out.println("Desrialization is Done");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (ois != null)
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

		return obj;
	}

	public static void main(String[] args) {

		// get SingletonObject
		Printer p1 = null;
		Printer p2 = null;

		p1 = Printer.getInstance();
		// perform Serialzation
		serialize(p1);

		// Desrialing
		p2 = (Printer) Deserialize();

		System.out.println(p1.hashCode() + " " + p2.hashCode());

	}

}
