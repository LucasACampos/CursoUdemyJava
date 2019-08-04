package program;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int itsPair;
		int input;
		
		input = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		itsPair = input % 2;
		
		if(itsPair == 0) {
			System.out.println("Even!");
		}else {
			System.out.println("Odd!");
		}
		
		

	}

}
