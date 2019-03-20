package phoneBook;

import java.util.Arrays;
import java.util.Scanner;



public class PHApplication {

	static Person[] oGList = new Person[0];
	
	
	public static void main(String[] args) {

//Base list of customers for Phone book
		Boolean altF4 = false;
		do{
	{
// My print out screen.
			System.out.println("Please enter the number of the action you would like to perform: ");
			System.out.println("1. Add a new record");
			System.out.println("2. Delete a current record");
			System.out.println("3. Search Phone Book for record by first name");
			System.out.println("4. Search Phone Book for record by last name");
			System.out.println("5. Search Phone Book for record by complete full name");
			System.out.println("6. Search Phone Book for record by telephone number");
			System.out.println("7. Search Phone Book for record by city");
			System.out.println("8. Search Phone Book for record by state");
			System.out.println("9. Search Phone Book for entire record");
			System.out.println("10. Update record by phone number");
			System.out.println("11. To exit program");  
		}
//Request input from user
	{		Scanner keyboard = new Scanner(System.in);
			int number = keyboard.nextInt();
			
			switch(number) {
			case 1:
				 System.out.println("Please enter record you would like to add in this format: ");
				 System.out.println("John E Doe, 324 Main St, St Charles, MO, 63303, 8475390126");
				 keyboard.nextLine();		
					String newRecord = keyboard.nextLine();
					oGList =entryRecord(newRecord, newRecord);
				break;
			case 2:
				System.out.println("Search by telephone number in xxxxxxxxxx format:");
				keyboard.nextLine();		
				String delete = keyboard.nextLine();
				oGList= deleteName(delete);
				break;
			case 3:
				System.out.println("Please enter the first name of the person you would like to search:");
				keyboard.nextLine();		
				String searchFirstName = keyboard.nextLine();
				searchByFirstName(searchFirstName);
				break;
			case 4:
				System.out.println("Please enter the last name of the person you would like to search:");
				keyboard.nextLine();		
				String searchLastName = keyboard.nextLine();
				searchByLastName(searchLastName);
				break;
			case 5:
				System.out.println("Please enter the complete name of the person you would like to search:");
				keyboard.nextLine();		
				String searchCompleteName = keyboard.nextLine();
				searchByCompleteName(searchCompleteName);
				break;
			case 6:
				System.out.println("Please enter the telephone number you would like to search by:");
				keyboard.nextLine();		
				String searchTelephone = keyboard.nextLine();
				searchByTelephone(searchTelephone);
				break;
			case 7:
				System.out.println("Please enter the city you would like to search by:");
				keyboard.nextLine();		
				String searchCity = keyboard.nextLine();
				searchByCity(searchCity);
				break;
			case 8:
				System.out.println("Please enter the state you would like to search by:");
				keyboard.nextLine();		
				String searchState = keyboard.nextLine();
				searchByState(searchState);
				break;
			case 9:
				Arrays.sort(oGList);
				
				for (int i = 0; i < oGList.length; i++)
				{
					System.out.println(oGList[i]);
				}
				break;
			case 10:
				System.out.println("Search by telephone number in xxxxxxxxxx format:");
				keyboard.nextLine();		
				String delete2 = keyboard.nextLine();
				oGList= deleteName2(delete2);
				System.out.println("Please enter the complete modified record in the following format:");
				System.out.println("Bunny E Doe, 324 Main St, St Charles, MO, 63303, 8475390126");
				String newRecord2 = keyboard.nextLine();
				oGList =entryRecord(newRecord2, newRecord2);
				System.out.println("Record modified");
				break;
			case 11:
				while(altF4);
				return;
				
			
			default:
				System.out.println("Please enter a number 1-9");
				break;
			
			}
				
	    }
		}while(!altF4);

		
}//---------------------------end of main method
	private static void searchByCompleteName(String searchCompleteName) {
		boolean result = false;
		{
			String[] nameSearchList = searchCompleteName.split(" ");
			for (int c=0; c< oGList.length; c++) {
			if(nameSearchList.length == 3 && oGList[c].getFirstName().equalsIgnoreCase(nameSearchList[0]) && oGList[c].getMiddleName().equalsIgnoreCase(nameSearchList[1]) && oGList[c].getLastName().equalsIgnoreCase(nameSearchList[2])) {     
				System.out.println("Person Found!!! ");
				System.out.println(oGList[c]);
				result = true;
							
					}

			if(nameSearchList.length == 2 && oGList[c].getFirstName().equalsIgnoreCase(nameSearchList[0]) && oGList[c].getLastName().equalsIgnoreCase(nameSearchList[1]))	{
				System.out.println("Person Found!!! ");
				System.out.println(oGList[c]);
				result = true;
			}
			if(nameSearchList.length == 1)
				System.out.println("Person not Found");
				result = false;
				
			 if (result = false) {
				 System.out.println("Person not found");
		}
		}
		}
	}
	private static Person[] deleteName2(String delete2) {
		boolean result = false;
		Person[] finalList =new Person[oGList.length -1];
        int delIndex =0;
        
        //Find the position of person to be deleted
		for (int i=0;i < oGList.length;i++)
		{
			if(oGList[i].getPhoneNumber().trim().equals(delete2)) 
			{
				delIndex = i;
				result = true;
				break;
		}
		}
		
		for (int i=0;i < oGList.length;i++)
		{
			//copy and print all the remaining people in the new list
			if(i != delIndex && i < delIndex)
			{
				finalList[i] = oGList[i] ;
				System.out.println("Record Deleted");
				System.out.println(finalList[i]);
		}
			else if(i > delIndex)
			{
				finalList[i-1] = oGList[i] ;
				System.out.println("Record Deleted");
				System.out.println(finalList[i-1]);
		}
		}
	
	 		if (result == false)
			 System.out.println("Person not found");
			return finalList;
	}
	private static Person[] deleteName(String delete) {
		boolean result = false;
		Person[] finalList =new Person[oGList.length -1];
        int delIndex =0;
        
        //Find the position of person to be deleted
		for (int i=0;i < oGList.length;i++)
		{
			if(oGList[i].getPhoneNumber().trim().equals(delete)) 
			{
				delIndex = i;
				result = true;
				break;
		}
		}
		
		for (int i=0;i < oGList.length;i++)
		{
			//copy and print all the remaining people in the new list
			if(i != delIndex && i < delIndex)
			{
				finalList[i] = oGList[i] ;
				System.out.println("Record Deleted");
				System.out.println(finalList[i]);
		}
			else if(i > delIndex)
			{
				finalList[i-1] = oGList[i] ;
				System.out.println("Record Deleted");
				System.out.println(finalList[i-1]);
		}
		}
	
	 		if (result == false)
			 System.out.println("Person not found");
			return finalList;
	}
	private static void searchByState(String searchState) {
		boolean result = false;
		for (int i=0;i < oGList.length;i++)
		{
			if(oGList[i].getAddress().getState().trim().equals(searchState)) 
		{
				System.out.println("Person Found!!! ");
				System.out.println(oGList[i]); 
				result = true;
				break;
		}
		}
			 if (result == false)
			 System.out.println("Person not found");
	}
	private static void searchByCity(String searchCity) {
		
		boolean result = false;
		for (int i=0;i < oGList.length;i++)
		{
			if(oGList[i].getAddress().getCity().trim().equals(searchCity)) 
		{
				System.out.println("Person Found!!! ");
				System.out.println(oGList[i]); 
				result = true;
				break;
			}
		}
			 if (result == false)
			 System.out.println("Person not found");
		
	}
	private static void searchByTelephone(String searchTelephone) {
		
		boolean result = false;
		for (int i=0;i < oGList.length;i++)
		{
			if(oGList[i].getPhoneNumber().trim().equals(searchTelephone)) 
		{
				System.out.println("Person Found!!! ");
				System.out.println(oGList[i]); 
				result = true;
				break;
		}
		}
			 if (result == false)
			 System.out.println("Person not found");
	}
	private static void searchByLastName(String searchLastName) {
		
		boolean result = false;
		for (int i=0;i < oGList.length;i++) {
			if(oGList[i].getLastName().equalsIgnoreCase(searchLastName)) {
				System.out.println("Person Found!!! ");
				System.out.println(oGList[i]);
				result = true;
				break;
		}
	}
			if(result == false)
			 System.out.println("Person not found");
		}
		
