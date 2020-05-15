package com.phani.singleton;

public class SingletonExample {

	private static SingletonExample INSTANCE;

	private SingletonExample() {
	}

	public static SingletonExample getIntance() {
		synchronized (SingletonExample.class) {
			if (INSTANCE == null)
				INSTANCE = new SingletonExample();
		}
		return INSTANCE;

	}

}
