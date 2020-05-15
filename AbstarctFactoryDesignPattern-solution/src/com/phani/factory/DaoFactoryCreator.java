package com.phani.factory;

//Abstract Dao(Super fact) (hiding things on the top of factory)
public class DaoFactoryCreator {

	public static DAOFactory buildDAOAFactory(String factoryType) {
		DAOFactory daoFactory = null;
		if (factoryType.equalsIgnoreCase("db")) {
			daoFactory = new DBDAOFactory();
		} else if (factoryType.equalsIgnoreCase("excel")) {
			daoFactory = new ExcelDAOFactory();
		} else
			throw new IllegalArgumentException("No Such Factory available");

		return daoFactory;

	}
}
