package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static Map<String, String> getMap() {
		Map <String, String> mapa = new HashMap<>();
		mapa.put("ciepło", "zimno");
		mapa.put("jasny", "ciemny");
		mapa.put("gruby", "chudy");
		mapa.put("mały", "duży");
		mapa.put("biały", "czarny");
		return mapa;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("podaj przeciwieństwo:");
		Map <String, String> mapa = getMap();
		int counter=0;
		for(int i=0; i<mapa.size(); i++) {
			mapa.keySet();
		}
			
		
	}
}
