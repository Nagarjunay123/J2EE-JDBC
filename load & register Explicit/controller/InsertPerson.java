package controller;

import java.io.IOException;
import java.sql.SQLException;

import dao.PersonDao;

public class InsertPerson {

	public static void main(String[] args) throws SQLException, IOException {

		PersonDao personDao=new PersonDao();
		personDao.InsertPerson();
	}

}
