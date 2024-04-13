package controller;

import java.sql.SQLException;

import dao.LaptopDao;
import dto.Laptop;

public class DeleteLaptop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Laptop laptop=new Laptop();
		laptop.setLaptopId(3);
		
		LaptopDao laptopDao=new LaptopDao();
		laptopDao.deletelaptop(laptop);
	}

}
