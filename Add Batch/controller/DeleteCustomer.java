package controller;

import java.sql.SQLException;

import dao.CustomerDao;
import dto.Customer;

public class DeleteCustomer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Customer customer=new Customer();
		customer.setCustomerId(1);
		
		CustomerDao customerDao=new CustomerDao();
		customerDao.deleteCustomer(customer);
	}

}
