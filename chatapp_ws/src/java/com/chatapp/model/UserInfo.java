/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatapp.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Oshadi
 */
public class UserInfo {

    private int id;
    private String userID;
    private String password;
    private String nickname;
    private ConnectDB connectDB;

    //Constructor
    public UserInfo() {
        connectDB = new ConnectDB();
        connectDB.openConnection();
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    //Inserting the user info to the database
    public void registerUser() {
        try {

            String sql = "INSERT INTO userinfo(USERID,NICKNAME,PASSWORD) values('" + getUserID() + "','" + getNickname() + "','" + getPassword() + "')";
            connectDB.stmt = connectDB.con.createStatement();
            if (connectDB.stmt.executeUpdate(sql) != 0) {

            }

        } catch (SQLException ex) {
            System.out.println("Error in registerUser :" + ex);
        }

    }

    //Check whether the userID already exists
    public boolean isUserIDExsists() {
        boolean flag = false;

        try {
            String sql = "SELECT userid FROM userinfo WHERE userid='" + getUserID() + "'";
            connectDB.stmt = connectDB.con.createStatement();
            ResultSet rs = connectDB.stmt.executeQuery(sql);

            while (rs.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            System.out.println("Error in isUserIDExsists : " + ex);
        }

        return flag;
    }

//    Check whether the user credintials are correct
    public boolean login() {
        boolean flag = false;

        try {
            String sql = "SELECT * FROM userinfo WHERE userid='" + getUserID() + "' AND PASSWORD='" + getPassword() + "'";
            connectDB.stmt = connectDB.con.createStatement();
            ResultSet rs = connectDB.stmt.executeQuery(sql);

            while (rs.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            System.out.println("Error in login : " + ex);
        }

        return flag;
    }

    //Getting the nickname based on the userID
    public String getNicknameBasedOnUserID() {
        String type = null;

        try {
            String sql = "SELECT nickname FROM userinfo WHERE userid='" + getUserID() +"'";
            connectDB.stmt = connectDB.con.createStatement();
            ResultSet rs = connectDB.stmt.executeQuery(sql);

            rs.next();
            type = rs.getString("nickname");

        } catch (SQLException ex) {
            System.out.println("Error in getNicknameBasedOnUserID : " + ex);
        }

        return type;
    }
}
