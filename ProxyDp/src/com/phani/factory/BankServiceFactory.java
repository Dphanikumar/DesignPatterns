
package com.phani.factory;

import com.phani.component.BankService;
import com.phani.component.BankServiceImpl;
import com.phani.proxy.BankServiceProxy;

public class BankServiceFactory {

	public static BankService getInstance(boolean isDemonitized) {

		BankService service = null;
		if (isDemonitized)
			service = new BankServiceProxy();

		else
			service = new BankServiceImpl();
		return service;
	}

}
