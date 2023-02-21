package org.ff;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTOut")
public class SessionTOut extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("mail");
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="select * from ismartdb.ismartorg where email=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps  = con.prepareStatement(query);
			ps.setString(1,email);
			ResultSet rs = ps.executeQuery();
			HttpSession hs = req.getSession();
			hs.setAttribute(email, email);
			hs.setMaxInactiveInterval(10);
			if (rs.next())
			{
				RequestDispatcher rd = req.getRequestDispatcher("SessionTimeOut.html");
				rd.include(req, resp);
				
			}
			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("Login.html");
				rd.include(req, resp);
			}
			con.createSQLXML();
			
			} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
