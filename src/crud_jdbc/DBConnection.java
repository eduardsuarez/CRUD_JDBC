/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_jdbc;
import java.sql.*;



/**
 *
 * @author eduardsuarez
 */
public class DBConnection {

    final static String USER = "root";
    final static String PASS = "claveMYSQLDB#01";
    final static String URL = "jdbc:mysql://localhost/Fabrica"
            + "?serverTimeZone=UTC"
            + "& useSSL=false";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(URL, USER, PASS);

    }

}
