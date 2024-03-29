package library;


public class Patron {
	
	
	String firstName;
	String lastName;
	final int BOOK_LIMIT = 3;
	Book[] borrowedBooks = new Book[BOOK_LIMIT];
	int counter = 0;
	
	
	/**
	 * Constructor for the Patron Object.
	 * 
	 * @param firstName is the first name of the Patron. 
	 * @param lastName is the last name of the Patron.
	 */
	
	public Patron(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Setter and Getter methods.
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public Book[] getBorrowedBooks() {
		return this.borrowedBooks;
	}
	
	/**
	 * This method is to used to put the Book Object into the 
	 * borrowedBooks array.
	 * 
	 * @param borrowedBook is the book about to be borrowed
	 */
	
	public void borrowBook(Book borrowedBook) {
		this.borrowedBooks[this.counter] = borrowedBook;
		this.counter ++;
	}
}
