package com.compaines.solutions.app.user;

import com.compaines.solutions.adapter.user.port.UserRequestImpl;

public class UserRequest implements UserRequestImpl {

    private String name;
    private String email;

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
