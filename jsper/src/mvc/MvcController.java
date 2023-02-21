package mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MvcController")
public class MvcController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doPost(req, resp);
	resp.setContentType("text/html");
	PrintWriter pw = resp.getWriter();
	
	String uname= req.getParameter("name");
	String tempnum=req.getParameter("mob");
	String pass=req.getParameter("pwd");
	
	//-----------------------------------------------/
	
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String sel="Select * from ismartdb.mvcuser where mobile=tempnum";
	try 
	{
		Connection con = DriverManager.getConnection(url);
		PreparedStatement ps = con.prepareStatement(sel);
		ResultSet rs = ps.executeQuery();
		if (rs.next())
		{
			RequestDispatcher rd=req.getRequestDispatcher("mvcLogin-Success.jsp");
			rd.forward(req, resp);
		} 
		else 
		{
			RequestDispatcher rd= req.getRequestDispatcher("mvcLogin-Error.jsp");
			rd.forward(req, resp);
		}
		
	} 
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	/*LoginBean bean = new LoginBean();
	bean.setName(uname);
	bean.setMob(num);
	bean.setPwd(pass);
	
	boolean status= bean.validate();
	if (status)
	{
		RequestDispatcher rd=req.getRequestDispatcher("mvcLogin-Success.jsp");
		rd.forward(req, resp);
	} 
	else 
	{
		RequestDispatcher rd= req.getRequestDispatcher("mvcLogin-Error.jsp");
		rd.forward(req, resp);
	}*/
	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
	doPost(req, resp);
	}
}
