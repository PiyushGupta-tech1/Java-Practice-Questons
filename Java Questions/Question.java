import java.sql.*;

class Question {
			String url = "jdbc:mysql://localhost:3306/GLA";
            String user = "root";
            String pass = "Prisha@123";

    public static void main(String[] args) {
		
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String query = "select * from student1 where attendence > 75";
            ResultSet rm = stmt.executeQuery(query);
            while (rm.next()) {
                System.out.println("Rollno " + rm.getInt("rollno") + " Name " + rm.getString("name") + " Attendance " + rm.getInt("attendence"));

            }
            rm.close();
            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not properly connect");
        } catch (SQLException e) {
            System.out.println("Queries issue");
        }
    }
}