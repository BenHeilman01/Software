package inClassDemos;

public class Aaray {

	public static void main(String[] args) {

	//[book1, book2, book3] - Array of objects	
		
	int[] myNumberArray = {1,3,5,67};
	
	for(int i=0; i<myNumberArray.length; i++) {
		int element = myNumberArray[i];
		System.out.println(element);
	}
	boolean[] myBooleanArray = {false, true, false, false};
		for(int i=0; i<myBooleanArray.length; i++) {
			boolean element = myBooleanArray[i];
		System.out.println(element);
		}
	
	}
	Book book1 = new Book("The", "33321");
	Book book2 = new Book("The1", "33320");
	Book book3 = new Book("The2", "33319");
	{
	Book[] booksArray = {book1,book2,book3};
	
	for(int i=0; i<booksArray.length; i++) {
		Book element = booksArray[i];
		System.out.println(element.getTitle());
	}
	

}
	{
	int[][] my2DArray = { { 1,3,5} , {8,10,7} , {2,4,6}};
	
	for(int i = 0; i<my2DArray.length; i++) {
		int[] elements = my2DArray[i];
	for(int j = 0; j<elements.length; j++) {
		int element = elements[j];
		System.out.println(i+"-"+j+" : "+element);
	}
	}
	}
}