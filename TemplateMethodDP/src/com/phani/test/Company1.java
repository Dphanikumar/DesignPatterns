package com.phani.test;

import com.phani.factory.FresherFactory;
import com.phani.recruitment.Fresher;

public class Company1 {

	public static void main(String[] args) {
		Fresher fresher = null;
		fresher = FresherFactory.getInstance("java");
		fresher.fresherRecruitmentDrive();

	}

}