package scanner;
import java.util.Scanner;
public class Product {
	
	public void priceCheck() {
		Scanner pri = new Scanner(System.in);
		
		System.out.println("Enter quantity of the product : ");
		int a = pri.nextInt();
		System.out.println("Enter prise of the product : ");
		int b = pri.nextInt();
		
		System.out.println("Toal prise is : "+ a*b);
		
	}

}
