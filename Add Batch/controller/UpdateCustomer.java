package controller;

import java.sql.SQLException;

import dao.CustomerDao;
import dto.Customer;

public class UpdateCustomer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Customer customer=new Customer();
		customer.setCustomerId(12);
		customer.setCustomerPhone(9573236260l);
		
		CustomerDao customerDao=new CustomerDao();
		customerDao.updateCustomer(customer);
	}

}
