package controller;

import java.sql.SQLException;

import dao.LaptopDao;

public class FetchLaptop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		LaptopDao laptopDao=new LaptopDao();
		laptopDao.fetchLaptop();
	}

}
