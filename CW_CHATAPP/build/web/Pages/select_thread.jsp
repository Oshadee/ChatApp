<%-- 
    Document   : select_thread
    Created on : Mar 28, 2018, 7:12:27 PM
    Author     : Oshadi
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../Styles/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../Styles/select_thread.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select Thread Page</title>
    </head>
    <body>
        <fieldset class="fieldset_style">
            <form action="../SelectThreadServlet" method="POST">
                <center><h1 class="header_style">HeyYou Select Threads Page</h1></center>
                <div class="div_scroll_style">
                    <div class="row select_thread_table_row">
                        <table class="table-info table_style">
                            <tr>
                                <th class="title_col_width">
                            <center>
                                <h3>TITLE</h3>
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

                            <th class="no_of_entries_col_width">
                            <center>
                                <h3>NO OF ENTRIES</h3>
                            </center>
                            </th>
                            </tr>
                        </table>
                    </div>
                    <div class="row select_thread_table_row">
                        <table id="table" class="table table-hover table_style">
                            <!--Printing the current threads-->
                            <%

                                com.chatapp.services.ChatService_Service service = new com.chatapp.services.ChatService_Service();
                                com.chatapp.services.ChatService port = service.getChatServicePort();
                                // TODO process result here
                                java.util.List<com.chatapp.services.ThreadTypeInfo> result = port.getAllThreads();

                                for (com.chatapp.services.ThreadTypeInfo threadTypeInfo : result) {
                                    String title = threadTypeInfo.getTitle();
                                    String nickname;
                                    webService.UserService_Service serviceUser = new webService.UserService_Service();
                                    webService.UserService portUser = serviceUser.getUserServicePort();
                                    // TODO initialize WS operation arguments here
                                    java.lang.String userID = "";
                                    // TODO process result here
                                    nickname = portUser.getNicknameBasedOnUserID(threadTypeInfo.getCreatedUser().getUserID());

                                    //Getting the no of entries
                                    int noOfEntries = port.getEntriesBasedOnThreadID(threadTypeInfo.getId());
                                    int selectID = threadTypeInfo.getId();
                                    //Getting the last edited
                                    String lastEdited = "";
                                    if (noOfEntries != 0) {
                                        String lastEditedDate = port.getLastEditedEntryBasedOnThreadID(threadTypeInfo.getId()).getAddedDate();
                                        String lastEditedTime = port.getLastEditedEntryBasedOnThreadID(threadTypeInfo.getId()).getAddedTime();
                                        lastEdited = lastEditedDate + " - " + lastEditedTime;
                                    } else {
                                        lastEdited = "None";
                                    }
                            %>

                            <tr class="table-info">
                                <td class="title_col_width">
                            <center>

                                <h3 class="text_align_style"><input class="radio_button_style" type = "radio" name = "rowRadio" value="<%=selectID%>" required/> <%=title%></h3>
                            </center>
                            </td>

                            <td class="last_edited_col_width">
                            <center>
                                <h3><%=lastEdited%></h3>
                            </center>
                            </td>

                            <td class="by_col_width">
                            <center>
                                <h3><%=nickname%></h3>
                            </center>
                            </td>

                            <td class="no_of_entries_col_width">
                            <center>
                                <h3><%=noOfEntries%></h3>
                            </center>
                            </td>

                            </tr>

                            <%
                                }
                            %>
                        </table>
                    </div>
                </div>

                <%
                    String thread_is_not_selected = (String) request.getParameter("thread_is_not_selected");

                    if (thread_is_not_selected != null && thread_is_not_selected.equals("1")) {

                %>
                <center><p class="invlaid_error" style="width: 167%;">Error: You have not selected a thread in order to proceed !</p></center>
                    <%                            }
                    %>

                <div class="button_group_style">
                    <input type="submit" value="Edit Selected" class="btn table-info btn-lg button_style"/>
                </div>
            </form>
            <div class="button_group_style inline">
                <a href="create_new_thread.jsp"><button class="btn table-info btn-lg button_style">Create New</button></a>
            </div>
            <div class="button_group_style inline back_btn_style">
                <a  href="../index.jsp"><button class="btn table-info btn-lg button_style">Back</button></a>
            </div>
        </fieldset>
    </body>
</html>
