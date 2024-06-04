package servlet;

import DB.DBConnect;
import dao.UserDAOlmpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/sil")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            UserDAOlmpl dao = new UserDAOlmpl(DBConnect.getConn());
            boolean f = dao.userDelete(id);

            if (f){
                resp.sendRedirect("personellistesi.jsp");
            }else {
                resp.sendRedirect("index.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
