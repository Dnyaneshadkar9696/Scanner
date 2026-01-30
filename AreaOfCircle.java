package scanner;

import java.util.Scanner;

public class AreaOfCircle {
	
	Scanner circle = new Scanner(System.in);
	
	public void checkCirle() {
		System.out.println("Enter the radius of circle: ");
		double a = circle.nextInt();
		
		System.out.println("Area of circle is : "+ (3.14*a*a)+ " square centimeters");
	}

}
