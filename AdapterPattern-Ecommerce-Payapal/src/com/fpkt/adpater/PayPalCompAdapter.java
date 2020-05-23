package com.fpkt.adpater;

import com.paypal.external.PayPalCompImpl;
import com.paypal.external.PayPalComponent;

//Adapter to get the bank name to bank code
public class PayPalCompAdapter {

	public String payPayment(long cardNo, String bankName, float amount) {
		long bankCode = 0;
		PayPalComponent externalComponent = null;
		String txMsg = null;
		// converting bank name to bank code(if need take support of DB or properties
		// file)

		if (bankName.equalsIgnoreCase("SBI")) {
			bankCode = 1001;
		} else if (bankName.equalsIgnoreCase("HDFC")) {
			bankCode = 1002;
		} else if (bankName.equalsIgnoreCase("Canara")) {
			bankCode = 1003;
		} else if (bankName.equalsIgnoreCase("PNB")) {
			bankCode = 1004;
		} else
			throw new IllegalArgumentException("Invalid bank name");

		// interact with external Service Component
		externalComponent = PayPalCompImpl.getInstance();
		txMsg = externalComponent.approvePayment(cardNo, amount, bankCode);
		return txMsg;

	}

}