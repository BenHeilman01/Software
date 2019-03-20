package libraryPackage;



// Data storage for Books
public class BranchDataBase {
// Add instances variables
	private String address;
	private int numberOfBooks;
	private int numberOfStaff;
	private int costOfUpkeep;
	private BookDataBase [] branchBookList = new BookDataBase[4];
//Add a default constructor
	
	public BranchDataBase() {}
	
//Add a parameterized construtor
	
	public BranchDataBase (String address, int numberOfBooks, int numberOfStaff, int costOfUpkeep) {
		this.address = address;
		this.numberOfBooks = numberOfBooks;
		this.numberOfStaff = numberOfStaff;
		this.costOfUpkeep = costOfUpkeep;
	}
	
//Add getters and setters
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
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
	public void setCostOfUpkeep(int costOfUpkeep){
		this.costOfUpkeep = costOfUpkeep; 
	}

	public BookDataBase[] getBranchBookList() {
		return branchBookList;
	}

	public void setBranchBookList(BookDataBase[] branchBookList) {
		this.branchBookList = branchBookList;
	}

		

			
		

		}
		
	

