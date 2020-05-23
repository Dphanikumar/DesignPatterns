package com.fpkt.test;

import com.fpkt.service.FlipkartPaymentMgmtService;
import com.fpkt.service.FlipkartPaymentMgmtServiceImpl;

public class AdapterDpTest {

	public static void main(String[] args) {

		FlipkartPaymentMgmtService service = null;
		String txMsg = null;
		// get service class object
		service = new FlipkartPaymentMgmtServiceImpl();
		// invoke method
		try {

			txMsg = service.doPayment(1234345, "SBI", 10000);
			System.out.println(txMsg);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
