package a_Zadania.a_Dzien_2.d_Relacje_1_wiele;


public class Main4 {
    public String query1 = "SELECT * FROM Categories_sub where main_id=1;";
    public String query2 = "SELECT DISTINCT Categories.id, Categories.name FROM Categories RIGHT JOIN Categories_sub ON main_id=Categories.id;";

}
