package com.compaines.solutions.domain.entity.user.factory;

import com.compaines.solutions.domain.entity.User;

public class UserCustomFactory implements UserFactory {
    public User create(String name, String email){
        return new User(name, email);
    }
}
