
package com.phani.factory;

import java.lang.reflect.Proxy;

import com.phani.component.BankService;
import com.phani.component.BankServiceImpl;
import com.phani.helper.BankServiceProxyHelper;

public class BankServiceFactory {

	public static BankService getInstance(boolean isDemonitized) {

		BankService service = null;
		if (isDemonitized) {
			/*
			 * 1st arg:target classes classLoader
			 * 2nd arg: a class aray of main interface
			 * 3rd arg: this is the helper proxy class which implements invocationhelper(I)
			 */
			service = (BankService) Proxy.newProxyInstance(BankServiceImpl.class.getClassLoader(),
					new Class[] { BankService.class }, new BankServiceProxyHelper());}
		else
			service = new BankServiceImpl();
		return service;
	}

}
