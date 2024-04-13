package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Laptop;

public class LaptopDao {

	public void insertlaptop(Laptop laptop) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb", "root", "root");

		CallableStatement callableStatement = connection.prepareCall("call laptopdb.insertlaptop(?,?,?,?,?)");
		callableStatement.setInt(1, laptop.getLaptopId());
		callableStatement.setString(2, laptop.getLaptopBrand());
		callableStatement.setDouble(3, laptop.getLaptopPrice());
		callableStatement.setString(4, laptop.getLaptopColor());
		callableStatement.setInt(5, laptop.getLaptopRam());

		callableStatement.execute();

		connection.close();

		System.out.println("successfully inserted into DB");
	}

	public void deletelaptop(Laptop laptop) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb", "root", "root");

		CallableStatement callableStatement = connection.prepareCall("call laptopdb.deletelaptop(?)");
		callableStatement.setInt(1, laptop.getLaptopId());
		
		callableStatement.execute();
		connection.close();
		System.out.println("successfully deleted into DB");

	}
	
	public void updatelaptop(Laptop laptop) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb", "root", "root");

		CallableStatement callableStatement = connection.prepareCall("call laptopdb.updatelaptop(?,?)");
		callableStatement.setInt(1, laptop.getLaptopRam());
		callableStatement.setInt(2, laptop.getLaptopId());
		
		callableStatement.execute();
		connection.close();
		System.out.println("successfully updated the DB");

	}
	
	public void fetchLaptop() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopdb", "root", "root");
		

		CallableStatement callableStatement=connection.prepareCall("call laptopdb.fetchlaptop()");
		ResultSet resultSet=callableStatement.executeQuery();
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+" ");
			System.out.print(resultSet.getString(2)+" ");
			System.out.print(resultSet.getString(4)+" ");
			System.out.print(resultSet.getDouble(3)+" ");
			System.out.println(resultSet.getInt(5)+" ");
		}
		
		connection.close();
	}
	
}
