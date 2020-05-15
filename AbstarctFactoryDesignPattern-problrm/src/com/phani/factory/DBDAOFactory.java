package com.phani.factory;

import com.phani.dao.DAO;
import com.phani.dao.DBCourseDAOImpl;
import com.phani.dao.DBStudentDAOImpl;

public class DBDAOFactory {

	public static DAO createDAO(String type) {
		DAO dao = null;
		if (type.equalsIgnoreCase("student")) {
			dao = new DBStudentDAOImpl();
			System.out.println("DB::StudentDBDAOImpl");

		} else if (type.equalsIgnoreCase("course")) {
			dao = new DBCourseDAOImpl();
			System.out.println("DB::CourseDBDAOImpl");

		} else
			throw new IllegalArgumentException("Invalid Dao Type");
		return dao;

	}

}
