						package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load & register the Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection with DB
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root", "root");
		
		//Create the Statement
		
		Statement statement=connection.createStatement();
		
		//Execute the statement
		statement.execute("insert into person values(10,'PRABHAS',42,'HYD',1234567890)");
		statement.execute("insert into person values(11,'maheshbabu',42,'HYD',1234567890)");
		
		//close the connection
		connection.close();
		
		System.out.println("Successfully Insert into DB");

	}

}
