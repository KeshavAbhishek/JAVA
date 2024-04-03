import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class App{
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "2023";
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);Statement stmt = conn.createStatement();){
            String sql = "CREATE DATABASES EXPENSE";
            stmt.executeUpdate(sql);
            // System.out.println("Successfully.");
            JOptionPane.showMessageDialog(null, "Done! Database successfully created.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}