package com.phani.helper;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

//helper class to create a proxy class dynamically
//to  make this as a helper class we have to implement this methodInterceptor interface

public class BankServiceProxyHelper implements MethodInterceptor {

	// target:
	// method::it is coming method
	@Override
	public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		String resultMsg = null;
		if (method.getName().equalsIgnoreCase("withdraw")) {
			if ((Float) args[1] <= 4000) {
				resultMsg = (String) proxy.invokeSuper(target, args); // if withdraw amount is less than 4000

			} else {
				args[1] = 4000;
				resultMsg = (String) proxy.invokeSuper(target, args) + " only 4000 allowed to withdraw"; // if withdraw amount is greater then restrict to 4000
																											

			}

		} // if
		else if (method.getName().equalsIgnoreCase("deposit")) {
			if ((Float) args[1] <= 200000) {
				resultMsg = (String) proxy.invokeSuper(target, args); // if withdraw amount is less than 200000

			} else {
				args[1] = 200000;
				resultMsg = (String) proxy.invokeSuper(target, args); // if withdraw amount is greater than 200000
																		// restrict to
																		// 200000

			}

		} else
			throw new IllegalArgumentException("invalid Operation");

		return resultMsg;

	}
}
