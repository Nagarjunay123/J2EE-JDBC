package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateSchema {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection to Mysql
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
		
		//create the Statement
		Statement statement=connection.createStatement();
		
		//Execute the statement
		statement.execute("create schema studentdb");
		
		//close the connection
		connection.close();
		
		System.out.println("successfully created the schema");
		
	}

}
