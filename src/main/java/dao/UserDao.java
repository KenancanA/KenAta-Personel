package dao;

import entity.Users;

import java.util.List;

public interface UserDao {

    public boolean userRegister (Users users);
    public List<Users> getAllUsers();
    public Users getUsersById(int id);
    public boolean userUpdate(Users users);
    public boolean userDelete(int id);

}
