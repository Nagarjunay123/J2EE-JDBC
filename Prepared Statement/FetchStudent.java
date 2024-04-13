package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish the connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		
		//create the prepared statement
		PreparedStatement preparedStatement=connection.prepareStatement("select * from student");
		
		
		//execute the statement
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next())
		{
			System.out.print(resultSet.getInt(1)+" ");
			System.out.print(resultSet.getString(2)+" ");
			System.out.print(resultSet.getInt(3)+" ");
			System.out.print(resultSet.getString(4)+" ");
			System.out.print(resultSet.getLong(5)+" ");
			System.out.println();
		}
		
		//close the connection
		connection.close();
	}
}
