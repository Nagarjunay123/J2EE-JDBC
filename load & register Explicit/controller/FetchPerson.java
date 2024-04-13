package controller;

import java.io.IOException;
import java.sql.SQLException;

import dao.PersonDao;

public class FetchPerson {

	public static void main(String[] args) throws SQLException, IOException {

		PersonDao personDao=new PersonDao();
		personDao.FetchPerson();
	}

}
