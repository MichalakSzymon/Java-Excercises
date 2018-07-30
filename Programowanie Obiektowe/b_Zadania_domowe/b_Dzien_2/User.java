package b_Zadania_domowe.b_Dzien_2;

import java.util.Arrays;

public class User extends Person {
	
	protected Book [] books={};
	private int id;
	private static int nextId=0;
	
	public User(String firstName, String lastName) {
		super(firstName, lastName);
		this.id = nextId; 
		this.nextId++;
	}
	
	public void returnBook(Book book) {
		book.currentUser=null;
		book.setAvaible(true);
		for(Book userBooks: books) 
			if(userBooks.getId()==book.getId()) userBooks=null;
	}
		
	public void returnAllBooks () {
		for(Book userBook: books) {
			userBook.currentUser=null;
			userBook.setAvaible(true);
		}
		this.books=new Book [0];
		
	}
	
	// metoda pomocnicza do testów
	public int count () {
		int count=0;
		for(Book userBooks: books) count++;
		return count;
	}
	
	public void borrowedBooks() {
		String [] str = new String [this.count()];
		for(int i=0; i<count(); i++) 
			str[i]= books[i].getTitle() + ", " + books[i].getAuthor();
		System.out.println(Arrays.toString(str));
	}
}
