/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatapp.services;

import com.chatapp.model.ConnectDB;
import com.chatapp.model.UserInfo;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Oshadi
 */
@WebService(serviceName = "UserService")
public class UserService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add_user")
    @Oneway
    public void add_user(@WebParam(name = "nickName") String nickName, @WebParam(name = "loginID") String loginID, @WebParam(name = "password") String password) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(loginID);
        userInfo.setNickname(nickName);
        userInfo.setPassword(password);
        userInfo.registerUser();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "user_id_exists")
    public Boolean user_id_exists(@WebParam(name = "userID") String userID) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(userID);
        return userInfo.isUserIDExsists();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "userID") String userID, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(userID);
        userInfo.setPassword(password);
        return userInfo.login();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNicknameBasedOnUserID")
    public String getNicknameBasedOnUserID(@WebParam(name = "userID") String userID) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID(userID);
        return userInfo.getNicknameBasedOnUserID();
    }
}
