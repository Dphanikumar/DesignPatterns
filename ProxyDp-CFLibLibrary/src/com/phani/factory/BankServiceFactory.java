
package com.phani.factory;

import com.phani.component.BankService;
import com.phani.component.BankServiceImpl;
import com.phani.helper.BankServiceProxyHelper;

import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {

	public static BankService getInstance(boolean isDemonitized) {

		BankService service = null;
		if (isDemonitized)
			service = (BankService) Enhancer.create(BankServiceImpl.class, new BankServiceProxyHelper());
		else
			service = new BankServiceImpl();
		return service;
	}

}
