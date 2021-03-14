package com.compaines.solutions.adapter.user.port;

import java.util.List;

public interface UserRepositoryImpl {
    void save(UserRequestImpl userRequest);
    List<UserResponseImpl> getAll();
}
