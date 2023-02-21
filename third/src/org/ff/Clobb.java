package org.ff;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Clob;

public class Clobb 
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
	     /* stmt.execute("CREATE TABLE ismartdb.Technologies( Name VARCHAR(255), Type VARCHAR(255), Article LONGTEXT)");
	      System.out.println("Table Created......");*/

	      //Inserting values
	      String query = "INSERT INTO ismartdb.Technologies(Name, Type, Article ) VALUES (?, ?, ?)";
	      PreparedStatement pstmt = con.prepareStatement(query);
	      pstmt.setString(1, "JavaFX");
	      pstmt.setString(2, "Java Library");
	      FileReader reader = new FileReader("C:\\Users\\Sreenivas Bandaru\\Desktop\\eidiko.jpg");
	      pstmt.setClob(3, reader);
	      pstmt.execute();
	      pstmt.setString(1, "CoffeeScript");
	      pstmt.setString(2, "Scripting Language");
	      reader = new FileReader("C:\\Users\\Sreenivas Bandaru\\Downloads\\coffeescript.jpg");
	      pstmt.setClob(3, reader);
	      pstmt.execute();
	      pstmt.setString(1, "Cassandra");
	      pstmt.setString(2, "NoSQL Database");
	      reader = new FileReader("C:\\Users\\Sreenivas Bandaru\\Downloads\\Cassandra.jpg");
	      pstmt.setClob(3, reader);
	      pstmt.execute();
	      //Retrieving the data
	      ResultSet rs = stmt.executeQuery("select * from ismartdb.Technologies");
	      int j = 0;
	      System.out.println("Contents of the table are: ");
	      while(rs.next()) {
	         System.out.println(rs.getString("Name"));
	         java.sql.Clob clob = rs.getClob("Article");
	         Reader r = clob.getCharacterStream();
	         String filePath = "C:\\Users\\Sreenivas Bandaru\\Desktop"+j+".jpg";
	         FileWriter writer = new FileWriter(filePath);
	         int i;
	         while ((i=r.read())!=-1) {
	            writer.write(i);
	         }
	         writer.close();
	         System.out.println(filePath);
	         j++;
	      }
	   }

}
