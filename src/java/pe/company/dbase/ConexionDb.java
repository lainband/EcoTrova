package pe.company.dbase;

import java.sql.*;

public class ConexionDb {
    public static Connection MySQL() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection
                                   ("jdbc:mysql://localhost:3306/bd_tovar","root","");
        return c;
    }
}
