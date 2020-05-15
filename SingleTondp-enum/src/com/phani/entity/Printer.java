package com.phani.entity;

import com.phani.comons.CommonsUtil;

public enum Printer implements CommonsUtil {

	INSTANCE;

	public void print(String msg) {
		System.out.println(msg);

	}

	@Override
	public Object doClone() throws CloneNotSupportedException {
		return super.clone();

	}

}
