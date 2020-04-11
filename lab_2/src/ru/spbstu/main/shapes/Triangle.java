package ru.spbstu.main.shapes;
import java.util.Random;

public class Triangle implements Polygon{
	int x,y,z,q;
	
	@Override
	public float getPerimeter() {
		Random random = new Random();
		while ((x+y)<=z || (x+z <= y) || (y+z <= x)) {
			x= random.nextInt(10)+1;
			y= random.nextInt(10)+1;
			z= random.nextInt(10)+1;
			q= (x+y+z)/2;
		}
		System.out.println(" 3 edges in triangle : " +x +"_" +y +"_"+z);
		return q; 		
	}
	
	@Override
	public float getArea() {
		return ((float) Math.sqrt(q*(q-x)*(q-y)*(q-z)));
	}
}
