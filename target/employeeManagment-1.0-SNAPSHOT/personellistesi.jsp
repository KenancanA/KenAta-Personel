<%@ page import="DB.DBConnect" %>
<%@ page import="entity.Users" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.UserDAOlmpl" %><%--
  Created by IntelliJ IDEA.
  User: Kenancan
  Date: 25.05.2024
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personel Takip Sistemi</title>
    <link rel="stylesheet" type="text/css" href="style.css"/>
    <link rel="stylesheet" href="https://kit-free.fontawesome.com/releases/latest/css/free.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>

    <div id="nav-bar">
        <a style="font-weight:bold; letter-spacing:2px;" href="index.xhtml">KenAta Personel</a>
        <a class="sayfa" href="personellistesi.jsp">Personel Listesi</a>
        <a class="sayfa" href="personelekle.jsp">Personel Ekle</a>
    </div>

    <table class="table  table-striped">
        <thead  class="table-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">Adı-Soyadı</th>
            <th scope="col">TC Numarası</th>
            <th scope="col">Email Adresi</th>
            <th scope="col">Telefon Numarası</th>
            <th scope="col">Doğum Tarihi</th>
            <th scope="col">Departmanı</th>
            <th scope="col">Maaşı</th>
            <th scope="col">İşlemler</th>
        </tr>
        </thead>
        <tbody>
        <%
            UserDAOlmpl dao = new UserDAOlmpl(DBConnect.getConn());
            List<Users> list = dao.getAllUsers();
            for (Users us : list) {
        %>
        <tr>
            <td><%=us.getKullaniciID()%></td>
            <td><%=us.getAdsoyad()%></td>
            <td><%=us.getTcno()%></td>
            <td><%=us.getEmail()%></td>
            <td><%=us.getTelnumara()%></td>
            <td><%=us.getDogumtarihi()%></td>
            <td><%=us.getDepartman()%></td>
            <td><%=us.getMaas()%></td>

            <td>
                <ul class="list-inline m-0">
                    <li class="list-inline-item">
                        <a class="btn btn-primary btn-sm rounded-0" data-placement="top" title="Güncelle" type="button" href="personelguncelle.jsp?id=<%=us.getKullaniciID()%>"><i class="fa fa-edit"></i></a>
                    </li>
                    <li class="list-inline-item">
                        <a class="btn btn-danger btn-sm rounded-0"  data-placement="top" title="Sil" type="button" href="sil?id=<%=us.getKullaniciID()%>"><i class="fa fa-trash"></i></a>
                    </li>
                </ul>
            </td>
        </tr>

        <%
            }
        %>

        </tbody>
    </table>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>
