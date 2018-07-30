package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;


public class Main2 {
	
	public static List<Integer> removeDivider (List<Integer> list, int divider) {
		for(Integer li: list) {
			if(li%divider==0) list.remove(li);
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		removeDivider(list, 2);
		for(Integer li: list) 
			System.out.println(li);
			
		}
	

}
