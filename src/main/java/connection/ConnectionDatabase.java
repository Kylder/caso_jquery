package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    public static Connection connect() {
        Connection con = null;

        String password = "root";
        String user = "root";
        String database = "crud";
        String url = "jdbc:mysql://127.0.0.1:3306/" + database + "?serverTimezone=UTC&user=" + user
                + "&password=" + password;
        try {
            con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("Connected");
            }
        } catch (SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
        return con;
    }
}
