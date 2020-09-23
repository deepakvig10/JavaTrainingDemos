package Day19;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo8 {
    public static void main(String[] args) throws SQLException {

        Connection con = ConnectionFactory.getConnection();
        Statement std = con.createStatement();
        String sql = "create table emp2 (id int, name char(50))";
        std.execute(sql);
        System.out.println("Table created");


    }
}
