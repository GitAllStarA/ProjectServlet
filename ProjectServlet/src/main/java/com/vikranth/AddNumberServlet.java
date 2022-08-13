package com.vikranth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddNumberServlet extends HttpServlet {

	public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

    	String i = req.getParameter("t1");		
    	String j = req.getParameter("t2");
		int k = Integer.parseInt(i) + Integer.parseInt(j) ;


		//System.out.println(i + " + " + j + " = " + k);
		
		//System.out.println("hello");
		
		//PrintWriter out =  res.getWriter();
		//out.println(i + " + " + j + " = " + k);
		
		
		// sending the added value to the another servlet to get squared value using request dispatcher object and assigning the path with /sqr (urlmapping)
	//	RequestDispatcher requestDispatcher = req.getRequestDispatcher("/sqr");
		
		// setting the value in request and forwarding to the server
	//			 req.setAttribute("k",k);
				 
				
		
		// Forwarding the res and req to the sqr servlet , where same object of (req and res of AddNumberServlet) are forwarded to the sqr servlet and sent res to client 
	//	requestDispatcher.forward(req, res);
		
		
		
		//Now just redirecting the client request to ohter servlet
		// url  rewriting
		
		//res.sendRedirect("sqr?k="+k);  
		
		
		// creating tomcat session object, session stores reqs (clients) data
		HttpSession session = req.getSession();
		
		// setting session attributes
		session.setAttribute("k", k);
		
		res.sendRedirect("sqr");
		
		
		
		
	 }

}
