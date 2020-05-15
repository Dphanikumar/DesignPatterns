package com.phani.test;

import com.phani.dao.DAO;
import com.phani.factory.DAOFactory;
import com.phani.factory.DaoFactoryCreator;

public class AbstractFactoryProblemTest {

	public static void main(String[] args) {
		DAO studentDao = null, courseDao = null;

		DAOFactory factory = null;
		factory = DaoFactoryCreator.buildDAOAFactory("db");
		studentDao = factory.createDAO("student");
		courseDao = factory.createDAO("course");
		studentDao.insert();
		courseDao.insert();

	}

}
