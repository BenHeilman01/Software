package inClassDemos;

import java.util.Scanner;

public class Xclusive {

	public static void main(String[] args) {
	
//Want to catch people either over 65 or more then $500.  Not both or neither.	
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Amount Of Money ");
		int money = keyboard.nextInt();
		
		System.out.println("Enter Age ");
		int age = keyboard.nextInt();	
		
		if (age > 65 && money < 500) {
		System.out.println("Accepted!");
		
	}
		else if (age < 65 && money > 500) {
		System.out.println("Accepted!!");
		}
		else {  System.out.print("Rejected :("); 
			
		}
		}
}



/*
4. Write a method called "xor" that takes two boolean values (either true or false) 

and returns a boolean value which is true if EITHER of the values is true BUT

NOT BOTH of them. This is called the "xor" function, or "eXclusive OR" (where 

we are excluding the case where both values are true). */