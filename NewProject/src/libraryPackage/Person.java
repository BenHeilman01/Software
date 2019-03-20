package libraryPackage;

import java.util.Arrays;

public class Person {
	private String firstName;
	private String lastName;
	private AddressTemplate address;
	private String phoneNumber;
	private String email;
	private int cardNumber;
	private BookDataBase [] personBookList = new BookDataBase[3];
	//private Person [] personBookList1 = new Person[4];
/**	Person cust1 = new Person("Ben", "Heilman", new AddressTemplate("943 Nana Lane", "Des Peres", "MO", 63131), "314-677-7840", "curlybenno@yahoo.com", 1);
	Person cust2 = new Person("Emily", "Heilman", new AddressTemplate("943 Nana Lane", "Des Peres", "MO", 63131), "314-566-6789", "heilman@yahoo.com", 2);
	Person cust3 = new Person("Chris", "Smith", new AddressTemplate("1 Jefferson Street", "St Louis", "MO", 63111), "314-Call-Home", "chris.smith@yahoo.com", 3);
	*/

public Person(String firstName, String lastName, AddressTemplate address, String phoneNumber, String email,
			int cardNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.cardNumber = cardNumber;
	}
public String getFirstName() {
	return this.firstName;
}

public AddressTemplate getAddress() {
	return this.address;
}
public void setAddress(AddressTemplate address) {
	this.address = address;
}
public String getPhoneNumber() {
	return this.phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return this.email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getCardNumber() {
	return this.cardNumber;
}
public void setCardNumber(int cardNumber) {
	this.cardNumber = cardNumber;	
}
public BookDataBase[] getBookDataBase() {
	return this.personBookList;
}
public void setBookDataBase(BookDataBase[] personBookList) { 
	this.personBookList = personBookList;
}


public void checkOut(BranchDataBase branch, BookDataBase book) {
	
	}

@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phoneNumber="
			+ phoneNumber + ", email=" + email + ", cardNumber=" + cardNumber + ", personBookList="
			+ Arrays.toString(personBookList) + "]";
}
//copy person list to Person Class
//Creating method to add a new customer and added a new customer.

//create an Array of People
/*	Person[] personList = new Person[2];
//Assign into arrary
	personList[0] = cust1;
	personList[1] = cust2;

Person[] personList1=new Person[personList.length +1];

for (int i = 0; i<personList.length; i++) {

personList1[i] = personList[i];

}
personList1[personList1.length-1] = cust3;

//system print out for cust1	
for (int i = 0; i < personList1.length; i++) {
//System.out.println(personList1[i]);
}
*/


}
	
