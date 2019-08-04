package program;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double input1, input2, input3;

		input1 = sc.nextDouble();
		input2 = sc.nextDouble();
		input3 = sc.nextDouble();
		sc.nextLine();
		sc.close();

		if (input1 > input2 && input1 > input3) {
			System.out.println("Higher = " + input1);
		} else if (input2 > input3) {
			System.out.println("Higher = " + input2);
		} else {
			System.out.println("Higher = " + input3);
		}
	}
}
