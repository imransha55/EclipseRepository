package org.ff;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/Config",initParams = {
		@WebInitParam(name="division",value = "88")})
public class Config extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rupe=req.getParameter("rup");
		double rup = Double.parseDouble(rupe);
		//obj creation of servletConfig
		ServletConfig conf=getServletConfig();
		String j=conf.getInitParameter("division");
		int val =Integer.parseInt(j);
		double doller = rup/val;
		PrintWriter pw = resp.getWriter();
		
		pw.println("Rupees "+rup+" /-");
		pw.println(rup+" == "+doller+" $");
		
	}

}
