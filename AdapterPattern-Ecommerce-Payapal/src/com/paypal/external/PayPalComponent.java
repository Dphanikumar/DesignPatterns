package com.paypal.external;

public interface PayPalComponent {

	public String approvePayment(Long cardNo, float amount, long bankCode);

}
