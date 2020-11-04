package Controllers;

import Objects.Pet;
import Objects.User;

import java.sql.*;
import java.util.ArrayList;

public class JDBCWriter {

    private Connection connection = null;

    public boolean setConnection() {
        //Input which database to connect to
        final String url = "jdbc:mysql://165.227.147.69:3306?serverTimezone=UTC";

        //default connection result is false
        boolean gotCon = false;

        try {
            //Attempt to establish connection, pass user details
            connection = DriverManager.getConnection(url, "GlobalAdmin ", "[H6F5725u*Dk’}8a");
            gotCon = true;
        } catch (SQLException throwables) {
            System.out.println("Connection failed = " + throwables.getMessage());
        }

        //return result of connection
        return gotCon;
    }

    public ArrayList<User> getUsers() {
        return null;
    }

    public ArrayList<Pet> getPets() {
        return null;
    }
}