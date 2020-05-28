package com.phani.shape;

public class Square implements Shape {

	private String lable;

	public Square() {
		System.out.println("Circle.Circle()");

		lable = "Square";
	}

	@Override
	public void draw(int sideLength, String fillColor, String lineStyle) {
		System.out.println("Square.draw()");
		System.out.println("Drawing Square having side length:" + sideLength + "with fillColor: " + fillColor
				+ " with lineStyle: " + lineStyle);

	}

}
