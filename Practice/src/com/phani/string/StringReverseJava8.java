package com.phani.string;

import java.util.stream.Stream;

public class StringReverseJava8 {

	public static void main(String[] args) {

		String s1 = "phani kumar";
		/*
		 * System.out.println(s1.length());
		 * 
		 * for (int i = s1.length() - 1; i >= 0; i--) {
		 * 
		 * System.out.println(s1.charAt(i));
		 * 
		 * }
		 */
		char[] charArray = s1.toCharArray();
		Stream.of(charArray);

	}

}
