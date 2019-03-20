package libraryPackage;

public class LibraryApplication {

	public static void main(String[] args) {
//Create a libraryMain and a LibraryBranch w/no values
	LibraryDataStorage libraryMain = new LibraryDataStorage();
//Create a book
	BookDataBase book1 = new BookDataBase();
	BookDataBase book2 = new BookDataBase();
	BookDataBase book3 = new BookDataBase();
	BookDataBase book4 = new BookDataBase();
	//create people
	Person cust1 = new Person("Ben", "Heilman", new AddressTemplate("943 Nana Lane", "Des Peres", "MO", 63131), "314-677-7840", "curlybenno@yahoo.com", 1);
	Person cust2 = new Person("Emily", "Heilman", new AddressTemplate("943 Nana Lane", "Des Peres", "MO", 63131), "314-566-6789", "heilman@yahoo.com", 2);
	Person cust3 = new Person("Chris", "Smith", new AddressTemplate("1 Jefferson Street", "St Louis", "MO", 63111), "314-Call-Home", "chris.smith@yahoo.com", 3);
//Create a branch
	BranchDataBase branch123 = new BranchDataBase();
//"getting' our variable, 'setAddress' and etc by calling our object with . 
	
	libraryMain.setAddress(new AddressTemplate("123 street", "stl", "MO", 766555)); 
	libraryMain.setNumberOfBooks(532643);
	libraryMain.setNumberOfStaff(23);
	libraryMain.setCostOfUpkeep(1589521);
//Creating book variables/attrubutes
	book1.setAuthor("Edgar Allan Poe");
	book1.setTitle("The Raven");
	book1.setNumberOfPages(52);
	book1.setIsbn(0);
	book2.setAuthor("Terry Goodkind");
	book2.setTitle("Wizards First Rule");
	book2.setNumberOfPages(235);
	book2.setIsbn(1);
	book3.setAuthor("Terry Goodkind");
	book3.setTitle("Stone Of Tears");
	book3.setNumberOfPages(276);
	book3.setIsbn(2);
	book4.setAuthor("Terry Goodkind");
	book4.setTitle("Blood of the Fold");
	book4.setNumberOfPages(259);
	book4.setIsbn(3);
//Create new branch
	branch123.setAddress("231 Manchester Rd - Des Peres, MO 63131");
	branch123.setNumberOfBooks(4);
	branch123.setNumberOfStaff(1);
	branch123.setCostOfUpkeep(120000);	
//create Book Array
	BookDataBase[] personBookList = new BookDataBase[4];
	
	
//set book array to Branch
	personBookList[0] = book1;
	personBookList[1] = book2;
	personBookList[2] = book3;
	personBookList[3] = book4;
	
//Assign personBookList array to 'Branch'
	 branch123.setBranchBookList(personBookList);

		
		
//create an Array of People
	Person[] personList = new Person[2];
//Assign into arrary
	personList[0] = cust1;
	personList[1] = cust2;
//assigning book to cust1
	//System.out.println("check time");
	cust1.setBookDataBase(new BookDataBase[] {book1, book2});
//Creating method to add a new customer and added a new customer.
Person[] personList1=new Person[personList.length +1];
for (int i = 0; i<personList.length; i++) {
personList1[i] = personList[i];
}
personList1[personList1.length-1] = cust3;
for (int i = 0; i < personList1.length; i++) {
	//system print out for cust1	
	System.out.println(personList1[i]);
}

}
//assigning personList1 info to cust profile
 

}

//Print info
	/*System.out.println("Headquarters is located at: " + libraryMain.getAddress());
	System.out.println("It houses " + libraryMain.getNumberOfBooks() + " books");
	System.out.println("There are a total of " + libraryMain.getNumberOfStaff() + " part-time and full-time staff employed here" );
	System.out.println("The total upkeep per year is: " + libraryMain.getCostOfUpkeep( ));
	System.out.println("It include the book " + book1.getTitle() + " by " + "Edgar Allan Poe");
	System.out.print(" and has " + book1.getNumberOfPages() + " pages" + ".  It is currently logged in as ISBN " + book1.getIsbn());
	System.out.print("There is second location at " + branch123.getAddress());
	
	*/
	


