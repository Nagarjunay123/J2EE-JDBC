package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		
		//Create the preparedStatement
		PreparedStatement preparedStatement=connection.prepareStatement("update student set studentphone=? where studentid=?");
		preparedStatement.setLong(1, 9573236260l);
		preparedStatement.setInt(2, 1);
		
		//execute the statement
		preparedStatement.execute();
		
		//close the connection
		connection.close();
		
		System.out.println("successfully updated");
	}

}
