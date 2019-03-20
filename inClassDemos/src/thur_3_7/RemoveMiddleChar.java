package thur_3_7;

public class RemoveMiddleChar {

	public static void main(String[] args) {
		System.out.println(removeMid ("big"));
		
	}
	
	public static String removeMid(String word) {
		
	
		
		word = String.valueOf(word); 
		word.length();
		int aLength = word.length();
		int midCharMiss = aLength / 2;
		
		
        String midCharMiss1 = String.valueOf(midCharMiss);
        
        
        //String sum = word - (word.charAt(midCharMiss1));
			
		//String sum = String.valueOf(word.charAt(midCharMiss));
		String sum = word.substring(0, midCharMiss) + word.substring(midCharMiss+1);
		return sum;
	}


}
//4. Write a program to remove the middle character of 
//   a string. eg input "stack" output:"stck", input "banana" output: "bana" 