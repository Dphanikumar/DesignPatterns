package com.phani.test;

import com.phani.dao.DAO;
import com.phani.factory.DBDAOFactory;
import com.phani.factory.ExcelDAOFactory;

public class AbstractFactoryProblemTest {

	public static void main(String[] args) {
		DAO studentDao = null, courseDao = null;

		studentDao = DBDAOFactory.createDAO("student");
		studentDao.insert();
		System.out.println("-----------------");

		courseDao = ExcelDAOFactory.createDAO("course");
		courseDao.insert();

	}

}
