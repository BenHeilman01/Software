package week2;

import java.util.stream.IntStream;

public class ArraySum {

	
	public static void main(String[] args) {

		System.out.println(arraySum(1, 10));
	}

	public static int arraySum(int n, int m) {
	
	//Declaring array
		//int[]myList;
		//myList = new int[100];
		int [] myList = new int[5];
			myList[0]=5;
			myList[1]=5;
			myList[2]=5;
			myList[3]=5;
			myList[4]=5;
		    int sum = IntStream.of(myList).sum();
		   //this is the sum of all int in array. 
		    

			
			int result = sum;
			
			return result;
			
		}


		
	}


//2. write a program to find the sum of an array.