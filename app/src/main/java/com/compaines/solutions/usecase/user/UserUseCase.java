package com.compaines.solutions.usecase.user;

import com.compaines.solutions.domain.entity.User;
import com.compaines.solutions.domain.entity.user.factory.UserCustomFactory;

public class UserUseCase implements UserRegisterRepository {
    @Override
    public UserCustomImpl register(String name, String email) {
        UserCustomFactory factory = new UserCustomFactory();
        User user = factory.create(name, email);
        return new UserCustom(user.getName(), user.getEmail());
    }
}
