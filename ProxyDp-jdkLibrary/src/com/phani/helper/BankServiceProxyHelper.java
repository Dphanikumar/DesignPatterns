package com.phani.helper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//helper class to create a proxy class dynamically
//to  make this as a helper class we have to implement this methodInterceptor interface

public class BankServiceProxyHelper implements InvocationHandler {

	// target:
	// method::it is coming method
	public Object invoke(Object target, Method method, Object[] args) throws Throwable {

		String resultMsg = null;
		if (method.getName().equalsIgnoreCase("withdraw")) {
			if ((Float) args[1] <= 4000) {
				resultMsg = (String) method.invoke(target, args); // if withdraw amount is less than 4000

			} else {
				args[1] = 4000;
				// if withdraw amounut is greater than 4000 restrict to 40000
				resultMsg = (String) method.invoke(target, args) + " only 4000 allowed to withdraw";

			}

		} // if
		else if (method.getName().equalsIgnoreCase("deposit")) {
			if ((Float) args[1] <= 200000) {
				resultMsg = (String) method.invoke(target, args); // if withdraw amount is less than 200000

			} else {
				args[1] = 200000;
				 // if withdraw amounut is greater than 200000 restrict to 200000
				resultMsg = (String) method.invoke(target, args) + " only 200000/- deposting only allowed"; // if
																											// withdraw
																											// amount is
																											// greater
																											// than
																											// 200000
				// restrict to
				// 200000

			}

		} else
			throw new IllegalArgumentException("invalid Operation");

		return resultMsg;

	}
}
