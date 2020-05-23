package com.fpkt.service;

import com.fpkt.adpater.PayPalCompAdapter;

public class FlipkartPaymentMgmtServiceImpl implements FlipkartPaymentMgmtService {

	@Override
	public String doPayment(long cardNo, String bankName, float amount) {
		PayPalCompAdapter adapter = null;
		String txMsg = null;
		// get Adapter class Object
		adapter = new PayPalCompAdapter();
		// use adapter

		txMsg = adapter.payPayment(cardNo, bankName, amount);

		return txMsg;
	}

}
