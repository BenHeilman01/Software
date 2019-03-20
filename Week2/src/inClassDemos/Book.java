package inClassDemos;

public class Book {

private String title;
private String isbn;

public Book() {
	
	}
public Book(String title, String isbn) {
	this.title = title;
	this.isbn = isbn;
}
public String getTitle() {
	return this.title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getIsbn() {
	return this.isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}


}
