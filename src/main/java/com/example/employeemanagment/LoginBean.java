package com.example.employeemanagment;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;


@Named
@SessionScoped
public class LoginBean implements Serializable {
    private String username;
    private String password;
    private String message;

    public LoginBean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String login() {

        if(getUsername()!= null && getPassword()!= null){

            if ("admin".equals(username) && "12345".equals(password)) {
                return "index.xhtml?faces-redirect=true";
            }
            else {
                setMessage("Kullanıcı Adı veya Şifre Hatalı!!");
                return null;
            }
        }
        return "";
    }
}

