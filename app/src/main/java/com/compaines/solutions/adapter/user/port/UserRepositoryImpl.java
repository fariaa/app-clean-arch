package com.compaines.solutions.adapter.user.port;

import com.compaines.solutions.domain.entity.User;

import java.util.List;

public interface UserRepositoryImpl {
    void save(User user);
    List<UserResponseImpl> getAll();
}
