package a_Zadania.a_Dzien_2.b_Modyfikacja_tabel;


public class Main2 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "ALTER TABLE Movies ADD COLUMN watchCount INT;";
    public String query2 = "ALTER TABLE Movies ADD COLUMN isTop tinyint default 0;";
    public String query3 = "UPDATE Movies SET isTop=1 WHERE watchCount>100;";
    public String query4 = "ALTER TABLE Movies ADD COLUMN openTime time(0);";
    public String query5 = "ALTER TABLE Movies ADD COLUMN closeTime time(0);";
}
