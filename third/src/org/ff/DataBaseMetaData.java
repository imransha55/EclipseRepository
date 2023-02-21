package org.ff;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseMetaData 
{
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query ="select * from ismartdb.student";
		Connection con = DriverManager.getConnection(url);
		Statement stmt = con.createStatement();
		DatabaseMetaData dbm= con.getMetaData();
		System.out.println("Your Connected with: "+dbm.getDatabaseProductName());
		System.out.println("Your db version: "+dbm.getDatabaseProductVersion());
		System.out.println("Db Major Version :"+dbm.getDatabaseMajorVersion());
		System.out.println("Db minor Version :"+dbm.getDatabaseMinorVersion());
		System.out.println("Jdbc Major Version :"+dbm.getJDBCMajorVersion());
		System.out.println("Jdbc Minor Version :"+dbm.getJDBCMinorVersion());
		System.out.println("Driver Name :"+dbm.getDriverName());
		System.out.println("DriverVersion :"+dbm.getDriverVersion());
		System.out.println("Url :"+dbm.getURL());
		System.out.println("User NAme :"+dbm.getUserName());
		System.out.println("Max columns in Table :"+dbm.getMaxColumnsInTable());
		System.err.println("MAymore methods Left");
	}

}
