package com.phani.proxy;

import com.phani.component.BankService;
import com.phani.component.BankServiceImpl;

public class BankServiceProxy implements BankService {

	private BankService realService = null;

	public BankServiceProxy() {
		System.out.println("BankServiceProxy.BankServiceProxy()");
		realService = new BankServiceImpl();// real object

	}

	@Override
	public String withdraw(long accNo, float amount) {
		String msg = null;
		if (amount > 0) {
			if (amount < 4000)
				msg = realService.withdraw(accNo, amount);
			else
				msg = realService.withdraw(accNo, 4000) + " only 4000 is allowed to with draw during demonitization";

		} else
			msg = "please enter the valid amount";

		return msg;
	}

	@Override
	public String deposit(long accNo, float amount) {
		String msg = null;
		if (amount > 0) {
			if (amount < 10000)
				msg = realService.withdraw(accNo, amount);
			else
				msg = realService.withdraw(accNo, 10000) + " only 10000  is allowed to  deposit during demonitization";

		} else
			msg = "please enter the valid amount";

		return msg;
	}

}
