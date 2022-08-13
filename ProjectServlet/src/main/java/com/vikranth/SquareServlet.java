package com.vikranth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	
	public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException  {

			// int k = Integer.parseInt(req.getParameter("k"));
		
		  //creating a session object to use tomcat session data, session stores the client (req) data
		 HttpSession session = req.getSession();
		
		 // getting the session object from tomcat session 
		 int k = (int) session.getAttribute("k");	
		   
		   k = k*k;
			PrintWriter out = res.getWriter();
			 out.println("hey i was called / redirect by pervious servlet response object & result is "+k);
			
		System.out.println("hey i was called / redirect by pervious servlet response object & result is  "+k);
	
	}
}
