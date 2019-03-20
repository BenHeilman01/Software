package wed_3_6;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please base/width and height of your triangle:");
		int base = input.nextInt();
		int height = input.nextInt();
		int area = base * height / 2;
				
		System.out.println("The area of your triangle is: " + area);
		

	}

}
