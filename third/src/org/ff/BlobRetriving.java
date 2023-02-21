package org.ff;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BlobRetriving 
{
	public static void main(String args[]) throws Exception {
	      //Registering the Driver
	      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	      //Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost:3306?user=root&password=12345";
	      Connection con = DriverManager.getConnection(mysqlUrl);
	      System.out.println("Connection established......");
	      //Creating a table
	      Statement stmt = con.createStatement();
	     /* stmt.execute("CREATE TABLE ismartdb.SampleTable( Name VARCHAR(255), Image BLOB)");
	      System.out.println("Table Created");*/
	      //Inserting values
	      String query = "INSERT INTO ismartdb.SampleTable(Name,image) VALUES (?, ?)";
	      PreparedStatement pstmt = con.prepareStatement(query);
	      pstmt.setString(1, "sample image");
	      FileInputStream fin = new FileInputStream("C:\\Users\\Sreenivas Bandaru\\Downloads\\bg.jpg");
	      pstmt.setBlob(2, fin);
	      pstmt.execute();
	      //Retrieving the data
	      ResultSet rs = stmt.executeQuery("select * from ismartdb.SampleTable");
	      int i = 1;
	      System.out.println("Contents of the table are: ");
	      while(rs.next()) {
	         System.out.println(rs.getString("Name"));
	         Blob blob = rs.getBlob("Image");
	         byte byteArray[] = blob.getBytes(1,(int)blob.length());
	         FileOutputStream outPutStream = new
	         FileOutputStream("C:\\Users\\Sreenivas Bandaru\\Downloads\\bg"+i+".jpg");
	         outPutStream.write(byteArray);
	         System.out.println("C:\\Users\\Sreenivas Bandaru\\Downloads\\bg"+i+".jpg");
	         System.out.println();
	         i++;
	      }
	   }

	
}
