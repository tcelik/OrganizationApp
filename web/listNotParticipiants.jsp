

<%@ page import="org.csystem.organizationapp.dal.ParticipiantAppDAL" %>
<%@ page import="java.util.List" %>
<%@ page import="org.csystem.organizationapp.entity.ParticipiantInfo" %>
<%@ page import="org.csystem.organizationapp.util.WebUtil" %><%--
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
    out.println(WebUtil.makeTableStr(ParticipiantAppDAL.INSTANCE.getWillNotAttended()));
%>
</body>
</html>

