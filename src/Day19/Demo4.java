package Day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // loading the driver
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "password";
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();
        String sql = "insert into users values (3, 'watson')";
        int rowsAffected = statement.executeUpdate(sql);
        System.out.println("Number of ("+rowsAffected+") affected");
        statement.close();
        conn.close();
    }
}
