/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import webService.UserService_Service;

/**
 *
 * @author Oshadi
 */
public class RegisterServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/chatapp_ws/UserService.wsdl")
    private UserService_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Getting the parameters from the register.jsp page
        String nickname_text = request.getParameter("nickname_text");
        String login_id_text = request.getParameter("login_id_text");
        String password_text = request.getParameter("password_text");
        String re_enter_password_text = request.getParameter("re_enter_password_text");

        //Checking if the password and the re enter password is the same
        if (!(password_text.equals(re_enter_password_text))) {
            //RequestDispatcher rd=request.getRequestDispatcher("Pages/register.jsp");  
//            request.setAttribute("invlaid_re_enter_password", "1");
//            rd.forward(request, response);
            response.sendRedirect(request.getContextPath() + "/Pages/register.jsp?invlaid_re_enter_password=1");
        } else if(userIdExists(login_id_text)){
            response.sendRedirect(request.getContextPath() + "/Pages/register.jsp?user_id_exists=1");
        }else{
            //inserting the user to the database
            addUser(nickname_text, login_id_text, password_text);
//            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
//            request.setAttribute("Successfull_rgister", "1");
//            rd.forward(request, response);
            response.sendRedirect(request.getContextPath() + "/index.jsp?Successfull_register=1");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void addUser(java.lang.String nickName, java.lang.String loginID, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webService.UserService port = service.getUserServicePort();
        port.addUser(nickName, loginID, password);
    }

    private Boolean userIdExists(java.lang.String userID) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webService.UserService port = service.getUserServicePort();
        return port.userIdExists(userID);
    }

}
