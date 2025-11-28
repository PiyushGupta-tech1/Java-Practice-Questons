import java.sql.*;
public class GLA {
    public static void main(String[] args) {
        

    String url = "jdbc:mysql://localhost:3306/GLA1";
    String user = "root";
    String password = "Prisha@123";
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection established successfully.");
        String query = "INSERT INTO Student1 VALUES(101,'JOHN'),(102,'JACK')";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        System.out.println("Data inserted successfully.");
        stmt.close();
        con.close();
    } catch (SQLException e) {
        System.out.println("SQL Exception: " + e.getMessage());
    } catch (ClassNotFoundException e) {
        System.out.println("Class Not Found Exception: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
}
}
}