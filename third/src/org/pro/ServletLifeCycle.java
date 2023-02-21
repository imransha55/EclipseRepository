package org.pro;

//Java program to show servlet example
//Importing required Java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Extend HttpServlet class
public class ServletLifeCycle extends HttpServlet
{
private String output;
	
//Initializing servlet
public void init() throws ServletException
{
	output = "Advance Java Concepts";
}

//Requesting and printing the output
public void doGet(HttpServletRequest req,
					HttpServletResponse resp)
	throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println(output);
	}

	public void destroy()
	{
		System.out.println("Over");
	}
}

