package com.phani.component;

//concrete component  class
public class BankServiceImpl implements BankService {

	public BankServiceImpl() {
		System.out.println("BankServiceImpl.BankServiceImpl()");

	}

	@Override
	public String withdraw(long accNo, float amount) {
		System.out.println("BankServiceImpl.withdraw()");

		return "Withdrawing amount ::" + amount + " from the bank acccount::" + accNo;
	}

	@Override
	public String deposit(long accNo, float amount) {
		System.out.println("BankServiceImpl.deposit()");
		return "depositing money::" + amount + " to Bank acount::" + accNo + " ";
	}

}
