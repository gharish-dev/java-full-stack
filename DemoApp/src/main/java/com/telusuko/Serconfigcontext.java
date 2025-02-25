package com.telusuko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;

//import org.apache.catalina.connector.Response;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// ServletConfig and ServletContext
// Both are interfaces 
// we have to set-up 


public class Serconfigcontext extends HttpServlet  {
	
	
	
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
    	
    	PrintWriter out=res.getWriter();
    	
    	out.print("hello 888  ");
    	// calling context
    	// set up context paramas in xml file
    	/*servlet  context
    	ServletContext ctx=getServletContext();
    	String str=ctx.getInitParameter("Phone");
    	out.print(str);
    	
    	// using servconfig
    	ServletConfig ctx=getServletConfig();
    	String str=ctx.getInitParameter("name");
    	out.print(str);*/
    	
    	
    	
    	
    }
}
