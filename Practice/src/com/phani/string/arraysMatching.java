package com.phani.string;

import java.util.stream.IntStream;

public class arraysMatching {

	public static boolean sameSet(int[] a, int[] b) {
		boolean isSame = false;
		// IntStream is a java8 feature which is used to perfrom operations on the int
		int[] array = getArray(a);
		int[] array2 = getArray(b);

		// checking length of two arrays
		if (array.length == array2.length) {

			for (int i = 0; i < array.length; i++) {
				// checking each element of two arrays
				if (array[i] == array2[i]) {
					isSame = true;
				}
			}
		}
		return isSame;
	}

	public static int[] getArray(int[] a) {

		int[] array = IntStream.of(a).distinct().sorted().toArray(); // passing an array into instream and then finding
																		// disticnt elements and sorting

		return array;
	}

	public static void main(String[] args) {
		// Arrays Declaration
		int[] firstArray = new int[] { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
		int[] secondArray = new int[] { 11, 11, 7, 9, 16, 4, 1 };

		// calling a method
		boolean isMatched = sameSet(firstArray, secondArray);

		// printing the result
		System.out.println("two Arrays contains same elements?  " + isMatched);

	}

}
