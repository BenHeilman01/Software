package thur_3_7;

public class ReverseWord {

	public static void main(String[] args) {
		
		String wordReversed = reverseWord("JAVA");
		System.out.println(wordReversed);

	}
	
	//Write a method
	//1. Name of Method: reversWord
	//2. args: String respresnting the word
	//3. Return type: String
	//4. Given the word JAVA result => AVAJ
	//                  0123
	
	public static String reverseWord(String word) {
		String result = "";
		//loop
		for(int i=0; i<word.length(); i++) {
			result = word.charAt(i) + result;
			
		}
		
		return result;
	}
	
	
	
	
	
	
	

}
