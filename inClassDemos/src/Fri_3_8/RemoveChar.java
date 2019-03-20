package Fri_3_8;

public class RemoveChar {

public static void main(String[] args) {
	
	System.out.println(removeChars("india", "in"));
	
}

//Write Method
//1. Name of Method: removeChars
//2. args: String word, String CharsToBeRemoved
//3. return type: String
//4. Given word: "india", "in" result should "da"
public static String removeChars(String word, String charsToBeRemoved) {
	
	String result =word;
	//Loop
	for(int i=0; i < charsToBeRemoved.length(); i++) {
		result = removeChar(result, charsToBeRemoved.charAt(i));	
	}
	return result;
}


//Write Method
//1. Name of the Method: removeChar
//2. Args: String word, char letter
//3. return type:String
//Given word: "india", 'i' result should be "nda"

public static String removeChar(String word, char letter) {
	String result = "";
    for(int i =0; i<word.length(); i++) {
    	if(word.charAt(i) != letter) {
    		result += word.charAt(i);
    }
    }
	return result;
}
}
