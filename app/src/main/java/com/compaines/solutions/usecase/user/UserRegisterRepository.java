package com.compaines.solutions.usecase.user;

import com.compaines.solutions.domain.entity.User;

public interface UserRegisterRepository {
    public User register(String name, String email);
}
