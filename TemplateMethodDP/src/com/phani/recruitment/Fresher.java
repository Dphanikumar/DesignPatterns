package com.phani.recruitment;

public abstract class Fresher {

	private boolean conductAptitudeTest() {
		System.out.println("Fresher :: conducting aptitude test");

		return true;
	}

	private boolean conductGDTest() {
		System.out.println("Conducting GD Test");
		return true;

	}

	public abstract boolean conductTechnicalInterview();

	public abstract boolean conductSystemTest();

	private boolean conductHRInterview() {

		System.out.println("Fresher:: conducting HR Interview");
		return true;

	}

	// Template method
	public boolean fresherRecruitmentDrive() {

		boolean flag = false;
		flag = conductAptitudeTest();
		if (flag)
			flag = conductGDTest();
		if (flag)
			flag = conductTechnicalInterview();
		if (flag)
			flag = conductSystemTest();
		if (flag)
			flag = conductHRInterview();
		return flag;

	}

}
