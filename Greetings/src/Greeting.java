import java.util.Scanner;
public class Greeting {
	public static void main(String[] args) {
		String firstName = args[0];
		String lastName = args[1];
		System.out.println("Hello, " + firstName + " " + lastName + "!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your greeting: ");
		String greet = keyboard.nextLine();
		System.out.println(greet + " to you too!");
		keyboard.close();
	}
}
