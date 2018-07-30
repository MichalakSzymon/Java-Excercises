package a_Zadania.a_Dzien_2.d_Relacje_1_wiele;


public class Main3 {
    public String query1 = "SELECT * FROM Products RIGHT JOIN Opinions ON products_id=Products.id;";
    public String query2 = "SELECT * FROM Products LEFT JOIN Opinions ON products_id=Products.id;";
    public String query3 = "SELECT * FROM Products LEFT JOIN Opinions ON products_id=Products.id WHERE Products.id=1;";

}
