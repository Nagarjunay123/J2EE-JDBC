package controller;

import java.sql.SQLException;

import dao.CustomerDao;

public class CreateSchema {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		CustomerDao customerDao= new CustomerDao();
		customerDao.creatSchema();
	}

}
