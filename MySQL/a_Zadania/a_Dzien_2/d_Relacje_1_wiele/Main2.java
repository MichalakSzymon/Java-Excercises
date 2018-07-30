package a_Zadania.a_Dzien_2.d_Relacje_1_wiele;


public class Main2 {
//zapisz poniżej zapytania tworzące odpowiednie tabele
    public String queryAddCategories =  "CREATE TABLE Categories ("
    									+ "id int AUTO_INCREMENT,"
    									+ "name varchar(100),"
    									+ "PRIMARY KEY (id)"
    									+ ");";

    public String queryAddCategoriesSub = "CREATE TABLE Categories_sub ("
										+ "id int AUTO_INCREMENT,"
										+ "main_id int,"
										+ "name varchar(100),"
										+ "PRIMARY KEY (id),"
										+ "FOREIGN KEY (main_id) REFERENCES Categories(id)"
										+ ");";

    public String queryRelationTable =  "";
}
