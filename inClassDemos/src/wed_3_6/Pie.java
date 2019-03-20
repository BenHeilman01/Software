package wed_3_6;

import java.util.Scanner;

public class Pie {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Radius of a Circle");
		double radius = input.nextDouble();
		
		double circum = 2 * 3.14 * radius;
		double area2 = radius * radius;
		double area1 = 3.14 * area2;
		
		
		
		System.out.println("The Circumference of your Circle is " + circum);
		System.out.println("The Area of your Circle is " + area1);

	}

}

/* 1.Write a method to prompt the user to enter the radius of the circle
then calculate the area and circumference of the circle. */