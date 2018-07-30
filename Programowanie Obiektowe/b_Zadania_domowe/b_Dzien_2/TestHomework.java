package b_Zadania_domowe.b_Dzien_2;

public class TestHomework {

	public static void main(String[] args) {
		Author author = new Author("John", "Doe", "JD");
		User user1 = new User("Jan", "Kowalski");
		User user2 = new User("Anna", "Nowak");
		
		Book book1 = new Book (1, "John Doe", author);
		Book book2 = new Book (2, "John Doe 2", author);
		
		book1.borrowTo(user1);
		user1.borrowedBooks();
		
		user2.borrowedBooks();
		
		book2.borrowTo(user2);
		
		user2.borrowedBooks();
		
		user1.returnBook(book1);
		
		user1.borrowedBooks();
		
		book1.borrowTo(user2);
		
		user2.borrowedBooks();
		
		user2.returnAllBooks();
		user2.borrowedBooks();
		
	}

}
