package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		// Padrão amaricano de escrita
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		sc.nextLine(); //flush
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		sc.nextLine(); //flush
		String completeCode = sc.next();
		char firstCharAtCode = completeCode.charAt(0);
		//char secondCharAtCode = completeCode.charAt(1);
		//int firstIntAtCode = Integer.parseInt(completeCode.substring(1, 2));
		int firstIntAtCode = Integer.parseInt(completeCode.substring(1));
		
		double n2 = sc.nextDouble();
		
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		//int age = Integer.parseInt(sc.next());
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(n1);		
		System.out.println(name);
		System.out.println(gender);
		System.out.printf("First char = %c%nSecond char = %d%n", firstCharAtCode, firstIntAtCode);
		System.out.println(n2);
		System.out.printf("%s %c %d %f", name2, ch, age, height);
		
		sc.close();
	}
}
