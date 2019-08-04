package program;

import java.util.Locale;
import java.util.Scanner;

import com.sun.jdi.Location;

public class Program {

	public static void main(String[] args) {
		
		String name;
		int badroomsInHouse, age;
		double productPrice, height;
		String lastName;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		name = sc.nextLine();
		
		System.out.println("How many bedrooms are there in your house?");
		badroomsInHouse = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter product price:");
		productPrice = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter your last name, age and height (same line)");
		lastName = sc.next();
		age = sc.nextInt();
		height = sc.nextDouble();
		sc.nextLine();
		
		sc.close();
		
		System.out.println(name);
		System.out.println(badroomsInHouse);
		System.out.printf("%.2f%n", productPrice );
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f%n", height);
		
	}

}
