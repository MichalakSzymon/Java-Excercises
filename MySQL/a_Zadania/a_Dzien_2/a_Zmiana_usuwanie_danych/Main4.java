package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;


public class Main4 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "UPDATE Cinemas SET address='Stadion Narodowy' WHERE name LIKE '%z';";
    public String query2 = "DELETE FROM Payments WHERE date< DATE_SUB(Now(), INTERVAL 4 DAY)";
    public String query3 = "UPDATE Movies SET rating=5.4 WHERE CHAR_LENGTH(description)>40";
    public String query4 = "UPDATE Tickets SET price=price*price/2 WHERE quantity>10;";
    public String query5 = "";

}
