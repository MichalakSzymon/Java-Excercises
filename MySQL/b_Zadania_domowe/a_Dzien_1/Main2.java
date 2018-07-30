package b_Zadania_domowe.a_Dzien_1;


public class Main2 {
    public String createTableImagesQuery = "create table images "
    									+ "(id int auto_increment,"
    									+ "offer_id int unsigned,"
    									+ "src varchar(100),"
    									+ "dimension varchar(10),"
    									+ "primary key(id));";

    public String createTableUsersCompaniesQuery = "CREATE TABLE users_companies ( "
										    		+ "id int unsigned auto_increment, "
										    		+ "user_id int unsigned unique, "
										    		+ "name varchar(30), "
										    		+ "nip int, "
										    		+ "street varchar(50), "
										    		+ "street_nr mediumInt, "
										    		+ "phone char(9), "
										    		+ "post_code char(6), "
										    		+ "capital decimal(7,2), "
										    		+ "rate decimal(5,4), "
										    		+ "created_at datetime, "
										    		+ "primary key(id));";
}
