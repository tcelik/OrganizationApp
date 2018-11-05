

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
    <title>Katılanlar</title>
</head>
<body>
<%

    List<ParticipiantInfo> listParticipiants = ParticipiantAppDAL.INSTANCE.getWillNotAttended();

    for (ParticipiantInfo pi : listParticipiants) {
        //dinamik html

        String fmt = "<h1>%s - %s - %s </h1>";
        String result = String.format(fmt, pi.getName(), pi.getEmail(), pi.getRegisterTime().toString());
        out.println(result);
    }
%>
</body>
</html>

