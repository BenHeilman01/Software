package phoneBook;

import java.util.Arrays;
import java.util.Comparator;

import phoneBook.Address;

public class Person implements Comparable<Person> {

	private String firstName;
	private String middleName;
	private String lastName;
	private Address address;
	private String phoneNumber;
	private Person[] nameCustList;
	private Person[] oGList;

	
public Person(String firstName, String middleName, String lastName, Address address, String phoneNumber) {
	
//Constructor
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;

		

}

//Default constructor
public Person() {}

public String getFirstName() {
	return this.firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return this.middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return this.lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Address getAddress() {
	return this.address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getPhoneNumber() {
	return this.phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
//public void getNameCustList() {
	//return this.nameCustList[];
//}
//public void setNameCustList() {

@Override
public String toString() {
	return "Person [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", address="
			+ address + ", phoneNumber=" + phoneNumber  + "]";
}
    // Used for sorting in ascending order of 
    // roll name 
   
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return firstName.compareTo(o.firstName); 
	} 

}