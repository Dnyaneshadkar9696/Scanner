package scanner;

import java.util.Scanner;

public class Factorial {

	Scanner fc = new Scanner(System.in);

	public void checkFactorial() {

		System.out.println("Enter the number for factorial : ");
		long n = fc.nextInt();
		long sum = 1;
		long total = 0;

		for (long i = n; i >= 1; i--) {

			sum = sum * i;
			total = sum;

		}

		System.out.println("-> Factorial : " + total);

	

	}

}
