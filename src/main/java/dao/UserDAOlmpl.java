package dao;



import entity.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAOlmpl implements  UserDao{
    private Connection conn;

    public UserDAOlmpl(Connection conn) {
        this.conn=conn;
    }

    @Override
    public boolean userRegister(Users users) {
        boolean f=false;
        try {

            String sql="INSERT INTO users(adsoyad,tcno,mailadresi,telnumara,dogumtarihi,departman,maas)  values(?,?,?,?,?,?,?)";

            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setString(1,users.getAdsoyad());
            ps.setString(2,users.getTcno());
            ps.setString(3,users.getEmail());
            ps.setString(4,users.getTelnumara());
            ps.setString(5,users.getDogumtarihi());
            ps.setString(6,users.getDepartman());
            ps.setString(7,users.getMaas());



            int i=ps.executeUpdate();

            if(i==1)
            {
                f=true;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return f;
    }

    public List<Users> getAllUsers() {

        List<Users> list=new ArrayList<Users>();
        Users us = null;
        try {

            String sql="select *from users";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next())
            {
                us=new Users();
                us.setKullaniciID(rs.getInt(1));
                us.setAdsoyad(rs.getString(2));
                us.setTcno(rs.getString(3));
                us.setEmail(rs.getString(4));
                us.setTelnumara(rs.getString(5));
                us.setDogumtarihi(rs.getString(6));
                us.setDepartman(rs.getString(7));
                us.setMaas(rs.getString(8));
                list.add(us);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Users getUsersById(int id) {

        Users us = null;

        try
        {
            String sql="Select * from users where kullaniciID=?";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setInt(1,id);

            ResultSet rs=ps.executeQuery();

            while (rs.next())
            {
                us=new Users();
                us.setKullaniciID(rs.getInt(1));
                us.setAdsoyad(rs.getString(2));
                us.setTcno(rs.getString(3));
                us.setEmail(rs.getString(4));
                us.setTelnumara(rs.getString(5));
                us.setDogumtarihi(rs.getString(6));
                us.setDepartman(rs.getString(7));
                us.setMaas(rs.getString(8));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return us;
    }

    @Override
    public boolean userUpdate(Users users) {
        boolean f=false;
        try {

            String sql="update users set adsoyad=?,tcno=?,mailadresi=?,telnumara=?,dogumtarihi=?,departman=?,maas=? where kullaniciID=?";
            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setString(1,users.getAdsoyad());
            ps.setString(2,users.getTcno());
            ps.setString(3,users.getEmail());
            ps.setString(4,users.getTelnumara());
            ps.setString(5,users.getDogumtarihi());
            ps.setString(6,users.getDepartman());
            ps.setString(7,users.getMaas());
            ps.setInt(8,users.getKullaniciID());

            int i=ps.executeUpdate();

            if(i==1)
            {
                f=true;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return f;
    }

    @Override
    public boolean userDelete(int id) {

        boolean f = false;
        try {
            String sql="delete from users where kullaniciID=?";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setInt(1,id);

            int i=ps.executeUpdate();

            if(i==1)
            {
                f=true;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
