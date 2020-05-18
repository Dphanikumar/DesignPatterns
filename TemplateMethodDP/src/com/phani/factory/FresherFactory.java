package com.phani.factory;

import com.phani.recruitment.DotNetFresher;
import com.phani.recruitment.Fresher;
import com.phani.recruitment.JavaFresher;
import com.phani.recruitment.PHPFresher;

public class FresherFactory {

	public static Fresher getInstance(String fresherType) {
		Fresher fresher = null;
		if (fresherType.equalsIgnoreCase("java")) {
			fresher = new JavaFresher();

		} else if (fresherType.equalsIgnoreCase(".Net")) {
			fresher = new DotNetFresher();
		} else if (fresherType.equalsIgnoreCase("php")) {
			fresher = new PHPFresher();

		} else
			throw new IllegalArgumentException("Invalid fresherType");
		return fresher;

	}

}
