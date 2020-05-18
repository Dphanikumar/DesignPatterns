package com.phani.recruitment;

public class JavaFresher extends Fresher {

	@Override
	public boolean conductTechnicalInterview() {
		System.out.println("java Fresher::Conduct java TechicalInterview");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("java Fresher::Conduct java SystemTest");
		return true;
	}

}
