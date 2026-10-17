
package bank_management_system;

import java.sql.*;

public class Conn {
    public Statement s;
    public Connection c;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                "jdbc:mysql:///bankmanagementsystem",
                "root",
                "Mindfind@$7214"
            );

            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
