package com.telusuko;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


//@WebServlet("/add")

public class Adding extends HttpServlet {

         /*doPost---only works with the post request not with get request
	      doGet---only works with the get request
	      service will map if request post then doPost will run else doGet*/
	
	    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k= i+j;
		
		
	
		
		PrintWriter out=res.getWriter();	
		out.println("<html><body bgcolor='yellow'>");
		out.println("the answer is" +k);
		out.println("</body></html>");
		
		// request ---> sending request data to square objects
		//req.setAttribute("k",k);
		// Request Dispatcher is way dispatch one server from Servelet( same object is used)
		//RequestDispatcher sc=req.getRequestDispatcher("home");
		//sc.forward(req,res);
		
		
		// send Redirect used  s1---->s2(differnt object)
		// Redirect implement by session management
		// here were are changing the url it is called Url-rewriting...
		//res.sendRedirect("sq?k="+k);
		
		
		// Session ---> is given by tomcat hold value we can use any serverlet when we require
	   /* HttpSession session =req.getSession();
	    session.setAttribute("k", k);
	    res.sendRedirect("sq");*/
		
		
		
		/* Cookies ---> when we send request to server then server send a response a object. 
		 then object contains a cookie
		 
		 example:
		       when you in bus you  have 100 but price is 60 then 40  back to you.
		       the conductor write remaining balance(40) in ticket. before you get off from bus 
		       you give ticket to conductor then he will find based on ticket
		       if----on the ticket he write remaining balance he will give back to you.
		       
		   
		 
		 /*
		  Cookie cookie=new Cookie("k",k +"");// cookie only take String so ----> k+"" used
		  res.addCookie(cookie);
		  res.sendRedirect("sq");*/
		
	    
	    
		
	}
	
}
