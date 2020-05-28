package com.phani.test;

import com.phani.component.BankService;
import com.phani.constants.RBIConstants;
import com.phani.factory.BankServiceFactory;

public class BankEmployee2 {
	public static void main(String[] args) {

		BankService service = null,service1 = null;
		service = BankServiceFactory.getInstance(RBIConstants.REGULAR_BANKING);
		System.out.println(service.deposit(10001, 20000));
		System.out.println(service.withdraw(10002, 5000));
		System.out.println("-----------------------");
		service1 = BankServiceFactory.getInstance(RBIConstants.REGULAR_BANKING);
		
		System.out.println(service1.deposit(10003, 20000));
		System.out.println(service1.withdraw(10004, 5000));
		System.out.println("-----------------------");
		
		

	}

}
