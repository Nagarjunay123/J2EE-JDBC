package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchPerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb", "root","root");
		
		//Create Statement
		Statement statement= connection.createStatement();
		
		//Execute the statement
		ResultSet resultset=statement.executeQuery("select * from person");
		
		while(resultset.next())
		{
			System.out.print(resultset.getInt(1)+" ");
			System.out.print(resultset.getString(2)+" ");
			System.out.print(resultset.getInt(3)+" ");
			System.out.print(resultset.getString(4)+" ");
			System.out.print(resultset.getInt(5));
			System.out.println();
		}
		
		//close the connection
		connection.close();
		
//		System.out.println("Fetched successfully");
		
	}

}
