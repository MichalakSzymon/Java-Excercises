<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java - kolekcje

#### Zadanie 1 - rozwiązywane z wykładowcą.

W pliku `Main1.java`

1. W metodzie `main` utwórz listę o nazwie `elements` przechowującą elementy typy Integer.
2. Dodaj do kolekcji 50 elementów od 0 do 50.
3. Wypisz elementy na konsoli używając pętli for.
4. Wypisz elementy na konsoli używając iteratora i pętli while.
5. Wypisz na konsoli elementy używając iteratora i pętli for.
6. Wypisz na konsoli elementy używając konstrukcji for-each.

#### Zadanie 2 - rozwiązywane z wykładowcą.

W pliku `Main2.java` napisz metodę `public static List<Integer> removeDivider (List<Integer> list, int divider)`,
która usunie z listy wszystkie elementy podzielne przez `divider` a następnie zwróci tak przetworzoną listę.


-----------------------------------------------------------------------------

#### Zadanie 3

Utwórz klasę `City`,  dodaj w niej atrybuty:
* name (String)
* population (int)  

Klasa powinna a mieć też konstruktor przyjmujący wszystkie 3 parametry

Następnie w pliku `Main3.java`:
1. Napisz metodę `public static List<City> initialize()`, która utworzy 5 obiektów klasy `City`, doda je do listy, którą następnie zwróci.
2. Napisz metodę `public static List<City> sublist(List<City> list, int start, int end )`, która zwróci sublistę elementów listy `list` o początku `start` i końcu `end`.

#### Zadanie 4

W pliku `Main4.java`:
1. Napisz metodę `public static List<City> reverse (List<City> list )`, która zwróci listę elementów w odwrotnej od otrzymanej kolejności.
2. Zapoznaj się z możliwościami klasy [ListIterator][list-iterator].


<!-- Links -->
[list-iterator]:https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html
