package a_Zadania.a_Dzien_2.e_Relacje_wiele_wiele;


public class Main1 {
    //poniżej zapisz zapytanie tworzące tabele i łączące je.
    public String query1 = "CREATE TABLE ProductsiOrders("
    						+ "Products_id int,"
    						+ "Orders_id int,"
    						+ "FOREIGN KEY (Products_id) REFERENCES Products(id),"
    						+ "FOREIGN KEY (Orders_id) REFERENCES Orders(id)"
    						+ ");";

    //zapytania łączące produkty z zamówieniami
    public String query2 = "INSERT INTO ProductsiOrders VALUES (1,1);";
    public String query3 = "INSERT INTO ProductsiOrders VALUES (1,2);";
    public String query4 = "INSERT INTO ProductsiOrders VALUES (2,1);";
    public String query5 = "INSERT INTO ProductsiOrders VALUES (2,3);";




}
