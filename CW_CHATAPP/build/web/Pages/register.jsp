<%-- 
    Document   : register
    Created on : Mar 28, 2018, 6:56:17 PM
    Author     : Oshadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../Styles/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../Styles/register.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <fieldset class="fieldset_style">
            <form action="../RegisterServlet" method="POST">
                <center><h1 class="header_style">HeyYou Registration Page</h1></center>
                <br/>
                <center>
                    <div class="row register_table_row">
                        <table class="table-info table_style">
                            <tr>
                                <th class="col_width">
                            <center>
                                <h3 class="register_row">Nickname</h3>
                            </center>
                            </th>

                            <th>
                            <center>
                                <input  type="text" required name="nickname_text" id="nickname_text"/>
                            </center>
                            </th>
                            </tr>
                        </table>
                    </div>
                    <div class="row register_table_row">
                        <table class="table-info table_style">
                            <tr>
                                <th class="col_width">
                            <center>
                                <h3 class="register_row">Login ID</h3>
                            </center>
                            </th>

                            <th>
                            <center>
                                <input  type="text" required name="login_id_text" id="login_id_text"/>
                            </center>
                            </th>
                            </tr>
                        </table>
                    </div>
                    <div class="row register_table_row">
                        <table class="table-info table_style">
                            <tr>
                                <th class="col_width">
                            <center>
                                <h3 class="register_row">Password</h3>
                            </center>
                            </th>

                            <th>
                            <center>
                                <input  type="password" required name="password_text" id="password_text"/>
                            </center>
                            </th>
                            </tr>
                        </table>
                    </div>
                    <div class="row register_table_row">
                        <table class="table-info table_style">
                            <tr>
                                <th class="col_width">
                            <center>
                                <h3 class="register_row">Re Enter Password</h3>
                            </center>
                            </th>

                            <th>
                            <center>
                                <input  type="password" required name="re_enter_password_text" id="re_enter_password_text"/>
                            </center>
                            </th>
                            </tr>
                        </table>
                        <%
                            String password_status = (String) request.getParameter("invlaid_re_enter_password");

                            if (password_status!=null && password_status.equals("1")) {

                        %>
                        <center><p class="invlaid_error">Error: Password does not match with the value of the password entry !</p></center>
                            <%                            }
                            %>

                        <%
                            String user_id_exists = (String) request.getParameter("user_id_exists");

                            if (user_id_exists!=null && user_id_exists.equals("1")) {

                        %>
                        <center><p class="invlaid_error" style="width: 167%;">Error: User ID already exists in the system !</p></center>
                            <%                            }
                            %>
                    </div>
                    <div class="button_div_style">
                        <input type="submit" class="btn table-info btn-lg button_style" name="Register" id="Register" value="Register">
                    </div>
                </center>
            </form>
            <div class="button_group_style inline back_btn_style">
                <a  href="../index.jsp"><button class="btn table-info btn-lg button_style">Back</button></a>
            </div>
        </fieldset>


    </body>
</html>
