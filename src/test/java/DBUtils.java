import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtils {

    private static Connection connection;

    // Open DB Connection
    public static void openDBConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/databaseconnectiontoapi";
        String username = "root";
        String password = "vikasH@6972"; // change as per your DB

        connection = DriverManager.getConnection(url, username, password);
    }

    // Execute SELECT Query
    public static ResultSet executeQuery(String query) throws Exception {
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }

    // Close DB Connection
    public static void closeDBConnection() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }
}
