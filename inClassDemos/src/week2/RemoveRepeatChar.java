package week2;

public class RemoveRepeatChar {

	public static void main(String[] args) {
		System.out.println(reRepChar ("apple"));
		
	}
	
	public static String reRepChar(String word) {
		
	
		
		word = String.valueOf(word);
	    for(int i =0; i<word.length(); i++) {
	    	if(word.charAt(i) == letter) {
	    		result += word.charAt(i);
		
		
        String midCharMiss1 = String.valueOf(midCharMiss);
        
        
        //String sum = word - (word.charAt(midCharMiss1));
			
		//String sum = String.valueOf(word.charAt(midCharMiss));
		String sum = word.substring(0, midCharMiss) + word.substring(midCharMiss+1);
		return sum;
	}


}