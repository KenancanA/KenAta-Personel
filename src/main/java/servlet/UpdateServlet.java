package servlet;

import DB.DBConnect;
import dao.UserDAOlmpl;
import entity.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id=Integer.parseInt( req.getParameter("kullaniciID"));
        String adsoyad = req.getParameter("adsoyad");
        String tcno = req.getParameter("tcno");
        String email = req.getParameter("email");
        String telnumara = req.getParameter("telnumara");
        String dogumtarihi = req.getParameter("dogumtarihi");
        String departman = req.getParameter("departman");
        String maas = req.getParameter("maas");

        Users users = new Users();
        users.setKullaniciID(id);
        users.setAdsoyad(adsoyad);
        users.setTcno(tcno);
        users.setEmail(email);
        users.setTelnumara(telnumara);
        users.setDogumtarihi(dogumtarihi);
        users.setDepartman(departman);
        users.setMaas(maas);

        UserDAOlmpl dao = new UserDAOlmpl(DBConnect.getConn());
        boolean f = dao.userUpdate(users);

        if (f){
            resp.sendRedirect("personellistesi.jsp");
        }else {
            resp.sendRedirect("index.jsp");
        }
    }
}
