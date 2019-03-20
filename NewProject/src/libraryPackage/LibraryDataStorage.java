package libraryPackage;

// Data storage for libraryPackage
public class LibraryDataStorage {
//Add instance variables
	private AddressTemplate address;
	private int numberOfBooks;
	private int numberOfStaff;
	private int costOfUpkeep;
	
//Add a default constructor
	
	public LibraryDataStorage() {}

//Add a parameterized constructor
	
	public LibraryDataStorage (String address, int numberOfBooks, int numberOfStaff, int costOfUpkeep) {
		
		this.numberOfBooks = numberOfBooks;
		this.numberOfStaff = numberOfStaff;
		this.costOfUpkeep = costOfUpkeep;
	}

//Add getters / setters:
	public AddressTemplate getAddress() {
		return this.address;
	}
	public void setAddress(AddressTemplate address) {
		this.address = address;
	}
	public int getNumberOfBooks() {
		return this.numberOfBooks;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	public int getNumberOfStaff() {
		return this.numberOfStaff;
	}
	public void setNumberOfStaff(int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}
	public int getCostOfUpkeep() {
		return this.costOfUpkeep;
	}
	public void setCostOfUpkeep(int costOfUpkeep) {
		this.costOfUpkeep = costOfUpkeep;
	}
}

