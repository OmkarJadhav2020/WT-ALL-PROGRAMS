import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaJDBC {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC", "root", "password"
            );

            // Create statement
            Statement statement = connection.createStatement();

            // Select query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
            System.out.println("Existing records:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }

            // Update query
            int updatedRows = statement.executeUpdate("UPDATE students SET name = 'John' WHERE id = 1");
            System.out.println("Number of rows updated: " + updatedRows);

            // Insert query
            int insertedRows = statement.executeUpdate("INSERT INTO students (id, name, age) VALUES (4, 'Alice', 25)");
            System.out.println("Number of rows inserted: " + insertedRows);

            // Delete query
            int deletedRows = statement.executeUpdate("DELETE FROM students WHERE id = 2");
            System.out.println("Number of rows deleted: " + deletedRows);

            // Close connection
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
