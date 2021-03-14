package com.compaines.solutions.app.user;

import com.compaines.solutions.adapter.user.port.UserResponseImpl;

public class UserResponse implements UserResponseImpl {

    private String name;
    private String email;

    public UserResponse(String name, String email){
        this.name = name;
        this.email = email;
    }

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
