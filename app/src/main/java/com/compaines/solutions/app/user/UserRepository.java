package com.compaines.solutions.app.user;

import com.compaines.solutions.adapter.user.port.UserRepositoryImpl;
import com.compaines.solutions.adapter.user.port.UserRequestImpl;
import com.compaines.solutions.adapter.user.port.UserResponseImpl;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository implements UserRepositoryImpl {

    static List<String> users = new ArrayList<>();

    @Override
    public void save(UserRequestImpl userRequest) {
        String user = userRequest.getName().concat(" \n ").concat(userRequest.getEmail());
        users.add(user);
    }

    @Override
    public List<UserResponseImpl> getAll() {

        List<UserResponseImpl> userResponseList = new ArrayList<>();
        users.stream().forEach(u -> {
            String[] parts = u.trim().split("\n");
            userResponseList.add( new UserResponse(parts[0], parts[1]));
        });

        return userResponseList;
    }
}
