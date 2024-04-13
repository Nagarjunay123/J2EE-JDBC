package controller;

import java.sql.SQLException;

import dao.LaptopDao;
import dto.Laptop;

public class InsertLaptop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Laptop laptop=new Laptop();
		laptop.setLaptopId(3);
		laptop.setLaptopBrand("lenovo");
		laptop.setLaptopPrice(50000);
		laptop.setLaptopColor("white");
		laptop.setLaptopRam(6);
		
		LaptopDao laptopDao=new LaptopDao();
		laptopDao.insertlaptop(laptop);
	}

}
