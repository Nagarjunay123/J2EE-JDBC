package controller;

import java.sql.SQLException;

import dao.LaptopDao;
import dto.Laptop;

public class UpdateLaptop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Laptop laptop=new Laptop();
		laptop.setLaptopRam(16);
		laptop.setLaptopId(1);
		
		LaptopDao laptopDao=new LaptopDao();
		laptopDao.updatelaptop(laptop);
	}

}
