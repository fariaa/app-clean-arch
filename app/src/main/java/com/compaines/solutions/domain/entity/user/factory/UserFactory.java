package com.compaines.solutions.domain.entity.user.factory;

import com.compaines.solutions.domain.entity.User;

public interface UserFactory {
    public User create(String name, String email);
}
