package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dto.Customer;

public class CustomerDao {

	public void creatSchema() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");

		Statement statement = connection.createStatement();

		statement.execute("create schema customerdb");

		connection.close();

		System.out.println("successfully creates schema");
	}

	public void createTable() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "root");

		Statement statement = connection.createStatement();

		statement.execute(
				"create table customer2(customerId int,customerName varchar(30),customerProduct varchar(40),customerPrice double,customerPhone bigint(10))");

		connection.close();

		System.out.println("successfully creates table");
	}

	public void insertCustomer() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "root");

		Statement statement = connection.createStatement();
		statement.addBatch("insert into customer2 values(1,'Nag','laptop',7000,1234567890)");
		statement.addBatch("insert into customer2 values(2,'Vijay','laptop',7000,1234577890)");
		statement.addBatch("insert into customer2 values(3,'OM','laptop',17000,2234567890)");
		statement.addBatch("insert into customer2 values(4,'Vardan','laptop',17000,1244567890)");
		statement.addBatch("insert into customer2 values(5,'Mahesh','laptop',17000,1234568890)");
		statement.addBatch("insert into customer2 values(6,'siddu','laptop',170000,1334567890)");
		statement.addBatch("insert into customer2 values(7,'mask','laptop',27000,1235567890)");
		statement.addBatch("insert into customer2 values(8,'Koti','laptop',47000,1444567890)");
		statement.addBatch("insert into customer2 values(9,'upi','laptop',1750,1234577890)");
		statement.addBatch("insert into customer2 values(10,'shiva','laptop',670000,1234567990)");
		statement.addBatch("insert into customer2 values(11,'varun','laptop',7700,1234567800)");
		statement.addBatch("insert into customer2 values(12,'bar','laptop',8000,1234567890)");

		statement.executeBatch();

		connection.close();

		System.out.println("successfully insert the data");
	}

	public void updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "root");

		PreparedStatement preparedStatement = connection
				.prepareStatement("update customer set customerphone=? where customerid=? ");
		preparedStatement.setLong(1, customer.getCustomerPhone());
		preparedStatement.setInt(2, customer.getCustomerId());

		preparedStatement.execute();

		connection.close();

		System.out.println("successfully update the data");
	}

	public void deleteCustomer(Customer customer) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "root");

		PreparedStatement preparedStatement = connection.prepareStatement("delete from customer where customerid=? ");
		preparedStatement.setInt(1, customer.getCustomerId());

		preparedStatement.execute();

		connection.close();

		System.out.println("successfully delete the data");
	}

	public void fetchCustomer() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "root");

		Statement statement=connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery("select * from customer");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1));
			System.out.print(resultSet.getString(2));
			System.out.print(resultSet.getString(3));
			System.out.print(resultSet.getDouble(4));
			System.out.println(resultSet.getLong(5));
		}

		connection.close();
	}

}
