package Day19;

/**
 * Steps:
 *
 * 1. Initialize the JDBC Driver
 *
 * JDBC Driver for MYSQL-Driver class
 * com.mysql.jdbc.Driver
 *
 * JDBC Driver for Oracle - OracleDriver.class
 * oracle.jdbc.driver.OracleDriver
 *
 * Class.forName("com.mysql.jdbc.Driver")
 * Class.forName("oracle.jdbc.driver.OracleDriver')
 *
 *
 * 2. Connect to Database
 *
 * Connection con = DriverManager.getConnection(url, username, password)
 * Oracle Connection
 * Connection con = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:XE", "root", "")
 *
 * MySQL Connection
 * Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "")
 *
 *
 *
 *
 * 3. Create a provision for passing SQL Queries to the connected database
 *
 * Statement std = con.createStatment()
 *
 *
 * 4. Pass the SQL Queries
 * void   std.execute(DDL command)
 * int   std.executeUpdate(DML Command)
 * ResultSet   std.executeQuery(Select command)
 *
 *
 * 5. Close connection
 * con.close()
 *
 *
 *
 *
 * **/


public class Demo2 {
}
