package com.phani.singleton;

public class MultiThreadSingleton implements Runnable {

	@Override
	public void run() {

		SingletonExample example = null;

		example = SingletonExample.getIntance();
		System.out.println(example.hashCode() + "-->" + Thread.currentThread().getName());

	}

}
