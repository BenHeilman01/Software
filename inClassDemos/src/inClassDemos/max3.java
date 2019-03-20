package inClassDemos;

import java.util.Scanner;

public class max3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 numbers:");
		int v1 = input.nextInt();
		int v2 = input.nextInt();
		int v3 = input.nextInt();
		
		int max = max3(v1, v2, v3);
		System.out.println("The max number is: :"  + max);
		
	}

	public static int max3(int valueOne, int valueTwo, int valueThree) {

		int max = valueThree;
		if(valueOne > max) {
			max = valueOne;
				
		}
		if(valueTwo > max) {
			max = valueTwo;
		}
		return max;
	}

}

	
	