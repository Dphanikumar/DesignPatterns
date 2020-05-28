package com.phani.test;

import com.phani.shape.Circle;
import com.phani.shape.Shape;
import com.phani.shape.Square;

//problem:: this way if we want to create a 10000 circles we want to create that much objects it will creates a lots of memory watsage

//solution:: To Avoid the object creation multiple times take a factory method and hashmap for caching 
public class PaintBrushApplication {

	public static void main(String[] args) {

		Shape shape1 = null;
		Shape shape2 = null;
		System.out.println("Drawing circles");
		for (int i = 0; i <= 5000; i++) {
			shape1 = new Circle();
			shape1.draw(i + 3, "red", "dotted");

		}

		System.out.println("++++++++++++++++++");

		System.out.println("Drawing Sqaure");
		for (int i = 0; i <= 50000; i++) {
			shape2 = new Square();
			shape2.draw(i + 3, "red", "Dashed");

		}

	}

}
