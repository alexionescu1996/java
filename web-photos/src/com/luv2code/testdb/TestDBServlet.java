package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDBServlet
 */

import java.sql.*;

@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final String USER = "hbstudent";
		final String PASS = "hbstudent";

		final String URL = "jdbc:mysql://localhost:3306/photos?useSSL=false&serverTimezone=UTC";
		final String DRIVER = "com.mysql.jdbc.Driver";

		try {

			PrintWriter out = response.getWriter();

			out.println("Connecting to db " + URL);

			Class.forName(DRIVER);

			Connection connection = DriverManager.getConnection(URL, USER, PASS);

			out.println("Success!");
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
