package wed_3_6;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter whole number: ");
		int inputNumber = keyboard.nextInt();
		
		if ((inputNumber % 4 == 0 && inputNumber % 100 != 0) || (inputNumber % 400 == 0))  {
			System.out.println(inputNumber + " is a leapyear");
		}
		else { System.out.println(inputNumber + " is not a leapyear");
		
		}

	}

}

/************* 7. Write a method to prompt the user for 4 digits representing a year. 
 * Then determine If Year Is a Leap Year. https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html  */
 