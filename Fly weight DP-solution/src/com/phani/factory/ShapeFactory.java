package com.phani.factory;

import java.util.Hashtable;
import java.util.Map;

import com.phani.shape.Circle;
import com.phani.shape.Shape;
import com.phani.shape.Square;

public class ShapeFactory {

	private static Map<String, Object> cacheMap = new Hashtable<>();

	public static Shape getInstance(String shapeType) {
		Shape shape = null;
		if (!cacheMap.containsKey(shapeType)) {
			if (shapeType.equalsIgnoreCase("circle"))
				shape = new Circle();
			else if (shapeType.equalsIgnoreCase("square"))
				shape = new Square();
			else
				throw new IllegalArgumentException("Undefined shape");

			cacheMap.put(shapeType, shape);

		}
		return (Shape)cacheMap.get(shapeType);

	}

}
