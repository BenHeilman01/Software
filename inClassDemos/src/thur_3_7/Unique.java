package thur_3_7;

public class Unique {

	public static void main(String[] args) {
			System.out.println(uniqueChar("big"));
		
	}
	
	public static Boolean uniqueChar(String word) {
		
		
Boolean result = true;	
	//Set word to lower
word = word.toLowerCase();
	//loop
for(int i = 0; i < word.length()-1; i++) {
	for(int j = i+1; j < word.length(); j++ ) {
		
	

	if (word.charAt(i) == word.charAt(j)){
	
	return false;
			 
	 }

	}
}	
return result;
	}
	
}
/****
1. Write a program to read an input and determine if a string has all unique characters */