package wed_3_6;

import java.util.Scanner;

public class Rounding {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter number: ");
		double number = keyboard.nextDouble();
		int roundedNumber = (int)number;
		double leftOver = number - roundedNumber;
		int roundedNumberUp = roundedNumber + 1;
		//int roundedNumberDown = roundedNumber - 1;
				
		if (leftOver >= .5 ) {
		 System.out.println("Your input was " + number + ", the new value is " + roundedNumberUp);
		}
		
		else { System.out.println("Your input was " + number + ", the new value is " + roundedNumber);
		}
		}
	}



/*  6. Write a method to prompt the user for a double then display the value as a whole number. 
 *                eg user enter "15 .8" result is:  "You entered 15.8, the new value is 16".
                  eg user enter "15 .4" result is:  "You entered 15.4, the new value is 15". */

