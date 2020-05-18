package com.phani.recruitment;

public class PHPFresher extends Fresher {

	@Override
	public boolean conductTechnicalInterview() {
		System.out.println(".Net Fresher::Conduct php TechicalInterview");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println(".Net Fresher::Conduct php SystemTest");
		return true;
	}

}
