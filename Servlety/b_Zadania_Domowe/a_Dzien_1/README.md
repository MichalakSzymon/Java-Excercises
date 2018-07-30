<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE - Servlety

### Zadania.

Stwórz projekt `Homework_01`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1

W projekcie stwórz servlet `Servlet_01`, dostępny pod adresem **/Servlet_01**,  
Servlet wczyta zawartość pliku oop.txt a następnie wyświetli jego zawartość na stronie. Jest to lista języków programowania które wzorują się na [paradygmacie obiektowym][oop-paradygmat] pobrana z [Wikipedii][oop-wiki].

#### Zadanie 2

W projekcie stwórz servlet `Servlet_02`, oraz stronę HTML `index.html`, 
w której zawarty jest formularz przesyłający imię oraz płeć .
Po uruchomieniu na serwerze i uzupełnieniu formularza w przeglądarce wyświetlą się powitanie:
```` 
 Coders Lab wita Pana <podane imię>.
````
Jeśli wybrana płeć w formularzu to mężczyzna, w przeciwnym razie wyświetli się powitanie:
```` 
 Coders Lab wita Panią <podane imię>.
````

#### Zadanie 3

W projekcie stwórz servlety `Servlet_03_1`, `Servlet_03_2`, dostępne odpowiednio pod adresami
 **/Servlet_03_1**, **/Servlet_03_2**.  
Dopisz następującą funkcjonalność:
* Na pierwszej stronie (`Servlet_03_1`) wygeneruj linki do strony `Servlet_03_2`, które będą przesyłały metodą GET id szukanego produktu (wygeneruj dla id z zakresu od `0` do `7`).
* Druga strona (`Servlet_03_2`) po odebraniu danych powinna odnaleźć w przygotowanej tablicy produkt (zakładamy że id kolejny element). Poniżej znajduje się przykładowa tablica z produktami:
    ```java
    String products[] = {
        "Asus Transformr;2999.99",
        "iPhone 6';3499.18",
        "Converse Sneakers;125.00",
        "LG OLED55B6P OLED TV;6493.91",
        "Samsung HT-J4100;800.99",
        "Alpine Swiss Dress Belt;99.08",
        "60 Watt LED;1.50",
        "Arduino Nano;3.26",
    };
    ```
* Jeśli produkt znajduje się w tablicy powinna zostać wyświetlona jego nazwa i cena np.`Asus Transformer - 2999.99zł`
* Jeśli wybierzemy produkt z poza zakresu powinien zostać wyświetlony komunikat `Product not found.`

#### Zadanie 4

W projekcie stwórz servlet `Servlet_04`, oraz stronę HTML `index.html`, w której zawarty jest formularz przesyłający (metodą GET) 4 parametry liczbowe o nazwie `num`. Po przejściu do servletu oblicz ich średnią, sumę oraz iloczyn i zwróć wynik w przeglądarce:

````
Liczby:
  - x1
  - x2
  - x3
  - x4
Średnia:
  - średnia 
Suma:
  - suma 
Iloczyn:
  - iloczyn 
````

#### Zadanie 5

W projekcie stwórz servlet `Servlet_05`, który wylosuje 10 liczb z zakresu 1-100. Następnie Wyświetl dwie tabelki z tymi liczbami:
1. Pierwsza tabelka powinna wyświetlić wartości w kolejności jakiej zostały wylosowane.
2. Druga tabelka powinna wyświetlać wartości posortowane (od najmniejszej do największej

<!-- Links -->
[oop-paradygmat]:https://pl.wikipedia.org/wiki/Programowanie_obiektowe
[oop-wiki]:https://en.wikipedia.org/wiki/List_of_object-oriented_programming_languages
