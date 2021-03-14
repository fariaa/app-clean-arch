package com.compaines.solutions.usecase.user;

public class UserCustom implements UserCustomImpl {

    private String name;
    private String email;

    public UserCustom(String name, String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
