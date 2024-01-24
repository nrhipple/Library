package library;

public class Book {
	String title;
	String authorFirstName;
	String authorLastName;
	int numberOfCopies = 0;
	
	/**This is a constructor for a book object.
	 * 
	 * @param title is the title of the book
	 * @param firstName is the Author's first name
	 * @param lastName is the Author's last name
	 * @param copies is the number of copies in the library
	 */
	
	public Book (String title, String firstName, String lastName, int copies) {
		this.title = title;
		this.authorFirstName = firstName;
		this.authorLastName = lastName;
		this.numberOfCopies = copies;
	}
	
	//Getter and Setter methods, for adjustments
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setFirstName(String firstName) {
		this.authorFirstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.authorLastName = lastName;
	}
	
	public void setNumberOfCopies(int copies) {
		this.numberOfCopies = copies;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getFirstName() {
		return this.authorFirstName;
	}
	
	public String getLastName() {
		return this.authorLastName;
	}
	
	public int getNumberOfCopies() {
		return this.numberOfCopies;
	}

}
