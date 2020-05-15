package com.phani.factory;

import com.phani.dao.DAO;

public interface DAOFactory {

	public DAO createDAO(String type);

}
