package librarymanagementsoftware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class ConnectionProvider {
    private ConnectionProvider() {
    }
    static Statement st = null;
    static Connection con = null;
    public static synchronized Statement getStatement() {
        synchronized (ConnectionProvider.class) {
//        synchronized (ConnectionProvider.class) {
            if (st == null) {
                try {
                    /*Class.forName("com.mysql.jdbc.Driver"); dont we this line*/
                    /*Class.forName("com.mysql.cj.jdbc.Driver"); 2 either 1*/
                    /*con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Mysql111");*/
                    Class.forName("oracle.jdbc.OracleDriver");
                    con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "c##scott", "tiger");
                    st = con.createStatement();

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return st;
            }
            return st;
        }
    }
}
