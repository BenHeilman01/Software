package inClassDemos;

import java.util.Scanner;

public class Median3 {

	public static void main(String[] args) {
	
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter 3 numbers:");
			int v1 = input.nextInt();
			int v2 = input.nextInt();
			int v3 = input.nextInt();
			
			int max = max3(v1, v2, v3);
			int min = min3(v1, v2, v3);
			int median = v1 + v2 + v3 - max - min;
			
			
			
			System.out.println("The Median number is " + median);
			
		
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



/*  Write a method called "median3" that computes the MEDIAN value of THREE 

integers. Hint: for the case of three numbers, the median is the value that is

NOT the maximum NOR the minimum, so add the three values and subtract out

the min and max, using the methods you wrote for problems #1 and #2. */