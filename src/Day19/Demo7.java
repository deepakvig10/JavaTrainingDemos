package Day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Demo7 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ResourceBundle bundle = ResourceBundle.getBundle("Day19/dbConfig");
        String dc = bundle.getString("driverClass");
        String url = bundle.getString("url");
        String username = bundle.getString("username");
        String password = bundle.getString("password");

        // loading the driver
        Class.forName(dc);

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();
        String sql = "create table users2 (id int, name varchar(50))";
        statement.execute(sql);
        statement.close();
        conn.close();
    }
}
