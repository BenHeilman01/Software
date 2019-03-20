package inClassDemos;
import java.util.Scanner;

public class NameAndAge {

		public static void main(String[] args) {
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter Name ");
			String name = keyboard.nextLine();
			
			System.out.println("Enter Age ");
			int age = keyboard.nextInt();
			
			//System.out.println(name + " " + age);
			
			
			

			//System.out.println(name + number);
				
			System.out.println("Hi " + name + " 5 years from now, you will be " + (age + 5) + " years old.");
		
			


		}

	}