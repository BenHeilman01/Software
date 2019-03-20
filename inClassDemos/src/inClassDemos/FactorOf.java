package inClassDemos;

import java.util.Scanner;

public class FactorOf {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter A Whole Number ");
		int k = keyboard.nextInt();
		
		System.out.println("Enter Another Whole Number ");
		int n = keyboard.nextInt();
		


        //You DO NOT NEED loop for question 5...
      //  for(int i = 1; i < k; ++i) {
           
        	//your previous condition was if(n == i)
        	if (n % k == 0) {
        		System.out.println(k +" is a Factor of "+ n);
        	}
            
        	else {    	
        		System.out.println(k +" is not a Factor of "+ n);
        		
        	}
                

        	 }
        	 
        	
        	{
        		
        		
        	
        	}
        	}
            
        
	

	
	
    



/* 5. Write a method "isFactor" which takes two integers (k and n) and returns true iff



("if and only if") k is a factor of n.


 6. Write a method "isPerfect" which takes an integer and returns true iff that 

   integer is a perfect number  Your method MUST call the "isFactor" method you 

   wrote for problem #5.
 
 */

