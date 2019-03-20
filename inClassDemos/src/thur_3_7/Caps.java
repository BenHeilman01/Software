package thur_3_7;

public class Caps {

	public static void main(String[] args) {

		String convertWord = evenUpOddLow("apple");
		System.out.println(convertWord);
		
	}
	//write a method
	
	//name of the method: evenUpOddLow
	//args: String word
	//Return type: String
	//result should: 'Apple' 'ApPlE'
		public static String evenUpOddLow(String word) {
				
		
		String result = "";	
			//Set word to lower
		word = word.toLowerCase();
			//loop
		for(int i = 0; i < word.length(); i++) {
			//if statement to check if divisable by 2, evenly
			if(i%2 == 0) {
			//this is even
				String temp = String.valueOf(word.charAt(i));
				temp = temp.toUpperCase();
				result = result+temp; 
			
			 }
			else {
				//This odd
				result = result + word.charAt(i);
				
			}
			
		}	
		return result;
		
		}

	}


