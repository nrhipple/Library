package library;

import java.util.ArrayList;

public class LibrarySystem {
	
	//TODO:
	//
	//
	
	// ArrayLists for Library Books and Patrons
	ArrayList<Book> library = new ArrayList<Book>();
	ArrayList<Patron> patrons =  new ArrayList<Patron>();
	
	public void addBook(String title, String firstName, String lastName, int copies) {
		Book book = new Book(title, firstName, lastName, copies);
		library.add(book);
		
	}
	
	public void addPatron(String firstName, String lastName) {
		Patron patron = new Patron(firstName, lastName);
		patrons.add(patron);
	}
	
	
	
}
