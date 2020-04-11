package ru.spbstu.main.shapes;
import java.util.Random;

public class Rectangle implements Polygon{
	int length;
	int width;

	@Override
	public float getPerimeter() {
		Random random = new Random();
		length = random.nextInt(10);
		width = random.nextInt(10);
		return 0;
	}

	@Override
	public float getArea() {
		 return (length*width);
	}
}
