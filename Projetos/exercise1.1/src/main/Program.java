package main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		double a, b, c, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a = ");
		a = sc.nextDouble();
		
		System.out.print("b = ");
		b = sc.nextDouble();
		
		System.out.print("c = ");
		c = sc.nextDouble();
		
		result = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		
		System.out.println(result);
		
		sc.close();
	}

}
