import java.sql.*;
// import javax.swing.JOptionPane;

public class App{
    static void runQuery(String sql){
        final String DB_URL = "jdbc:mysql://localhost:3306/";
        final String USER = "root", PASS = "2023";
        try(Connection c = DriverManager.getConnection(DB_URL, USER, PASS);Statement s = c.createStatement()){
            s.executeUpdate(sql);
        }catch(SQLException e){e.printStackTrace();}
        return;
    }
    public static void createTable(){
        String sql = "CREATE TABLE KESHAV.EXPENSE(SL INT PRIMARY KEY, DEBIT DOUBLE, CREDIT DOUBLE, TRANSACTION_DATE DATE)";
        runQuery(sql);
    }

    public static void addRecord(
        int SL,
        Double DEBIT,
        Double CREDIT,
        String TRANSACTION_DATE
    ){
        final String DB_URL = "jdbc:mysql://localhost:3306/";
        final String USER = "root", PASS = "2023";
        try (Connection c = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement pstmt = c.prepareStatement("INSERT INTO KESHAV.EXPENSE (SL, DEBIT, CREDIT, TRANSACTION_DATE) VALUES (?, ?, ?, ?);");){
            pstmt.setInt(1, SL);
            pstmt.setDouble(2, DEBIT);
            pstmt.setDouble(3, CREDIT);
            pstmt.setString(4, TRANSACTION_DATE);

            // Execute the prepared statement
            // pstmt.executeUpdate();
            String sql = pstmt.toString().replace("com.mysql.cj.jdbc.ClientPreparedStatement: ", "");
            System.out.println(sql);
            runQuery(sql);
        } catch (Exception e) {}
    }
}