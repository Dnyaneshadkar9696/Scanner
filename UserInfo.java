package scanner;

import java.util.Scanner;

public class UserInfo {
	
	Scanner infor = new Scanner(System.in);
	
	public void infoUser() {
		System.out.println("User information : ");
		
		System.out.println("Enter the name: ");
		String name  = infor.nextLine();
		System.out.println("Enter the age: ");
		int age = infor.nextInt();
		
		System.out.println("-> Name : "+ name);
		System.out.println("-> Age  : "+ age);
	}

}
