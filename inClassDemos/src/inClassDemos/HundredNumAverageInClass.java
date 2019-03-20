package inClassDemos;

public class HundredNumAverageInClass {

	public static void main(String[] args) {

		int[]myList = {1,2,3};
		System.out.println(largestElementInArray(myList));
	}

	//Write a method
	//Method Name: largestElementInArray
	//args: int[] myList
	//return type:int
	// Given 1,2,3 the expected result is: 3
	
	public static int largestElementInArray(int[] myList) {
		
		int largest=0;
		for(int i =0; i<myList.length; i++) {
			
			if(myList[i] > largest) {
				largest = myList[i];
				
			}
			
		}
		
		return largest;
	}
	
	
}
