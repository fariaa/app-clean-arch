package com.compaines.solutions.app.user;

import com.compaines.solutions.adapter.user.UserAdapter;
import com.compaines.solutions.adapter.user.port.UserAdapterImpl;
import com.compaines.solutions.adapter.user.port.UserRequestImpl;
import com.compaines.solutions.adapter.user.port.UserResponseImpl;
import com.compaines.solutions.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
public class UserRepository implements UserAdapterImpl<UserRequestImpl, UserRepositoryImpl> {

    @Override
    public void save(UserRequestImpl userRequest, UserRepositoryImpl userRepository) {
        User user = UserAdapter.createUser(userRequest);
        userRepository.save(user);
    }

    @Override
    public List<UserResponseImpl> getAll(UserRepositoryImpl userRepository) {
        List<UserResponseImpl> users = new ArrayList<>();
        List<User> all = userRepository.findAll();
        all.stream().forEach(user -> {
            users.add(new UserResponse(user.getName(), user.getEmail()));
        });
        return users;
    }
}
