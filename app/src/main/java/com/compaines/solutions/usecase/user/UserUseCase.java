package com.compaines.solutions.usecase.user;

import com.compaines.solutions.domain.entity.User;
import com.compaines.solutions.domain.entity.user.factory.UserCustomFactory;

public class UserUseCase implements UserRegisterRepository {
    @Override
    public User register(String name, String email) {
        UserCustomFactory factory = new UserCustomFactory();
       return factory.create(name, email);
    }
}
