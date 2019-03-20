package thur_3_7;

public class EvenOddChar {

	public static void main(String[] args) {
	
		
		String sentence = "A statement";
		String allUnique = "abcdefg"; 
		
		String storeword = "";
		for (int i = 0; i < sentence.length(); i++){ 
		if (i % 2 == 0) storeword += Character.toString(sentence.charAt(i)).toUpperCase();
		else storeword += Character.toString(sentence.charAt(i)).toLowerCase();
			
		
		}
		
		System.out.println(storeword);
		//System.out.println(sentence.toUpperCase(i));
	}
}


//1. Write a program to read an input and determine if a string has all unique characters. /*

//2. Write a program to convert every even position to upper case and every odd position to lower case. eg input "Banana" output :"bAnAnA" or input "StLouis" output:"sTlOuIs"


//