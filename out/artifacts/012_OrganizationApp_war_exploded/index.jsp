<%--
  Created by IntelliJ IDEA.
  User: tugberk
  Date: 4.11.2018
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>İNDEX.JSP</title>


  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

<div style="text-align: center" class="card border-primary mb-3" style="max-width: 18rem;">
  <div class="card-header">ORGANİZATİON APP</div>
  <div class="card-body text-info">
    <h5 class="card-title">HOŞGELDİNİZ</h5>
  </div>
</div>

<div class="row">

  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">KAYIT OL</h5>
        <p class="card-text">Etkinliğimize katılmak isterseniz seçeneği lütfen işaretleyiniz</p>
        <a href="register.jsp" class="btn btn-primary">KAYIT</a>
      </div>
    </div>
  </div>

  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">KATILANLAR</h5>
        <p class="card-text">Kimler katılıyor</p>
        <a href="listParticipiants.jsp" class="btn btn-primary">Katılanlar</a>
      </div>
    </div>
  </div>

</div>

<div class="row">

  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">KATILMAYANLAR</h5>
        <p class="card-text">Kimler Gelmiyor?</p>
        <a href="listNotParticipiants.jsp" class="btn btn-primary">Katılmayanlar</a>
      </div>
    </div>
  </div>

  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">HERKES</h5>
        <p class="card-text">Herkes Burada</p>
        <a href="allParticipiants.jsp" class="btn btn-primary">Herkesi Getir</a>
      </div>
    </div>
  </div>

</div>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</body>
</html>
