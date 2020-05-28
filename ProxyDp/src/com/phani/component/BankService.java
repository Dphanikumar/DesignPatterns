package com.phani.component;

//component interface
public interface BankService {

	String withdraw(long accNo, float amount);

	String deposit(long accNo, float amount);

}
