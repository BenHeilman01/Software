package Fri_3_8;

public class HighOccurrence {

	public static void main(String[] args) {
		
		System.out.println(highOccurrence("aaaabbcc"));
		
	}

	//Write a method
	//1. Name of method
	//2. args: String word
	//3. return type: char
	// example of result: given "aaabbccd" => a
	public static char highOccurrence(String word) {
		char result = '\u0000';
		int totalResultCount = 0;
		//Loop then keep track of the occurrences
		for(int i = 0; i<word.length()-1;i++) {
			int tempInnerCounter = 0;
			//if(result != tempOutterChar) {
			char tempOutterChar = word.charAt(i);
			for (int j = (i+1); j<word.length(); j++) {
				char tempInnerChar = word.charAt(j);
				if(tempOutterChar == tempInnerChar) {
					tempInnerCounter++;
				}
			}
			if(totalResultCount < tempInnerCounter) {
				result = tempOutterChar;
				totalResultCount = tempInnerCounter;
			}
		}

		return result;
	}
	
}