		private static void searchByFirstName(String searchFirstName) {
		for(int i=0;i < oGList.length;i++)
		{
			if(oGList[i].getFirstName().equalsIgnoreCase(searchFirstName))
			{
				System.out.println("Person Found!!!  ");
				System.out.println(oGList[i]);
				}
				else { System.out.println("Person not found");
			}
			}
		
		
	}
	public static Person[] entryRecord(String newRecord, String newRecord2){
		//System.out.println("we are here");
		//new record aaray made by spliting inputs by ' , ' 
		String[] custList = newRecord.split(",");
		//new record aray made by splitting by space ' ' 
		String[] nameCustList = custList[0].split(" ");
		//create temp person to fit into 2nd array, nameCustList
		
		Person tempPerson = new Person();
//		for (int c = 0;c<=nameCustList.length; c++)
		if (nameCustList.length == 2) {
		tempPerson.setFirstName(nameCustList[0]);
		tempPerson.setLastName(nameCustList[1]);
		}			
		else { 
		tempPerson.setFirstName(nameCustList[0]);
		tempPerson.setLastName(nameCustList[2]);
		tempPerson.setMiddleName(nameCustList[1]);
		}
		
		tempPerson.setAddress(new Address(custList[1],custList[2],custList[3],custList[4]));
		tempPerson.setPhoneNumber(custList[5]);
		
		//put tempPerson into nameCustList
		
		Person[] finalList =new Person[oGList.length +1];
		for (int i = 0; i<oGList.length; i++) {
			finalList[i] = oGList[i];
		}
		finalList[finalList.length-1] = tempPerson;
		

 			for (int i = 0; i < finalList.length; i++) {
				//system print out for cust1	
			System.out.println(finalList[i]);
			//System.out.println(finalList[0] + " was added.");
			
		}
 			return finalList;

	}
	public static Person[] entryRecord2(String newRecord2){
		//System.out.println("we are here");
		//new record aaray made by spliting inputs by ' , ' 
		String[] custList = newRecord2.split(",");
		//new record aray made by splitting by space ' ' 
		String[] nameCustList = custList[0].split(" ");
		//create temp person to fit into 2nd array, nameCustList
		
		Person tempPerson = new Person();
//		for (int c = 0;c<=nameCustList.length; c++)
		if (nameCustList.length == 2) {
		tempPerson.setFirstName(nameCustList[0]);
		tempPerson.setLastName(nameCustList[1]);
		}			
		else { 
		tempPerson.setFirstName(nameCustList[0]);
		tempPerson.setLastName(nameCustList[2]);
		tempPerson.setMiddleName(nameCustList[1]);
		}
		
		tempPerson.setAddress(new Address(custList[1],custList[2],custList[3],custList[4]));
		tempPerson.setPhoneNumber(custList[5]);
		
		//put tempPerson into nameCustList
		
		Person[] finalList =new Person[oGList.length +1];
		for (int i = 0; i<oGList.length; i++) {
			finalList[i] = oGList[i];
		}
		finalList[finalList.length-1] = tempPerson;
		

 			for (int i = 0; i < finalList.length; i++) {
				//system print out for cust1	
			System.out.println(finalList[i]);
			//System.out.println(finalList[0] + " was added.");
			
		}
 			return finalList;

	}
	
	}//-----------------------end of class
