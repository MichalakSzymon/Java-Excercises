package a_Zadania.a_Dzien_2.b_Modyfikacja_tabel;


public class Main1 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "ALTER TABLE Tickets ADD COLUMN priceUSD decimal(6,2);";
    public String query2 = "ALTER TABLE Movies ADD COLUMN director char(80);";
    public String query3 = "ALTER TABLE Movies MODIFY COLUMN director varchar(50);";
    public String query4 = "ALTER TABLE Tickets DROP COLUMN priceUSD;";
}
