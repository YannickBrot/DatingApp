package demo;

import java.sql.*;

public class JDBCWriter {

    private Connection connection = null;

    public boolean setConnection() {
        //Input which database to connect to
        final String url = "jdbc:mysql://165.227.147.69:3306?serverTimezone=UTC";

        //default connection result is false
        boolean gotCon = false;

        try {
            //Attempt to establish connection, pass user details
            connection = DriverManager.getConnection(url, "maxmeldal", "bzm35htw");
            gotCon = true;
        } catch (SQLException throwables) {
            System.out.println("Connection failed = " + throwables.getMessage());
        }

        //return result of connection
        return gotCon;
    }
}