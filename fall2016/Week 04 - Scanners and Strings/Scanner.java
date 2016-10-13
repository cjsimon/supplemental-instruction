import java.util.*;

public class Scanner {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Hello " + name);
		
		System.out.print("Enter two numbers to add together:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
	
		System.out.println("The sum is: " + (num1 + num2));
	}
}