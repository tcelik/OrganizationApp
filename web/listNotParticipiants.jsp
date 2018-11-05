

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


    //Burada nasıl bir yakalşım olucak. Ben olsam dao'da bu işi çözerim. Dal katmanı daodan bağımsız olarak 2 liste döndürür.
    //katılanlar listesi, katılmayanlar listesi.
    List<ParticipiantInfo> list = ParticipiantAppDAL.INSTANCE.getAllUser();

    for (ParticipiantInfo pi : list) {
        out.println(!pi.willAttend()? pi : "");
    }

%>
</body>
</html>

