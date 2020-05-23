package com.fpkt.service;

public interface FlipkartPaymentMgmtService {

	String doPayment(long cardNo, String bankName, float amount);
}
