package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		out.println("<h1>Name:" + name + "</h1>");
		out.println("<h1>Phono:" + pass + "</h1>");
		
		boolean result = CreateJDBC.fetchData(name , pass);
		if(result)
		{
			out.print("Login Successfully");
		}
		else{
			out.print("Invalid credential");
		}
	}

}
