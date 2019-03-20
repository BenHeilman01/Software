package Fri_3_8;

import java.util.Scanner;

public class KioskChangeCalculator {
public static void main(String[] args) {
		
		returnChange();

	}

	private static void returnChange() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter change in 'xx' format:" + "");
		int changeAmount = input.nextInt();
		
		int quarters = 25;
		int dimes = 10;
		int nickels = 5;
		int pennies = 1;
		int amountOfQuarters = changeAmount / 25;
		int quarterConv = amountOfQuarters * quarters;
		int changeLeftQ = changeAmount - quarterConv;
		//changeLeftQ = 24 (change after quarters)
		int amountOfDimes = changeLeftQ / dimes;
		int changeLeftD = amountOfDimes * dimes;
		//System.out.println(changeLeftD);
		// 20 in nickels - 24 = 4 (change after dimes)
		int changeForNickels = changeLeftQ - changeLeftD;
		//System.out.println(changeForNickels);
		//get the change leftover (4)
		int amountOfNickels = changeForNickels/nickels;
		//System.out.println(amountOfNickels);
		//no nickels, still have to pretend there is
		int changeLeftN = amountOfNickels * 5;
		// Need to get carry the change reminder to pennies
		int changeForPennis = changeForNickels - changeLeftN;
		//System.out.println(changeForPennis)
		int amountOfPennies = changeForPennis;
		//to keep names consistent 
		
		
		System.out.print("Quarters: " + amountOfQuarters + "   ");
		System.out.print("Dimes: " + amountOfDimes + "   ");
		System.out.print("Nickels: " + amountOfNickels + "  ");
		System.out.print("Pennies: " + amountOfPennies);
		
	}
	
	
}


