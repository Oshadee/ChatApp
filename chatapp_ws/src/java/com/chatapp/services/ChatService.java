/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatapp.services;

import com.chatapp.model.ThreadInfo;
import com.chatapp.model.ThreadTypeInfo;
import com.chatapp.model.UserInfo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Oshadi
 */
@WebService(serviceName = "ChatService")
public class ChatService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "create_thread")
    @Oneway
    public void create_thread(@WebParam(name = "title") String title, @WebParam(name = "userID") String userID) {
        ThreadTypeInfo threadTypeInfo = new ThreadTypeInfo();
        threadTypeInfo.setTitle(title);
        //setting the user
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(userID);

        threadTypeInfo.setCreatedUser(userInfo);

        //Getting the current date
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String dateStr = dateFormat.format(date);
        threadTypeInfo.setCreatedDate(dateStr);

        //Getting the current time
        DateFormat dateFormatTime = new SimpleDateFormat("HH:mm:ss");
        Date dateTime = new Date();
        String timeStr = dateFormatTime.format(dateTime);
        threadTypeInfo.setCreatedTime(timeStr);
        
        threadTypeInfo.createThread();

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "threadTitleExists")
    public Boolean threadTitleExists(@WebParam(name = "title") String title, @WebParam(name = "userID") String userID) {
        ThreadTypeInfo threadTypeInfo = new ThreadTypeInfo();
        threadTypeInfo.setTitle(title);
        //setting the user
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(userID);

        threadTypeInfo.setCreatedUser(userInfo);
        return threadTypeInfo.threadTitleExists();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllThreads")
    public ArrayList<ThreadTypeInfo> getAllThreads() {
       ThreadTypeInfo threadTypeInfo = new ThreadTypeInfo();
       return threadTypeInfo.getAllMainThreads();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEntriesBasedOnThreadID")
    public int getEntriesBasedOnThreadID(@WebParam(name = "threadID") int threadID) {
        ThreadInfo threadInfo = new ThreadInfo();
        ThreadTypeInfo threadTypeInfo = new ThreadTypeInfo();
        threadTypeInfo.setId(threadID);
        threadInfo.setThreadTypeID(threadTypeInfo);
        return threadInfo.getCountOfEntries();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLastEditedEntryBasedOnThreadID")
    public ThreadInfo getLastEditedEntryBasedOnThreadID(@WebParam(name = "threadID") int threadID) {
        ThreadInfo threadInfo = new ThreadInfo();
        ThreadTypeInfo threadTypeInfo = new ThreadTypeInfo();
        threadTypeInfo.setId(threadID);
        threadInfo.setThreadTypeID(threadTypeInfo);
        
        return threadInfo.getLastEditedEntry();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllThreadsBasedOnThreadID")
    public ArrayList<ThreadInfo> getAllThreadsBasedOnThreadID(@WebParam(name = "threadID") int threadID) {
        ThreadInfo threadInfo = new ThreadInfo();
        ThreadTypeInfo threadTypeInfo = new ThreadTypeInfo();
        threadTypeInfo.setId(threadID);
        threadInfo.setThreadTypeID(threadTypeInfo);
        return threadInfo.getAllThreadsBasedOnThreadID();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendMessage")
    @Oneway
    public void sendMessage(@WebParam(name = "threadTypeID") int threadTypeID, @WebParam(name = "message") String message, @WebParam(name = "userID") String userID, @WebParam(name = "addedDate") String addedDate, @WebParam(name = "addedTime") String addedTime) {
        ThreadInfo threadInfo = new ThreadInfo();
        threadInfo.setMessage(message);
        threadInfo.setAddedDate(addedDate);
        threadInfo.setAddedTime(addedTime);
        
        ThreadTypeInfo threadTypeInfo = new ThreadTypeInfo();
        threadTypeInfo.setId(threadTypeID);
        threadInfo.setThreadTypeID(threadTypeInfo);
        
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(userID);
        threadInfo.setUsserID(userInfo);
        
        threadInfo.sendMessage();
    }

}
