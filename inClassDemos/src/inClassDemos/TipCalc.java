package inClassDemos;




public class TipCalc {

	public static void main(String[] args) {
	
		double mealAmount = 33.57;
		String service = "Great";
		
		double tip = getTip(mealAmount, service);

		// Define the quote function
		// Parameters Service, tipPercent
		
	}

	public static double getTip(double mealAmount, String service) {
		System.out.println("computeTip");
		System.out.println("Service was: " + service);

	


	// Define the variables
		double totalTip = 0;
	
		

	// Determine service and meal amount
		if (service == "Great") {
			totalTip =  .26 * mealAmount;	
			System.out.println("Total tip is: " + totalTip);
			
		}
		else if (service == "Good") {
			totalTip =  .22 * mealAmount;	
			System.out.println("Total tip is: " + totalTip);
		}
		else if (service == "Poor") {
			totalTip = .16 * mealAmount;
			System.out.println("Total tip is: " + totalTip);
			
			
		}
	// Calculate tip
		

	/* Tip Recommender Write a function that returns the recommended tip based on the amount of the tab and the service performed. 
	 * Use the following table to calculate the tip: Service Quality  Tip 
Percent
Poor    16% 
Good   22% 
Great   26% 

computeTip(33.57, "Great")
RESULT:    8.7282         

  */

		
		return totalTip;
}
}
