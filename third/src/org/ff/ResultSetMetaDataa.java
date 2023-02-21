package org.ff;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.mysql.fabric.xmlrpc.base.Data;
@WebServlet("/ResultSetMetaDataa")
public class ResultSetMetaDataa extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException
	{
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query = "select * from ismartdb.student";
		Connection con;
		PrintWriter pw  = res.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsd= rs.getMetaData();
			pw.println("Column Count: "+rsd.getColumnCount());
			pw.println("Column Name: "+rsd.getColumnName(1));
			pw.println("Column Type: "+rsd.getColumnType(1));
			pw.println("Column Type NAme: "+rsd.getColumnTypeName(1));
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
