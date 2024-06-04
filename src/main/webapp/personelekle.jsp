<%--
  Created by IntelliJ IDEA.
  User: Kenancan
  Date: 15.05.2024
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personel Takip Sistemi</title>
    <link rel="stylesheet" type="text/css" href="style.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>

    <div id="nav-bar">
        <a style="font-weight:bold; letter-spacing:2px;" href="index.xhtml">KenAta Personel</a>
        <a class="sayfa" href="personellistesi.jsp">Personel Listesi</a>
        <a class="sayfa" href="personelekle.jsp">Personel Ekle</a>
    </div>

    <div class="container  mt-5 p-2">
        <div class="row">
            <div class="col-md-4 offset-md-4" >
                <div class="card">
                    <div class="card-body">
                        <h4 class="text-center">Personel Ekleme Formu</h4>
                        <br>
                        <form action="register" method="post">
                            <div class="form-group">
                                <label for="fullname" class="form-label">Ad-Soyad:</label>
                                <input type="text" class="form-control" id="fullname" required="required" name="adsoyad">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="fullname" class="form-label">TC Numarası:</label>
                                <input type="text" class="form-control"  required="required" name="tcno">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="fullname" class="form-label">E-Mail Adresi:</label>
                                <input type="text" class="form-control"  required="required" name="email">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="fullname" class="form-label">Telefon Numarası:</label>
                                <input type="text" class="form-control"  required="required" name="telnumara">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="fullname" class="form-label">Doğum Tarihi:</label>
                                <input type="text" class="form-control"  required="required" placeholder="01.01.99" name="dogumtarihi">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="fullname" class="form-label">Departman:</label>
                                <input type="text" class="form-control"  required="required" name="departman">
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="fullname" class="form-label">Maaş:</label>
                                <input type="text" class="form-control"  required="required" name="maas">
                            </div>
                            <br>
                            <div class="d-flex justify-content-center">
                                <button style="background-color:deepskyblue; text-align: center;" type="submit" class="btn btn-secondary btn-lg btn-block"> Personel Ekle</button>
                            </div>
                        </form>
                    </div>

                </div>

            </div>
        </div>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>
