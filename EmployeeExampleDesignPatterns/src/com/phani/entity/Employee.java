package com.phani.entity;

import com.phani.cloning.Cloning;

public class Employee implements Cloning {
	private static Employee INSTANCE;

	private Employee() {
		System.out.println("Private Employee COnsss");
	}

	public static Employee getInstance() {
		if (INSTANCE == null) {
			synchronized (Employee.class) {
				if (INSTANCE == null)
					INSTANCE = new Employee();

			}
		}
		return INSTANCE;

	}

	private Long id;
	private String name;
	private String address;
	private String phoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

}
