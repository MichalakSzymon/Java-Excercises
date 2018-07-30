package a_Zadania.a_Dzien_2.e_Relacje_wiele_wiele;


public class Main3 {
    public String query1 = "CREATE TABLE Screenings ("
    						+ "Cinemas_id int,"
    						+ "Movies_id int,"
    						+ "FOREIGN KEY (Cinemas_id) REFERENCES Cinemas(id),"
    						+ "FOREIGN KEY (Movies_id) REFERENCES Movies(id)"
    						+ ");";
}
