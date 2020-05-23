package com.phani.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.phani.singleton.SingleTonclass;

public class SerializationDesrializationTest {

	// for serialization
	public static void serialize(Object object) throws FileNotFoundException, IOException {
		// for saving the object data into a file in byte format
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Singleton.ser"));
		// to write the content into the file
		objectOutputStream.writeObject(object);
		// flushing the data
		objectOutputStream.flush();
		System.out.println("Serialzarion done");

	}

	// for desrialization

	public static Object deseralize() throws FileNotFoundException, IOException, ClassNotFoundException {
		// for retreing the file
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Singleton.ser"));
		// for reading the object from the file
		System.out.println("desrialization done");

		return objectInputStream.readObject();

	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// object creation by using factory method
		SingleTonclass singleTonclass = SingleTonclass.getInstance();
//serilaization of the singleton class
		// serialize(singleTonclass);
		// getting the object from the deserialization

		SingleTonclass deseralize = (SingleTonclass) deseralize();

		System.out.println(singleTonclass.hashCode() + " " + deseralize.hashCode());

	}

}
