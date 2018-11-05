

<%@ page import="org.csystem.organizationapp.dal.ParticipiantAppDAL" %>
<%@ page import="java.util.List" %>
<%@ page import="org.csystem.organizationapp.entity.ParticipiantInfo" %><%--
  Created by IntelliJ IDEA.
  User: tugberk
  Date: 6.11.2018
  Time: 00:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Katılmayanlar</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<div id="form-div">
    <p class="name">
        KATILANMAYANLARI LİSTELEMEK
    </p>
</div>

<%
    //Table tag
    String result = "<table>";

    //Header
    result += "<tr>";

    result += "<th>Name</th>";
    result += "<th>Email</th>";
    result += "<th>WillAttend</th>";
    result += "<th>RegisterTime</th>";
    result += "</tr>";

    //row
    for (ParticipiantInfo pi : ParticipiantAppDAL.INSTANCE.getWillNotAttended()){
        String fmt = "<td>%s</td><td>%s</td><td>%b</td><td>%s</td>";
        result += "<tr>";

        result += String.format(fmt, pi.getName(), pi.getEmail(), pi.willAttend(), pi.getRegisterTime());

        result += "</tr>";
    }

    result += "</table>";


    out.println(result);
%>
</body>
</html>

