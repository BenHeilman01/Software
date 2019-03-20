package week2;

public class HundredNumAverage { 
	
	public static void main(String[] args){
		int[]myList = {1, 2, 3};
		System.out.println(hundredNumArg(myList));

//Given [1,2,3] return should be 1
	}
	public static int hundredNumArg(int[] myList) { 
		int totalAboveAverage = 0;
		int average = averageOfArray(myList);
		for(int i=0; i<myList.length; i++) {
		if(myList[i]>average ) {
			totalAboveAverage++;
		 }
			
		}
		return totalAboveAverage;
	}
	
	//1. Method Name: averageOfArray
	//2. args: int[] myList
	//3. return type: int
	//4. Given [1,2,3] result should be 2:
	
	public static int averageOfArray(int[] myList) {
		int sum = sumOfArray(myList);
		int calcAvg = sum/myList.length;
		return calcAvg;
	}
	
	//Method name: sum
	//args: int[]myList
	//return type: int
	//Given [1,2,3] result should be 6
	
	public static int sumOfArray(int[] myList) {
		int sum=0;
		for(int i=0; i<myList.length; i++) {
			
		}
		return sum;
	}
	}

