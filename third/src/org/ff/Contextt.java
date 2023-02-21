package org.ff;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Contextt")
public class Contextt  extends HttpServlet
{ @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String temprup=req.getParameter("rd");
	double rupee= Double.parseDouble(temprup);
	ServletContext context= getServletContext();
	String tempvalue=context.getInitParameter("value");
	int value= Integer.parseInt(tempvalue);
	double pounds=rupee/value;
	PrintWriter pw = resp.getWriter();
	pw.println("Rupees: "+rupee+" /-");
	pw.println("Pounds: "+pounds+" *");
	
	

}

}
