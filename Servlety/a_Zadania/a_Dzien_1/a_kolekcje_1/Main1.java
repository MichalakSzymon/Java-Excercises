package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import a_Zadania.a_Dzien_1.b_kolekcje_2.Country;

public class Main1 {
	public static void main(String[] args) {
		List <Integer> elements = new ArrayList<>();
		final int ile =50;
		for(int i=0; i<50; i++)
			elements.add(i);
	
		for (int i=0; i<elements.size(); i++)
			System.out.print(i);
		Iterator <Integer> it = elements.iterator();
		System.out.println();
		
		while(it.hasNext())
			System.out.print(it.next());
		System.out.println();
		
		for(Iterator <Integer> it2 = elements.iterator(); it2.hasNext(); )
			System.out.print(it2.next());
		
		for(Integer li: elements) System.out.print(li);	
			
	
	
	}
}
