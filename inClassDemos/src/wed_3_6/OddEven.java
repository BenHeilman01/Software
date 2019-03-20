package wed_3_6;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter whole number: ");
		int number = keyboard.nextInt();
			
		System.out.print(number);
		
		if (number % 2 == 0) {
			System.out.print(" is Even");
		}
		else {
			System.out.println(" is Odd");
	}

	}
}

