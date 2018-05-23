/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatapp.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oshadi
 */
public class ConnectDB {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/chatapp_database";
    Connection con;
        Statement stmt;

    public void openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(
                    URL,//dbUrl
                    USERNAME,//dbUsername
                    PASSWORD//dbPassword
            );
            System.out.println("Successsfully DB is connected");
        } catch (SQLException ex) {
            System.out.println("Error in building the connection : " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error in class : " + ex);
        }

    }
}
