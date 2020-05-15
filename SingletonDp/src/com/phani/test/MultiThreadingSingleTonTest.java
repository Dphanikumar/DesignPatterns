package com.phani.test;

import com.phani.servlet.TicketBookingServlet;

public class MultiThreadingSingleTonTest {

	public static void main(String[] args) {
		TicketBookingServlet bookingServlet = null;
		Thread req1 = null;
		Thread req2 = null;

		bookingServlet = new TicketBookingServlet();
		req1 = new Thread(bookingServlet);
		req2 = new Thread(bookingServlet);

		req1.start();
		req2.start();

	}

}
