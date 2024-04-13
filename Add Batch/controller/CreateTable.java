package controller;

import java.sql.SQLException;

import dao.CustomerDao;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		CustomerDao customerDao= new CustomerDao();
		customerDao.createTable();
	}

}
