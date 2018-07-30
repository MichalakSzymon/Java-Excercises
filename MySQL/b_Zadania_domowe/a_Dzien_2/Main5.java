package b_Zadania_domowe.a_Dzien_2;


public class Main5 {
		String query="CREATE TABLE Seance ("
				+ "id int AUTO_INCREMENT, "
				+ "cinema_id int, "
				+ "movie_id int, "
				+ "PRIMARY KEY(id),  "
				+ "FOREIGN KEY (cinema_id) REFERENCES Cinemas(id), "
				+ "FOREIGN KEY (movie_id) REFERENCES Movies(id)"
				+ ");";

}
