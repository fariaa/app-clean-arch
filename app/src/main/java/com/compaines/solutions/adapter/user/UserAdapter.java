package com.compaines.solutions.adapter.user;

import com.compaines.solutions.adapter.user.port.UserAdapterImpl;
import com.compaines.solutions.adapter.user.port.UserRepositoryImpl;
import com.compaines.solutions.adapter.user.port.UserRequestImpl;
import com.compaines.solutions.adapter.user.port.UserResponseImpl;
import com.compaines.solutions.domain.entity.User;
import com.compaines.solutions.usecase.user.UserUseCase;

import java.util.List;

public class UserAdapter {
    public static User createUser(UserRequestImpl userRequest) {
        UserUseCase userUseCase = new UserUseCase();
        return userUseCase.register(userRequest.getName(), userRequest.getEmail());
    }

}
