<%-- 
    Document   : edit_thread
    Created on : Mar 29, 2018, 3:21:41 PM
    Author     : Oshadi
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../Styles/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../Styles/edit_thread.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset class="fieldset_style">
            <form action="../EditThreadServlet" method="POST">
                <center><h1 class="header_style">HeyYou Chat Edit Thread Page</h1></center>


                <div class="div_scroll_style">
                    <div class="row select_thread_table_row">
                        <table class="table-info table_style">
                            <tr>
                                <th class="message_col_width">
                            <center>
                                <h3>Message</h3>
                            </center>
                            </th>

                            <th class="last_edited_col_width">
                            <center>
                                <h3>LAST EDITED</h3>
                            </center>
                            </th>

                            <th class="by_col_width">
                            <center>
                                <h3>BY</h3>
                            </center>
                            </th>

                            </tr>
                        </table>
                    </div>
                    <div class="row select_thread_table_row">
                        <table id="table" class="table table-hover table_style">
                            <!--Getting all the infor for the current thread ID-->
                            <%                    com.chatapp.services.ChatService_Service service = new com.chatapp.services.ChatService_Service();
                                com.chatapp.services.ChatService port = service.getChatServicePort();
                                // TODO initialize WS operation arguments here
                                String selectedID = request.getParameter("selectedThreadID").toString();
                                int threadID = Integer.parseInt(selectedID);

                                // TODO process result here
                                java.util.List<com.chatapp.services.ThreadInfo> result = port.getAllThreadsBasedOnThreadID(threadID);

                                if (result.size() == 0) {
                            %>
                            <h4 class="no_data_error">There are no threads for this chat thread do far</h4>
                            <%
                            } else {

                                for (com.chatapp.services.ThreadInfo threadInfo : result) {
                                    String message = threadInfo.getMessage();
                                    String lastEditted = threadInfo.getAddedDate() + " - " + threadInfo.getAddedTime();

                                    String nickname;
                                    webService.UserService_Service serviceUser = new webService.UserService_Service();
                                    webService.UserService portUser = serviceUser.getUserServicePort();
                                    // TODO initialize WS operation arguments here
                                    java.lang.String userID = "";
                                    // TODO process result here
                                    nickname = portUser.getNicknameBasedOnUserID(threadInfo.getUsserID().getUserID());
                            %>
                            <tr class="table-info">
                                <td class="message_col_width">
                            <center>
                                <h4><%=message%></h4>
                            </center>
                            </td>

                            <td class="last_edited_col_width">
                            <center>
                                <h4><%=lastEditted%></h4>
                            </center>
                            </td>

                            <td class="by_col_width">
                            <center>
                                <h4><%=nickname%></h4>
                            </center>
                            </td>

                            </tr>
                            <%
                                    }
                                }
                            %>
                        </table>
                    </div>
                    <input type="text" name="selectedThreadID" value="<%=selectedID%>" hidden/>
                    <div class="row select_thread_table_row">
                        <table id="table" class="table table-hover table_style">
                            <tr class="table-info">
                                <td class="message_col_width">
                            <center>
                                <input class="textbox_style"  type="text" required name="message_text" id="message_text"/>
                            </center>
                            </td>

                            <td class="last_edited_col_width">
                            <center>
                                <%
                                    //Getting the current date
                                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                                    Date date = new Date();
                                    String dateStr = dateFormat.format(date);

                                    //Getting the current time
                                    DateFormat dateFormatTime = new SimpleDateFormat("HH:mm:ss");
                                    Date dateTime = new Date();
                                    String timeStr = dateFormatTime.format(dateTime);

                                    String lastEditedEnter = dateStr + " - " + timeStr;
                                %>
                                <input class="textbox_style text_thread_created_by" value="<%=lastEditedEnter%>"  type="text" readonly required name="last_edited_text" id="last_edited_text"/>
                            </center>
                            </td>

                            <td class="by_col_width">
                            <center>
                                <%
                                    String nicknameEnter = (String) session.getAttribute("Nickname");
                                %>
                                <input class="textbox_style text_thread_created_by"  type="text" value="<%=nicknameEnter%>" readonly required name="nick_name_text" id="nick_name_text"/>
                            </center>
                            </td>

                            </tr>
                        </table>
                    </div>
                </div>
                <div class="button_div_style">
                    <input type="submit" class="btn table-info btn-lg button_style" name="add" id="add" value="Add">
                </div>
            </form>
            <div class="button_group_style inline back_btn_style">
                <a  href="../index.jsp"><button class="btn table-info btn-lg button_style">Back</button></a>
            </div>           
        </fieldset>


    </body>
</html>
