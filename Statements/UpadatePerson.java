package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpadatePerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb", "root","root");
		
		//Create Statement
		Statement statement= connection.createStatement();
		
		//Execute the statement
		statement.execute("update person set personAge=40 where person_Id=1");
		
		//close the connection
		connection.close();
		
		System.out.println("Updated successfully");
		
	}

}
