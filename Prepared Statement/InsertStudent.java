package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the STUDENT ID : ");
		int id=scanner.nextInt();
		
		System.out.println("Enter the STUDENT Name : ");
		String name=scanner.next();
		
		System.out.println("Enter the STUDENT Age : ");
		int age=scanner.nextInt();
		
		System.out.println("Enter the STUDENT Address : ");
		String address=scanner.next();
		
		System.out.println("Enter the STUDENT Phone : ");
		long phone=scanner.nextLong();
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		
		//create the prepared statement
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setInt(3, age);
		preparedStatement.setString(4, address);
		preparedStatement.setLong(5, phone);
		
		
		//execute the prepared statement
		preparedStatement.execute();
		
		//close the connection
		connection.close();
		
		System.out.println("successfully insert into DB");
	}

}
