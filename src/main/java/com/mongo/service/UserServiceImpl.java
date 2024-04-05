package com.mongo.service;

public class UserServiceImpl implements UserService{
    @Override
    public String loadUser() {
        return " UserName: abkhuddus , pwd : Abkhuddus@Uzma4";
    }

    public String loadAllusers(){
        return "load all Users Service";
    }
}
