package a_Zadania.a_Dzien_2.c_Relacje_1_1;


public class Main3 {
    //zapisz poniżej zapytanie tworzące tabelę - pamiętaj o relacji i dodaniu odpowiedniej kolumny
    public String queryCreateTable = "CREATE TABLE Payments ("
    								+ "id int,"
    								+ "paid tinyint,"
    								+ "type varchar(50),"
    								+ "date DATE,"
    								+ "PRIMARY KEY (id),"
    								+ "FOREIGN KEY (id) REFERENCES Tickets(id)"
    								+ ");";

    public String tableAddRow0 = "INSERT INTO Tickets VALUES (1, 10, 20.00);";
    public String tableAddRow1 = "INSERT INTO Payments VALUES (1, 1, 'cash', NOW());";
    public String tableAddRow2 = "INSERT INTO Payments VALUES (2, 1, 'card', NOW());";
    public String tableAddRow3 = "INSERT INTO Payments VALUES (3, 0, 'cash', NOW());";
    public String tableAddRow4 = "INSERT INTO Payments VALUES (4, 0, 'card', NOW());";
}