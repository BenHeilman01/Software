package libraryPackage;

// Data storage for Books
public class BookDataBase {
// Add instances variables
	private String author;
	private int isbn;
	private String title;
	private int numberOfPages;
	
// Add a defult constructor

	public BookDataBase() {}
	
// Add a parameterized constructor

	public BookDataBase (String author, int isbn, String title, int numberOfPages) {
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.numberOfPages = numberOfPages;
	}
	
//Add getters / setters:
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return this.isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfPages(){
		return this.numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "BookDataBase [author=" + author + ", isbn=" + isbn + ", title=" + title + ", numberOfPages="
				+ numberOfPages + "]";
	}
	
}


