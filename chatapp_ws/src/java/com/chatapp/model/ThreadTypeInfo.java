/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatapp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oshadi
 */
public class ThreadTypeInfo {

    private int id;
    private String title;
    private String createdDate;
    private String createdTime;
    private UserInfo createdUser;

    private ConnectDB connectDB;

    //Constructor
    public ThreadTypeInfo() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public UserInfo getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(UserInfo createdUser) {
        this.createdUser = createdUser;
    }

    //Inserting the new thread details
    public void createThread() {
        try {

            String sql = "INSERT INTO threadtypeinfo(TITLE,USERID,CREATEDDATE,CREATEDTIME) values('" + getTitle() + "','" + getCreatedUser().getUserID() + "','" + getCreatedDate() + "','" + getCreatedTime() + "')";
            connectDB.stmt = connectDB.con.createStatement();
            if (connectDB.stmt.executeUpdate(sql) != 0) {

            }

        } catch (SQLException ex) {
            System.out.println("Error in createThread :" + ex);
        }
    }
    
    //Check whether thread title already exists
    public boolean threadTitleExists() {
        boolean flag = false;

        try {
            String sql = "SELECT * FROM threadtypeinfo WHERE USERID='" + getCreatedUser().getUserID()+ "' AND TITLE='"+getTitle()+"'";
            connectDB.stmt = connectDB.con.createStatement();
            ResultSet rs = connectDB.stmt.executeQuery(sql);

            while (rs.next()) {
                flag = true;
            }

        } catch (SQLException ex) {
            System.out.println("Error in threadTitleExists : " + ex);
        }

        return flag;
    }
    
    //get all the current main threads
    public ArrayList<ThreadTypeInfo> getAllMainThreads() {
        ArrayList<ThreadTypeInfo> allThreads = new ArrayList<ThreadTypeInfo>();

        try {
            String sql = "select * from threadtypeinfo";
            connectDB.stmt = connectDB.con.createStatement();
            ResultSet rs = connectDB.stmt.executeQuery(sql);

            while (rs.next()) {
                ThreadTypeInfo threadTypeInfo = new ThreadTypeInfo();
                threadTypeInfo.setId(rs.getInt("id"));
                threadTypeInfo.setTitle(rs.getString("title"));
                threadTypeInfo.setCreatedDate(rs.getString("createdDate"));
                threadTypeInfo.setCreatedTime(rs.getString("createdTime"));

                UserInfo userInfo = new UserInfo();
                userInfo.setUserID(rs.getString("userID"));
                threadTypeInfo.setCreatedUser(userInfo);
                
                allThreads.add(threadTypeInfo);
            }

        } catch (SQLException ex) {
            System.out.println("Error in getAllMainThreads : " + ex);
        }
        return allThreads;

    }
    
}
