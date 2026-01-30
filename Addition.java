package scanner;
import java.util.Scanner;
public class Addition {
	
	Scanner ad = new Scanner(System.in);
	
	public void addNumber() {
		int a = 0;
		int b = 0;
		
		System.out.println("Addition of numbers: ");
		System.out.println("Enter number a : ");
		a = ad.nextInt();
		System.out.println("Enter number b : ");
		b = ad.nextInt();
		int c = a+b;
		System.out.println("->Addition is : "+ c);
	}
}
