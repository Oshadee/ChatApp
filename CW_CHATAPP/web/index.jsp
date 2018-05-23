<%-- 
    Document   : index
    Created on : Mar 28, 2018, 5:37:09 PM
    Author     : Oshadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Styles/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="Styles/index.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <div>
            <fieldset class="fieldset_style">
                <form action="LoginServlet" method="POST">

                    <center><h1 class="header_style">HeyYou Chat Login Page</h1></center>
                    <br/>
                    <center>
                        <div class="row login_table_row">
                            <table class="table-info table_style">
                                <tr>
                                    <th class="col_width">
                                <center>
                                    <h3 class="login_ID_row">Login ID</h3>
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
                        <div class="row login_table_row password_row">
                            <table class="table-info table_style">
                                <tr>
                                    <th class="col_width">
                                <center>
                                    <h3 class="login_ID_row">Password</h3>
                                </center>
                                </th>

                                <th>
                                <center>
                                    <input  type="password" required id="password_text" name="password_text"/>
                                </center>
                                </th>
                                </tr>

                            </table>
                            <%
                                String invalid_login = (String) request.getParameter("invalid_login");

                                if (invalid_login != null && invalid_login.equals("1")) {

                            %>
                            <center><p class="invlaid_error">Error: Password/User ID is incorrect !</p></center>
                                <%                            }
                                %>
                        </div>
                        <div class="button_div_style">
                            <button class="btn table-info btn-lg button_style">Login</button>
                        </div>
                    </center>

                </form>
                <div class="button_div_style">
                    <a href="Pages/register.jsp"><button class="btn table-info btn-lg button_style register_btn_style">Register</button></a>
                </div>


            </fieldset>
        </div>
        <script type="text/javascript">
            <%
                String Successfull_rgister = (String) request.getParameter("Successfull_register");

                if (Successfull_rgister != null && Successfull_rgister.equals("1")) {

            %>
            alert("You have Successfully Registered, Login from here !!");
            <%                }
            %>
        </script> 
    </body>
</html>
