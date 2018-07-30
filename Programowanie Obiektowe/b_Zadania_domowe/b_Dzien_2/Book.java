package b_Zadania_domowe.b_Dzien_2;

import java.util.Arrays;

public class Book {
	private int id;
	private String title;
	private boolean avaible=true;
	private int popularity=0;
	public	Author	author;
	public Author [] additionalAuthors;
	public User user;
	public User currentUser;
	
	
	Book (int id, String title) {
		this.id=id;
		this.title=title;
	}
	
	Book (int id, String title, Author author) {
		this.id=id;
		this.title=title;
		this.author=author;
	}
	
	Book (int id, String title, Author author, Author [] additionalAuthors) {
		this.id=id;
		this.title=title;
		this.author=author;
		this.additionalAuthors=additionalAuthors;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isAvaible() {
		return avaible;
	}

	public void setAvaible(boolean avaible) {
		this.avaible = avaible;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author[] getAdditionalAuthors() {
		return additionalAuthors;
	}

	public void setAdditionalAuthors(Author[] additionalAuthors) {
		this.additionalAuthors = additionalAuthors;
	}

	void borrowTo(User user) {
		this.avaible=false;
		this.currentUser = user;
		user.books=Arrays.copyOf(user.books, user.books.length+1);
		user.books[user.books.length-1]=this;
		popularity++;
	}
	
	public boolean equals(Book book) {
		if(this.id==book.id) return true; 
		else return false;			
	}
	
	public void returnBook() {
		currentUser.returnBook(this);
	}
	
}