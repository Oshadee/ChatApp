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
public class ThreadInfo {

    private int id;
    private ThreadTypeInfo threadTypeID;
    private UserInfo usserID;
    private String message;
    private String addedDate;
    private String addedTime;
    private ConnectDB connectDB;

    //Constructor
    public ThreadInfo() {
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

    public ThreadTypeInfo getThreadTypeID() {
        return threadTypeID;
    }

    public void setThreadTypeID(ThreadTypeInfo threadTypeID) {
        this.threadTypeID = threadTypeID;
    }

    public UserInfo getUsserID() {
        return usserID;
    }

    public void setUsserID(UserInfo usserID) {
        this.usserID = usserID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

//    //get all the current threads
    public ArrayList<ThreadInfo> getAllThreadsBasedOnThreadID() {
        ArrayList<ThreadInfo> allThreads = new ArrayList<ThreadInfo>();

        try {
            String sql = "select * from threadinfo where threadTypeID="+getThreadTypeID().getId();
            connectDB.stmt = connectDB.con.createStatement();
            ResultSet rs = connectDB.stmt.executeQuery(sql);

            while (rs.next()) {
                ThreadInfo threadInfo = new ThreadInfo();
                threadInfo.setId(rs.getInt("id"));
                threadInfo.setMessage(rs.getString("message"));
                threadInfo.setAddedDate(rs.getString("addedDate"));
                threadInfo.setAddedTime(rs.getString("addedTime"));

                UserInfo userInfo = new UserInfo();
                userInfo.setUserID(rs.getString("userID"));
                threadInfo.setUsserID(userInfo);

                ThreadTypeInfo threadTypeInfo = new ThreadTypeInfo();
                threadTypeInfo.setId(rs.getInt("threadTypeID"));
                threadInfo.setThreadTypeID(threadTypeInfo);

                allThreads.add(threadInfo);
            }

        } catch (SQLException ex) {
            System.out.println("Error in getAllThreads : " + ex);
        }
        return allThreads;

    }
//Get no of entries based on the threadTypeID
    public int getCountOfEntries() {
        int type = 0;

        try {
            String sql = "SELECT count(*) AS total FROM threadinfo WHERE threadTypeID=" + getThreadTypeID().getId() + "";
            connectDB.stmt = connectDB.con.createStatement();
            ResultSet rs = connectDB.stmt.executeQuery(sql);

            rs.next();
            type = rs.getInt("total");

        } catch (SQLException ex) {
            System.out.println("Error in getCountOfEntries : " + ex);
        }

        return type;
    }

    //Getting the last edited info based on the threadID
    public ThreadInfo getLastEditedEntry() {
        ThreadInfo threadInfo = new ThreadInfo();

        try {
            String sql = "SELECT * FROM threadinfo WHERE threadTypeID=" + getThreadTypeID().getId() + " ORDER BY id DESC LIMIT 1";
            connectDB.stmt = connectDB.con.createStatement();
            ResultSet rs = connectDB.stmt.executeQuery(sql);

            rs.next();
            int idStr = rs.getInt("id");
            threadInfo.setId(idStr);
            threadInfo.setAddedDate(rs.getString("addedDate"));
            threadInfo.setAddedTime(rs.getString("addedTime"));

        } catch (SQLException ex) {
            System.out.println("Error in getLastEditedEntry : " + ex);
        }

        return threadInfo;
    }

    //Insert the message to the database
    public void sendMessage() {
        try {

            String sql = "INSERT INTO threadinfo(threadTypeID,message,userID,addedDate,addedTime) values(" + getThreadTypeID().getId()+ ",'" + getMessage() + "','" + getUsserID().getUserID()+ "','" + getAddedDate()+"','"+getAddedTime()+ "')";
            connectDB.stmt = connectDB.con.createStatement();
            if (connectDB.stmt.executeUpdate(sql) != 0) {

            }

        } catch (SQLException ex) {
            System.out.println("Error in sendMessage :" + ex);
        }
    }
}
