<%--
  Created by IntelliJ IDEA.
  User: tugberk
  Date: 5.11.2018
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CSD Form</title>
    <link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>

<div id="form-main">
    <div id="form-div">
        <form action="/login" method="post" class="form" id="form1">

            <p class="name">
                <input name="name" type="text" class="feedback-input" placeholder="Kullanıcı adınız" id="name" />
            </p>

            <p class="email">
                <input name="email" type="text" class="feedback-input" id="email" placeholder="Email" />
            </p>

            <div class="submit">
                <input type="submit" value="Gönder" id="button-blue"/>
                <div class="ease"></div>
            </div>
        </form>
    </div>
</div>

</body>
</html>