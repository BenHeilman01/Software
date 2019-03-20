package inClassDemos;

import java.util.Scanner;

public class Min3 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 numbers:");
		int v1 = input.nextInt();
		int v2 = input.nextInt();
		int v3 = input.nextInt();
		
		int min = min3(v1, v2, v3);
		System.out.println("The max number is: :"  + min);
		
	}

	public static int min3(int valueOne, int valueTwo, int valueThree) {

		int min = valueThree;
		if(valueOne < min) {
			min = valueOne;
				
		}
		if(valueTwo < min) {
			min = valueTwo;
		}
		return min;
	}

}

