package scanner;

import java.util.Scanner;

public class MarkOfSubjects {
	
	public void marksInp() {
		Scanner fd = new Scanner(System.in);
		System.out.println("Enter the marks for following subjects: ");
		System.out.print("Maths :");
		int a = fd.nextInt();
		System.out.print("Physics : ");
		int b = fd.nextInt();
		System.out.print("Chemistry : ");
		int c = fd.nextInt();
		System.out.print("Science : ");
		int d = fd.nextInt();
		System.out.print("History : ");
		int e = fd.nextInt();
		
		System.out.println();
		float total = a + b + c + d + e;
		System.out.println("Total = "+ total+"/ 500");
		
		float percentage = 0.0f;
		percentage = total/500*100;
		System.out.println("Percentage  :"+ percentage);
		
		
	}

}
