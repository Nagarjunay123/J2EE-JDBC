package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		
		//create the statement
		Statement statement=connection.createStatement();
		
		//execute the statement
		statement.execute("create table student(studentId int primary key,studentName varchar(20),studentAge int,studentAddress varchar(40),studentPhone bigint(10))");
		
		//close the connection
		connection .close();
		
		System.out.println("successfully created a table");
	}

}
