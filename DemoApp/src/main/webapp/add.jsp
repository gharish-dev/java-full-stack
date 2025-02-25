<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new PAges </title>
</head>
<body bgcolor="yellow">


<% 
        int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		
		int k= i+j;
		out.println("the output "+k);
%>	




<%-- they are four tags in jsp --%>
<%--  1. Declaration Tag (<%! %>)  Used to declare variables and methods that can be used throughout the JSP page.
      2. Scriptlet Tag (<% %>)   Used to write Java code inside a JSP page.
      3. Expression Tag (<%= %>) to print 
      4. Directive Tag (<%@ %>)
      5.Used to define page settings, imports, and include other files.--%>

      


</body>
</html>