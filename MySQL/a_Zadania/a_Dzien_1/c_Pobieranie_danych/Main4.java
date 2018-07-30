package a_Zadania.a_Dzien_1.c_Pobieranie_danych;


public class Main4 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT SUM(quantity) AS Liczba_biletow FROM Tickets;";
    public String query2 = "SELECT type, count(*) FROM Payments GROUP BY type;";
    public String query3 = "SELECT ROUND(AVG(price),2) FROM Tickets;";
    public String query4 = "SELECT * FROM Payments LIMIT 2,5;";
    public String query5 = "SELECT type, count(*) FROM Payments GROUP BY type HAVING count(*)>2;";
    public String query6 = "SELECT SUM(quantity) FROM Tickets WHERE quantity>1;";
}
