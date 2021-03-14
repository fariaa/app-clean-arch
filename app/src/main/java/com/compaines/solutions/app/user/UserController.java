package com.compaines.solutions.app.user;

import com.compaines.solutions.adapter.user.UserAdapter;
import com.compaines.solutions.adapter.user.port.UserResponseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
public class UserController {

    UserRepository repo;

    @Autowired
    public UserController(UserRepository repo){
        this.repo = repo;
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void userRegister(@RequestBody UserRequest request){
        UserAdapter userAdapter = new UserAdapter();
        userAdapter.save(request, repo);
    }

    @GetMapping("/user")
    public List<UserResponseImpl> teste(){
        UserAdapter userAdapter = new UserAdapter();
        return userAdapter.getAll(repo);
    }

}
