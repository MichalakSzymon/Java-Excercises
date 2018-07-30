<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Java EE - Servlety

### Zadania.

Stwórz projekt `Homework_03`. Rozwiązania zadań powinny znajdować się w tym projekcie.

#### Zadanie 1.

W projekcie stwórz stronę jsp `index1.jsp`. Następnie:
1. Pobierz wartość parametru GET o nazwie `author`.
2. Sprawdź czy parametr istnieje oraz czy nie jest pusty.
3. Wyświetl informacje w postaci:
    ```html
    <p>Wybrany autor <Pobrana wartość></p>
    ```

#### Zadanie 2.

W projekcie stwórz stronę jsp `index2.jsp`. Za pomocą pętli forEach wyświetl na stronie liczby w taki sposób by uzyskać poniższy wynik. Wykorzystaj dodatkowe atrybuty pętli `begin` oraz `step`.    
```html
2 
4 
6 
8 
10 
```

#### Zadanie 3.

W projekcie stwórz stronę jsp `index3.jsp`. Następnie:
1. W skryptlecie zdefiniuj tablicę jak poniżej:
    ```jsp
    <%!
      String[] names = { "A","B", "C", "D" };
    %>
    ```
2. Za pomocą pętli forEach wyświetl elementy tablicy w formie tabeli html.


#### Zadanie 4.

W projekcie stwórz stronę jsp `index4.jsp`. Następnie:
1. Za pomocą tagów formatujących jstl wyświetl aktualną datę w następującym formacie: `2017-03-13`.
2. Za pomocą tagów formatujących wyświetl wartość `99.14115` w następujące sposoby:
    ```html
    99.141
    99.14115
    9,914%
    99.141 zł
    ```

Hint: Do ustawienia wartości użyj tagu:
```html
<c:set var="Amount" value="99.14115" />  
```

#### Zadanie 5.

W projekcie stwórz stronę jsp `index5.jsp`. Następnie:
1. Za pomocą odpowiedniej funkcji jstl sprawdź czy ustawiony za pomocą poniższego tagu ciąg znaków zawiera napis `coderslab`:
    ```html
    <c:set var="someName" value="Witaj w coderslab."/>  
    ```
2. Jeżeli napis zawiera `coderslab` w instrukcji sterującej wypisz na stronie `<p>OK</p>`.
