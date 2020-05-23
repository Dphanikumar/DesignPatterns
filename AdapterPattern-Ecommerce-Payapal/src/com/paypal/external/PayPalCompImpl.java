package com.paypal.external;

import java.util.Random;

public class PayPalCompImpl implements PayPalComponent {

	private static PayPalCompImpl INSTANCE;

	private PayPalCompImpl() {
		System.out.println("PayPalCompImpl.PayPalCompImpl()");

	}

	public static PayPalCompImpl getInstance() {

		if (INSTANCE == null)
			INSTANCE = new PayPalCompImpl();

		return INSTANCE;
	}

	@Override
	public String approvePayment(Long cardNo, float amount, long bankCode) {

		return "Amount " + amount + " is approved for payment for " + cardNo + " from bank " + bankCode + " with TXId"
				+ new Random().nextInt(30000000);
	}

}
