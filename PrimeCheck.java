package scanner;

import java.util.Scanner;

public class PrimeCheck {
	
	Scanner sc = new Scanner(System.in);
	
	public void primeCheck() {
		System.out.println("Enter the number to check : ");
		int a = sc.nextInt();
		int bul = 1;
		
		for(int i= 2 ; i <= a; i++) {
			if(a%2 == 0) {
				bul = bul - 1;
				break;
			}
		}
		if(bul == 1) {
			System.out.println("->  Number "+ a + " is a prime number");
		}
		else {
			System.out.println(" -> Number "+ a + " is not a prime number");
		}
		
		
	}

}
