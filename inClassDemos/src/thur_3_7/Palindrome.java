package thur_3_7;

public class Palindrome {

	public static void main(String[] args) {
		
		Boolean wordReversed = reverseWord("JAVA");
		System.out.println(wordReversed);

	}
	
	//Write a method
	//1. Name of Method: reversWord
	//2. args: String respresnting the word
	//3. Return type: String
	//4. Given the word JAVA result => AVAJ
	//                  0123
	
	public static Boolean reverseWord(String word) {
		Boolean result = true;
		//loop
		for(int i=0; i<word.length(); i++) {
			String reversed = word.charAt(i) + word;

			System.out.println(reversed);
		}
		
		return result;
	}
	
	
	
	
	
	
	

}