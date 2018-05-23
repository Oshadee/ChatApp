<%-- 
    Document   : create_new_thread
    Created on : Mar 29, 2018, 10:50:26 AM
    Author     : Oshadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../Styles/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../Styles/create_new_thread.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="../CreateNewThreadServlet" method="POST">
            <fieldset class="fieldset_style">
                <center><h1 class="header_style">HeyYou Chat Add Threads Page</h1></center>
                <div class="row create_new_thread_table_row">
                    <table class="table-info table_style">
                        <tr>
                            <th class="thread-title_col_width">
                        <center>
                            <h3>Thread Title</h3>
                        </center>
                        </th>

                        <th class="by_col_width">
                        <center>
                            <h3>Created By</h3>
                        </center>
                        </th>
                        </tr>
                    </table>
                </div>
                <div class="row create_new_thread_table_row">
                    <table class="table-info table_style">
                        <tr>
                            <th class="thread-title_col_width">
                        <center>
                            <input class="textbox_style"  type="text" required name="thread_title_text" id="thread_title_text"/>
                        </center>
                        </th>

                        <th class="by_col_width">
                        <center>
                            <%
                                String nickname = (String) session.getAttribute("Nickname");
                            %>
                            <input class="textbox_style text_thread_created_by"  type="text" required name="created_thread_by" readonly value="<%=nickname%>" id="created_thread_by"/>
                        </center>
                        </th>
                        </tr>
                    </table>
                </div>
                <%
                            String thread_title_exists = (String) request.getParameter("thread_title_exists");

                            if (thread_title_exists!=null && thread_title_exists.equals("1")) {

                %>
                <center><p class="invlaid_error">Error: Thread Title already exists for the created person in the system !</p></center>
                    <%                            }
                    %>
                <div class="row create_new_thread_table_row button_group_style">
                    <input type="submit" class="btn table-info btn-lg button_style" name="CreateThread" id="CreateThread" value="Create Thread">
                </div>
            </fieldset>
        </form>
    </body>
</html>
