import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main{
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "2023";
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);Statement stmt = conn.createStatement();){
            String sql = "CREATE DATABASE CHEETOS1";
            stmt.executeUpdate(sql);
            System.out.println("Successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}