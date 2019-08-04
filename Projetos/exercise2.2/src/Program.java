import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		// Utilização
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000;
		int input = sc.nextInt();
		sc.nextLine();
		
		if((input & mask) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}
 
		sc.close();
	}

}
