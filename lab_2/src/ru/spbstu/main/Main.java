package ru.spbstu.main;
import java.util.Random;
import ru.spbstu.main.shapes.*;
import ru.spbstu.main.shapes.Circle;

public class Main {
    public static void main(String[] args) {
    	Random random;
    	random = new Random();
    	int k = 0;
    	int choose;
        Shape[] shapes = new Shape[10]; 
    	float[] areaShapes = new float[10];
     
    	for (int i=0;i<10;i++) {

    		choose = random.nextInt(3) +1;
    		
    		if (choose == 1) {
    			System.out.println(+i+1 +") Circle ");
    			Circle C = new Circle();
    			shapes[i]  = new Circle();
    			C.getLength();
    			shapes[i]  = C;
    		};
			if (choose == 2) {
				System.out.println(+i+1 +") Retangle");

				shapes[i] = new Rectangle();
				Rectangle R = new Rectangle();
				R.getPerimeter();
				shapes[i] = R;
			};
    		if (choose == 3) {
    			System.out.println(+i+1 +") Triangle ");

    			Triangle T = new Triangle();
				T.getPerimeter();
				shapes[i] = T;
    		};
    		areaShapes[i] = shapes[i].getArea();
        	System.out.println(" Area : " +shapes[i].getArea());

    	}; 
    	float MaxArea = areaShapes[0];
    	for (int i=0;i<10;i++) {
    		if (MaxArea < areaShapes[i]) {
    			MaxArea = areaShapes[i]; 
    			k=i;
    		}
    	};
    	System.out.println("\nMax Area : " +shapes[k].getArea());

    }
}
