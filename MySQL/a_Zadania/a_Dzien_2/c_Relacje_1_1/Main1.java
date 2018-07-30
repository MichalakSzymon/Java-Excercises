package a_Zadania.a_Dzien_2.c_Relacje_1_1;


public class Main1 {
    //zapisz poniżej zapytania dodający tabelę do bazy pamiętaj o relacji
    public String tableAddQuery = "CREATE TABLE ClientAddress ("
    							+ "client_id int, "
    							+ "city varchar(50),"
    							+ "street varchar(100),"
    							+ "house_nr varchar(20), "
    							+ "PRIMARY KEY (client_id),"
    							+ "FOREIGN KEY(client_id) REFERENCES Clients(id)"
    							+ ");";

    //zapisz poniżej kod dodania do bazy rekordów
    public String tableAddRow1 = "INSERT INTO ClientAddress VALUES (1, 'Wroclaw, 'Warszawska', 20);";
    public String tableAddRow2 = "INSERT INTO ClientAddress VALUES (2, 'Warszawa', 'Krakowska', 15);";
    public String tableAddRow3 = "INSERT INTO ClientAddress VALUES (3, 'Krakow', 'Katowicka', '10A');";
    public String tableAddRow4 = "INSERT INTO ClientAddress VALUES (4, 'Katowice', 'Wroclawska', '5D');";
    
}