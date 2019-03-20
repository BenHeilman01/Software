
public class FactorOf2 {

	public static void main(String[] args) {
		
		boolean  factor = isFactor(5,6);
		
		System.out.println("Factor: " +factor);
		
	}
		public static boolean isFactor(int k, int n) {
			
			if (n % k  == 0) {
				//This is an even number
				return true;
			}
			
				//this is odd number
				return false;
				
				
}
		public static boolean isPerferct(int num) {
			//Need to stor the sum of all factors
			int sumOfFactor = 0;
			//Loop from 1 until n-1
			for(int i = 1; i < num; i++) {
				//check if each count is a factor of num
				boolean validateIsFactor = isFactor(i, num);
				if(validateIsFactor) {
					
				sumOfFactor = sumOfFactor +i;
				
					
				}
					//Then if true add to the sum
				
				
				
				
			}
			
			//check if the sum is = to the given num
			if(sumOfFactor == num) {
				return true;
			}
			return false;
		}


	
//*********
//1. Write a method
//2. Name of method: isPrime
//3. args: int
//4. should return: boolean
//5. need to use isFactor?

	public static boolean isPrime(int num) {
		//Need to loop
		for(int i = 2; i < num; i++) {
		//check if there is at least one factor
		//if there at least one factor we should return
		//false
		if(isFactor(i, num)) {
			return false;
			
		}
			
		}	
		//return true because this is a prime number
		    return true && num>1;
		}
		
		
	
	}
