import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	
	private static Connection connection;

	public static Connection getConnection() {
	    try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/booksdb","root","root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
	}

}
