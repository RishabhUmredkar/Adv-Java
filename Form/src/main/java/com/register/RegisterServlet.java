package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String name = request.getParameter("userName");
		String Phno = request.getParameter("phno");

		out.println("<h1>Name:" + name + "</h1>");
		out.print("<h1>fjhdsfjkbbgbdsjkfdsbfjkdssdb n sdvdbv jdfbjkdfbddfd fd dfd dfd df f</h1>");
		out.println("<h1>Phono:" + Phno + "</h1>");
	}

}