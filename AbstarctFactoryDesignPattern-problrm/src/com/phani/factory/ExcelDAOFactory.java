package com.phani.factory;

import com.phani.dao.DAO;
import com.phani.dao.ExcelCourseDAOImpl;
import com.phani.dao.ExcelStudentDAOImpl;

public class ExcelDAOFactory {

	public static DAO createDAO(String type) {
		DAO dao = null;
		if (type.equalsIgnoreCase("student")) {
			dao = new ExcelStudentDAOImpl();
			System.out.println("Excel::StudentDBDAOImpl");

		} else if (type.equalsIgnoreCase("course")) {
			dao = new ExcelCourseDAOImpl();
			System.out.println("Excel::CourseDBDAOImpl");
		} else
			throw new IllegalArgumentException("Invalid Dao Type");
		return dao;

	}

}
