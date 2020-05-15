package com.phani.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = { "/helloServlet" })
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 7116154498457682351L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		try {

			writer.println("Welcome to the helloServlet");
			String color = req.getParameter("color");

			System.out.println(color);
		} finally {

			if (writer != null)
				writer.close();
		}

	}
}
