package b_Zadania_domowe.a_Dzien_1;


public class Main1 {
    public String query1 = "SELECT * FROM users WHERE name LIKE 'Julia%';";

    public String query2 = "SELECT * FROM users ORDER BY email DESC LIMIT 5;";

    public String query3 = "SELECT * FROM users WHERE email LIKE '%@yahoo.com' AND name LIKE 'L%';";

    public String query4 = "SELECT * FROM users WHERE (SHA2(CONCAT(name, '.', salt), 256))=password";

    public String query5 = "SELECT id, title FROM offers WHERE price > 500000;";

    public String query6 = "SELECT id, price FROM offers WHERE price BETWEEN 2000 AND 400000 AND activation_token='';";

    public String query7 = "SELECT title, price, phone FROM offers WHERE expire BETWEEN (Now()) AND (DATE_ADD(Now(), INTERVAL 10 DAY));";

    public String query8 = "SELECT * FROM offers WHERE description LIKE '%violent%' AND phone LIKE '%2%' AND price > 50000;";

    public String query9 = "SELECT * FROM offers WHERE promoted=0 AND price < 300000 AND title LIKE '%LLC';";

    public String query10 = "UPDATE offers SET price=price+1000 WHERE owner BETWEEN 20 AND 25;";

    public String query11 = "DELETE FROM offers WHERE expire<=(DATE_SUB(Now(), INTERVAL 3 DAY));";
    
    public String query12 = "DELETE FROM offers WHERE phone LIKE '+48%' AND expire>Now() AND promoted=1 AND status=1;";

    public String query13 = "UPDATE offers SET promoted=1 AND expire=(DATE_ADD(expire, INTERVAL 23 DAY)) WHERE SUBSTRING(phone, 4) LIKE '%48' AND promoted=0;";

    public String query14 = "SELECT * FROM offers WHERE price*2<50000 AND promoted_to>Now();";

    public String query15 = "UPDATE offers SET description = REPLACE(description, 'executed', 'founded') WHERE (phone LIKE '%(%' OR phone LIKE '%)%') AND price>400000;";

    public String query16 = "SELECT count(*) AS sum_active FROM offers where expire>Now() AND status=1;";

    public String query17 = "SELECT owner, count(*) AS sum_active FROM offers where expire<Now() AND status=1 GROUP BY owner;";
    
    public String query18 = "SELECT status AS type, count(*) AS counter FROM offers WHERE status IN (1,2) GROUP BY status;";

    public String query19 = "SELECT SUM(price) AS sum_nonactive_nopromoted FROM offers WHERE expired<Now() AND status=1 AND promoted=0;";

    public String query20 = "SELECT ROUND(AVG(price),2) AS avg_price FROM offers WHERE expire>Now() AND promoted=1 AND price>44645.04;";
}
