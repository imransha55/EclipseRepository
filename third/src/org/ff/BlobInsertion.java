package org.ff;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BlobInsertion 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query="insert into ismartdb.blob values(?)";
		Connection con=DriverManager.getConnection(url);
		PreparedStatement ps = con.prepareStatement(query);
		InputStream in = new FileInputStream("C:\\Users\\Sreenivas Bandaru\\Desktop\\eidiko.jpg");
		ps.setBlob(1, in);
		ps.execute();
	}
}
