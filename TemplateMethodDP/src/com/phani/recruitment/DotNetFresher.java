package com.phani.recruitment;

public class DotNetFresher extends Fresher {

	@Override
	public boolean conductTechnicalInterview() {
		System.out.println(".Net Fresher::Conduct .Net TechicalInterview");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println(".Net Fresher::Conduct .Net SystemTest");
		return true;
	}

}
