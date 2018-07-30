package b_Zadania_domowe.b_Dzien_2;


public class Author extends Person {
	
	private String pseudonim;
	private int id;
	private static int nextId=0;
	
	public Author (String firstName, String lastName, String pseudonim) {
		super(firstName, lastName);
		this.pseudonim=pseudonim;
		this.id = nextId; 
		this.nextId++;
	}
	
	
		
}
