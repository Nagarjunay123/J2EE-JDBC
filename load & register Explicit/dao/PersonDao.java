package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class PersonDao {

	public void InsertPerson() throws SQLException, IOException {
		
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		FileInputStream fileInputStream=new FileInputStream("configuration.properties");
		
		Properties properties=new Properties();
		properties.load(fileInputStream);
		
		Connection connection=DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
		
		Statement statement=connection.createStatement();
		
		statement.execute("insert into person values(3,'nani',31,'hyd',1234567890)");
		
		connection.close();
		
		System.out.println("successfully insert the data");
	}
	
	public void UpdatePerson() throws SQLException, IOException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		FileInputStream fileInputStream=new FileInputStream("configuration.properties");
		
		Properties properties=new Properties();
		properties.load(fileInputStream);
		
		Connection connection=DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
		
		Statement statement=connection.createStatement();
		
		statement.execute("update person set personAge=35 where personName='nani'");
		
		connection.close();
		
		System.out.println("successfully update the data");
	}
	
	public void DeletePerson() throws SQLException, IOException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		FileInputStream fileInputStream=new FileInputStream("configuration.properties");
		
		Properties properties=new Properties();
		properties.load(fileInputStream);
		
		Connection connection=DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
		
		Statement statement=connection.createStatement();
		
		statement.execute("delete from person where personAge>40");
		
		connection.close();
		
		System.out.println("successfully delete the data");
	}
	
	public void FetchPerson() throws SQLException, IOException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		FileInputStream fileInputStream=new FileInputStream("configuration.properties");
		
		Properties properties=new Properties();
		properties.load(fileInputStream);
		
		Connection connection=DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery("select * from person");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+" ");
			System.out.print(resultSet.getString(2)+" ");
			System.out.print(resultSet.getInt(3)+" ");
			System.out.print(resultSet.getString(4)+" ");
			System.out.println(resultSet.getLong(5)+" ");
		}
		
		connection.close();
		
	}
}
