package thur_3_7;

public class SumLimit {

	public static void main(String[] args) {
	
		System.out.println(sumLimit(2,9));
		
	}
	
	public static int sumLimit(int a, int b) {
		
		int sum = a + b;
		
		
		String word = String.valueOf(a);
		word.length();
		int aLength = word.length();
		
		String word2 = String.valueOf(sum);
		word2.length();
		int sumLength = word2.length();
		
		
		if (sumLength > aLength) {
			return a;
		
			}
		else { return sum;
		}
		
		
		
		}

	}






/**** Write a method for each of the following
Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number
 of digits as a.
 If the sum has more digits than a, just return a without b. 
Test cases
sumLimit(2, 3)  5
sumLimit(8, 3)  8
sumLimit(8, 1)  9
*/