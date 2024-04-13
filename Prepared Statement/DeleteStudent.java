package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		
		//create the prepared statement
		PreparedStatement preparedStatement=connection.prepareStatement("delete from student where studentid=?");
		preparedStatement.setInt(1, 1);
		
		//execute the statement
		preparedStatement.execute();
		
		//close the connection
		connection.close();
		
		System.out.println("successfully deleted from DB");
	}

}
