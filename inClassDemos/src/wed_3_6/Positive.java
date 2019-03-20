package wed_3_6;
import java.util.Scanner;

public class Positive {

		public static void main(String[] args) {
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter whole number: ");
			int number = keyboard.nextInt();
				
			System.out.print(number);
			
			if (number > 0 ) {
				System.out.print(" is Positive");
			}
			else if (number < 0) {
				System.out.print(" is Negative");
			}

		}

	}

