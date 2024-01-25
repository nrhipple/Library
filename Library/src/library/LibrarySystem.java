package library;

import java.util.ArrayList;

public class LibrarySystem {
	
	//TODO:
	//1: create a method to add a book to the Library
	//2: create a method to have a patron rent a book
	
	ArrayList<Book> library = new ArrayList<Book>();
	
	public void addBook(String title, String firstName, String lastName, int copies) {
		Book book = new Book(title, firstName, lastName, copies);
		library.add(book);
		
	}
	
	
	
}
