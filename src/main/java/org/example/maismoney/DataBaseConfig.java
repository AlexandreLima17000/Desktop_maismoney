package org.example.maismoney;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseConfig {
    public static  Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/maismoney";
        String user = "root" ;
        String password = "senac";

        return DriverManager.getConnection(url,user,password);
    }
}