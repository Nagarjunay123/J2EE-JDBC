package controller;

import java.sql.SQLException;

import dao.CustomerDao;

public class FetchCustomer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		CustomerDao customerDao=new CustomerDao();
		customerDao.fetchCustomer();
	}

}
