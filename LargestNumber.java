package scanner;
import java.util.Scanner;

public class LargestNumber {
	
	Scanner larNum = new Scanner(System.in);
	
	public void checkLargeNum() {
		System.out.println("Find largest number : ");
		System.out.println("Enter the three numbers: ");
		int a = larNum.nextInt();
		int b = larNum.nextInt();
		int c = larNum.nextInt();
		
		if(a >= b && a >= c) {
			System.out.println(a + "-> is a greatest number ");
		}
		else if (b >= a && b >= c) {
			System.out.println(b + "-> is a greatest number ");
		}
		else {
			System.out.println(c + "-> is a greatest number ");
		}
	}

}
