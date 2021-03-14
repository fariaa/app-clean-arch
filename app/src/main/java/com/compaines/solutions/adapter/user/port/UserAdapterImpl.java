package com.compaines.solutions.adapter.user.port;

import java.util.List;

public interface UserAdapterImpl<UserRequest, UserRepositoryImpl> {
    public void save(UserRequest userRequest, UserRepositoryImpl userRepository);

    public List<UserResponseImpl> getAll(UserRepositoryImpl userRepository);
}
