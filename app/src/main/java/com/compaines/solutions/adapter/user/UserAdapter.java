package com.compaines.solutions.adapter.user;

import com.compaines.solutions.adapter.user.port.UserAdapterImpl;
import com.compaines.solutions.adapter.user.port.UserRepositoryImpl;
import com.compaines.solutions.adapter.user.port.UserRequestImpl;
import com.compaines.solutions.adapter.user.port.UserResponseImpl;

import java.util.List;

public class UserAdapter implements UserAdapterImpl<UserRequestImpl, UserRepositoryImpl> {
    @Override
    public void save(UserRequestImpl userRequest, UserRepositoryImpl userRepository) {
        userRepository.save(userRequest);
    }

    @Override
    public List<UserResponseImpl> getAll(UserRepositoryImpl userRepository) {
        return userRepository.getAll();
    }

}
