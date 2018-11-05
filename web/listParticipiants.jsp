

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
<div id="form-div">


    <p class="name">
        KATILANLARI LİSTELEMEK
    </p>


</div>

<%
    //Burada nasıl bir yakalşım olucak. Ben olsam dao'da bu işi çözerim. Dal katmanı daodan bağımsız olarak 2 liste döndürür.
    //katılanlar listesi, katılmayanlar listesi.



    for (ParticipiantInfo pi : ParticipiantAppDAL.INSTANCE.getWillAttended()) {
        //dinamik html

        String fmt = "<h1>%s - %s - %s </h1>";
        String result = String.format(fmt, pi.getName(), pi.getEmail(), pi.getRegisterTime().toString());
        out.println(result);
    }


%>
</body>
</html>

