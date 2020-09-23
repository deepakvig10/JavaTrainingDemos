package Day19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo9 {
    public static void main(String[] args) throws SQLException {

        Connection con = ConnectionFactory.getConnection();
        Statement std = con.createStatement();
        String sql = "select * from student";
        ResultSet rs = std.executeQuery(sql);

        while(rs.next()){
            System.out.println(rs.getString("name")+", "+ rs.getString(2));
        }

    }
}
