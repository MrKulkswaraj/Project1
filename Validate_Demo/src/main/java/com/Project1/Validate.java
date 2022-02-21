package com.Project1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String username,password;
   
    public Validate() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		username=req.getParameter("username");
		password=req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		
		if ((username.equals("Swaraj"))&&(password.equals("123456"))) {
			out.println("Welcome Login Successful");
		}
		else {
			out.println("Login failed...............");
		}
		
	}

}
