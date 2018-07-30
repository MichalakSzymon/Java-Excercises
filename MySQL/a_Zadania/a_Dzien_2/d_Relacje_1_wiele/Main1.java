package a_Zadania.a_Dzien_2.d_Relacje_1_wiele;


public class Main1 {
    //poniżej zapisz zapytania dodające rekordy do tabeli
	public String createTable="CREATE TABLE Opinions ("
								+ "id int AUTO_INCREMENT" 
								+ "products_id int NOT NULL,"
								+ "description TEXT,"
								+ "PRIMARY KEY(id),"
								+ "FOREIGN KEY(products_id) REFERENCES Products(id) ON DELETE CASCADE"
								+ ");";
	
    public String queryProduct1Opinion1 = "INSERT INTO Opinions VALUES (default, 1, 'opis');";
    public String queryProduct1Opinion2 = "INSERT INTO Opinions VALUES (default, 1, 'opis');";
    public String queryProduct1Opinion3 = "INSERT INTO Opinions VALUES (default, 1, 'opis');";
    public String queryProduct1Opinion4 = "INSERT INTO Opinions VALUES (default, 1, 'opis');";
    public String queryProduct1Opinion5 = "INSERT INTO Opinions VALUES (default, 1, 'opis');";

    public String queryProduct2Opinion1 = "INSERT INTO Opinions VALUES (default, 2, 'opis');";
    public String queryProduct2Opinion2 = "INSERT INTO Opinions VALUES (default, 2, 'opis');";
    public String queryProduct2Opinion3 = "INSERT INTO Opinions VALUES (default, 2, 'opis');";
    public String queryProduct2Opinion4 = "INSERT INTO Opinions VALUES (default, 2, 'opis');";
    public String queryProduct2Opinion5 = "INSERT INTO Opinions VALUES (default, 2, 'opis');";

    public String queryProduct3Opinion1 = "INSERT INTO Opinions VALUES (default, 3, 'opis');";
    public String queryProduct3Opinion2 = "INSERT INTO Opinions VALUES (default, 3, 'opis');";
    public String queryProduct3Opinion3 = "INSERT INTO Opinions VALUES (default, 3, 'opis');";
    public String queryProduct3Opinion4 = "INSERT INTO Opinions VALUES (default, 3, 'opis');";
    public String queryProduct3Opinion5 = "INSERT INTO Opinions VALUES (default, 3, 'opis');";
}
