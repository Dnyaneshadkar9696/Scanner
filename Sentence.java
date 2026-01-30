package scanner;

import java.util.Scanner;

public class Sentence {
	
	Scanner nasa = new Scanner(System.in);
	
	public void printSentence() {
		System.out.println("Enter the sentence : ");
		String sentence = nasa.nextLine();
		
		System.out.println("Sentence : "+ sentence);
		
		
	}

}
