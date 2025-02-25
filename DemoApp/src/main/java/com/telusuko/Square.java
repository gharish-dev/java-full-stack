package com.telusuko;

import java.io.IOException;


import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;




@WebServlet("/sq")

public class Square extends HttpServlet {
	
	
 
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		/*int k=(int) req.getAttribute("k");	
		PrintWriter out=res.getWriter();	
		out.println("hello i am in square" );
		System.out.println("sqaure is called");*/
		
		
		
		/*get data from parameter
		int k=Integer.parseInt(req.getParameter("k"));
		
		k=k*k;
		
		PrintWriter out=res.getWriter();
			
		out.println("hello i am in sq"+ k)*/
		
		
		/* Get Data using Session
		 * 
		HttpSession session =req.getSession();
		
		int k=(int)session.getAttribute("k");
		
		k=k*k;
		
		PrintWriter out=res.getWriter();
			
		out.println("hello i am in sq"+ k);
		 Session Remove
		 session.removeAttribute("k")*/
		
		
		
		// cookies calling in square 
		 int k = 0;

        // Retrieve cookies
        Cookie[] cookies = req.getCookies();// cookie present i array format
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("k")) {  // Correct way to check cookie name
                    k = Integer.parseInt(c.getValue());
                    break;  // Exit loop once the required cookie is found
                }
            }
        }

        k = k * k;

       // res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello, I am in Square Servlet. Result: " + k + "</h1>");
		
		
		
		
	}
	
}
