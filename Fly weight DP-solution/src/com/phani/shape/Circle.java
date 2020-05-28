package com.phani.shape;

public class Circle implements Shape {

	private String lable;

	public Circle() {
		System.out.println("Circle.Circle()");

		lable = "circle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineStyle) {
		System.out.println("Circle.draw()");
		System.out.println("Drawing circle having radius:" + radius + "with fillColor: " + fillColor
				+ " with lineStyle: " + lineStyle);

	}

}
