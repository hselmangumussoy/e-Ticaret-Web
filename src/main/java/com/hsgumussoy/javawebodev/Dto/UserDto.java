package com.hsgumussoy.javawebodev.Dto;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private int birthDay;
    private String password;
    private String userName;
    private String userSurname;
    private int tckn;
    private String userCity;
    private String userTelno;

    public UserDto(int userId, int birthDay, String password, String userName, String userSurname, int tckn, String userCity, String userTelno) {
        this.userId = userId;
        this.birthDay = birthDay;
        this.password = password;
        this.userName = userName;
        this.userSurname = userSurname;
        this.tckn = tckn;
        this.userCity = userCity;
        this.userTelno = userTelno;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public int getTckn() {
        return tckn;
    }

    public void setTckn(int tckn) {
        this.tckn = tckn;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserTelno() {
        return userTelno;
    }

    public void setUserTelno(String userTelno) {
        this.userTelno = userTelno;
    }
}
