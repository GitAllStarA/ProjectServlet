package com.vikranth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;



@WebServlet("/sqr")
public class SquareServlet extends HttpServlet {
	
	public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException  {

			// int k = Integer.parseInt(req.getParameter("k"));
		
		  //creating a session object to use tomcat session data, session stores the client (req) data
		 // HttpSession session = req.getSession();
		
		 // getting the session object from tomcat session 
		 //int k = (int) session.getAttribute("k");	
		   
		   int k =0;
		   
		 // getting cookies from request (client) which was given previous servlet in response (server)  
		Cookie[] cookiez = req.getCookies();
		
		// it may have many cookies so using for loop and searching the required values
		for (Cookie c : cookiez) {
			if (c.getName().equals("k")) {
				k=Integer.parseInt(c.getValue());
			}
		}
		
		
		k = k*k;
			PrintWriter out = res.getWriter();
			 out.println("hey i was called / redirect by pervious servlet response object & result is "+k);
			
		System.out.println("hey i was called / redirect by pervious servlet response object & result is  "+k);
		
//		
//		ServletConfig cfgConfig = getServletConfig();
//		String xString = cfgConfig.getInitParameter("square");
//		
		
		
//		ServletContext context = req.getServletContext();
//		String value = context.getInitParameter("name");
//		out.println(value);
//		out.println(xString);
		
	
	}
}
