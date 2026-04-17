// ✅ AFTER — Proper Singleton with thread-safe double-checked locking
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL      = "jdbc:mysql://localhost:3306/globemed_db";
    private static final String USER     = "root";
    private static final String PASSWORD = "PaThum@#2419";

    private static volatile DBConnection instance = null;
    private Connection connection;

    private DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("DB Connected: globemed_db");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException("DB Connection failed: " + e.getMessage());
        }
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Reconnected");
            }
        } catch (SQLException e) {
            System.err.println("Reconnection failed: " + e.getMessage());
        }
        return connection;
    }
}