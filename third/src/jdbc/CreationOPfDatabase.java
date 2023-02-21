package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import jdk.internal.dynalink.beans.StaticClass;

public class CreationOPfDatabase
{
	static final String url="jdbc:mysql://localhost/";
	static final String user="root";
	static final String pass="12345";
	public static void main(String[] args) throws Exception{
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement stmt = con.createStatement();
		String sql="create database ismart";
		stmt.executeUpdate(sql);
		System.out.println("Db created");
	}

}
