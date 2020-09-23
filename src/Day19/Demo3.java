package Day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // loading the driver
        Class.forName("com.mysql.jdbc.Driver");
        String url = "";
        String username = "";
        String password = "";

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();
        String sql = "create table users (id int, name varchar(50))";
        statement.execute(sql);
        statement.close();
        conn.close();



    }
}
