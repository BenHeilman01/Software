package Fri_3_8;

public class CountOccurrences {

	public static void main(String[] args) {
		
    char[] myChars = {'a', 'b', 'a', 't', 'f'};
    
    System.out.println(countOccurrences(myChars));
	}

	
	//1. countOccurrences
	//2. args: char[]: int
	//3. return type: int
	// Given ['a', 'b', 'a', 't', 'f'] return 2
	
	public static int countOccurrences(char[] myCharArray) {
		int count = 0;
		for(int i=0; i<myCharArray.length; i++) {
			char lowerA = 'a';
			char upperA = 'A';
			if(myCharArray[i]==lowerA || myCharArray[i] == upperA) {
			count++;	
				
			}
		}
		
		return count;	
}
}